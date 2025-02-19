package software.tnb.telegram.service;

import software.tnb.common.account.AccountFactory;
import software.tnb.common.deployment.WithDockerImage;
import software.tnb.common.deployment.WithExternalHostname;
import software.tnb.common.service.Service;
import software.tnb.telegram.account.TelegramAccount;

import java.util.Map;

public abstract class TelegramBotApi implements Service, WithExternalHostname, WithDockerImage {

    private static final String PORT = System.getProperty("telegram-bot-api.port", "8081");
    private static final String VERBOSITY = System.getProperty("telegram-bot-api.verbosity", "9");
    private TelegramAccount account;

    protected TelegramAccount account() {
        if (account == null) {
            account = AccountFactory.create(TelegramAccount.class);
        }
        return account;
    }

    protected Map<String, String> getEnv() {
        return Map.of("TELEGRAM_API_ID", account().getAppId(),
            "TELEGRAM_API_HASH", account().getAppHash());
    }

    protected String[] startupParams() {
        return new String[] {"--local", "--http-port", PORT
            , "--dir", getWorkingDir()
            , "--temp-dir", getUploadDir()
            , "--http-ip-address", "0.0.0.0"
            , "--verbosity", VERBOSITY};
    }

    public int getPort() {
        return Integer.parseInt(PORT);
    }

    @Override
    public String defaultImage() {
        return "quay.io/fuse_qe/telegram-bot-api:latest";
    }

    public abstract String getLogs();

    protected abstract String getWorkingDir();

    protected abstract String getUploadDir();

}
