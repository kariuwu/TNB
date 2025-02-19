package software.tnb.google.cloud.pubsub.validation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.api.core.ApiFuture;
import com.google.api.gax.core.CredentialsProvider;
import com.google.cloud.pubsub.v1.AckReplyConsumer;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.cloud.pubsub.v1.Subscriber;
import com.google.cloud.pubsub.v1.SubscriptionAdminClient;
import com.google.cloud.pubsub.v1.TopicAdminClient;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.PushConfig;
import com.google.pubsub.v1.Subscription;
import com.google.pubsub.v1.SubscriptionName;
import com.google.pubsub.v1.Topic;
import com.google.pubsub.v1.TopicName;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PubSubValidation {

    private static final Logger LOG = LoggerFactory.getLogger(PubSubValidation.class);

    private TopicAdminClient topicAdminClient;
    private SubscriptionAdminClient subscriptionAdminClient;
    private String projectId;
    private CredentialsProvider credsProvider;

    public PubSubValidation(TopicAdminClient topicAdminClient, SubscriptionAdminClient subscriptionAdminClient, CredentialsProvider credsProvider,
        String projectId) {
        this.topicAdminClient = topicAdminClient;
        this.subscriptionAdminClient = subscriptionAdminClient;
        this.projectId = projectId;
        this.credsProvider = credsProvider;
    }

    public Topic createNewTopic(String topicId) {
        Topic topic = topicAdminClient.createTopic(TopicName.of(projectId, topicId));
        LOG.info("Created google pubsub topic: " + topic.getName());
        return topic;
    }

    public void deleteTopic(String topicId) {
        topicAdminClient.deleteTopic(TopicName.of(projectId, topicId));
        LOG.info("Deleted google pubsub topic: " + topicId);
    }

    public Subscription createNewSubscription(String subscriptionId, String topicId) {
        SubscriptionName subscriptionName = SubscriptionName.of(projectId, subscriptionId);
        TopicName topicName = TopicName.of(projectId, topicId);

        Subscription subscription = subscriptionAdminClient.createSubscription(subscriptionName, topicName, PushConfig.getDefaultInstance(), 10);
        LOG.info("Created google pubsub subscription: " + subscription.getName());
        return subscription;
    }

    public void deleteSubscription(String subscriptionId) {
        subscriptionAdminClient.deleteSubscription(SubscriptionName.of(projectId, subscriptionId));
        LOG.info("Deleted google pubsub subscription: " + subscriptionId);
    }

    public void publishMessage(String topicId, String message) {
        Publisher publisher = null;
        try {
            // Create a publisher instance with default settings bound to the topic
            publisher = Publisher.newBuilder(TopicName.of(projectId, topicId)).setCredentialsProvider(credsProvider).build();

            ByteString data = ByteString.copyFromUtf8(message);
            PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).build();

            ApiFuture<String> messageIdFuture = publisher.publish(pubsubMessage);
            if (!messageIdFuture.get().isEmpty()) {
                LOG.info("Published message {} into topic {}", message, topicId);
            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to publish message to topic", e);
        } finally {
            if (publisher != null) {
                // When finished with the publisher, shutdown to free up resources.
                publisher.shutdown();
                try {
                    publisher.awaitTermination(1, TimeUnit.MINUTES);
                } catch (InterruptedException e) {
                    throw new RuntimeException("Unable to terminate publisher", e);
                }
            }
        }
    }

    /**
     * will listen on the specified subscription for specified duration of seconds
     *
     * @param seconds
     * @param subscriptionId
     * @return
     */
    public List<PubsubMessage> receiveMessageFor(int seconds, String subscriptionId) {
        ProjectSubscriptionName subscriptionName =
            ProjectSubscriptionName.of(projectId, subscriptionId);

        List<PubsubMessage> messageList = new ArrayList<>();

        // Instantiate an asynchronous message receiver.
        MessageReceiver receiver =
            (PubsubMessage message, AckReplyConsumer consumer) -> {
                // Handle incoming message, then ack the received message.
                messageList.add(message);
                consumer.ack();
            };

        Subscriber subscriber = null;
        try {
            subscriber = Subscriber.newBuilder(subscriptionName, receiver).setCredentialsProvider(credsProvider).build();
            // Start the subscriber.
            subscriber.startAsync().awaitRunning();
            LOG.info("Listening for messages on {}", subscriptionName.toString());
            subscriber.awaitTerminated(seconds, TimeUnit.SECONDS);
        } catch (TimeoutException timeoutException) {
            subscriber.stopAsync();
        }

        return messageList;
    }
}
