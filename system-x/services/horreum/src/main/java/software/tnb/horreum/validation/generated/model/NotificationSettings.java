/*
 * Horreum API
 * Horreum data repository API
 *
 * The version of the OpenAPI document: 0.1-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.tnb.horreum.validation.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationSettings
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class NotificationSettings {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_NAME = "name";
    public static final String SERIALIZED_NAME_IS_TEAM = "isTeam";
    public static final String SERIALIZED_NAME_METHOD = "method";
    public static final String SERIALIZED_NAME_DATA = "data";
    public static final String SERIALIZED_NAME_DISABLED = "disabled";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    @SerializedName(SERIALIZED_NAME_IS_TEAM)
    private Boolean isTeam;
    @SerializedName(SERIALIZED_NAME_METHOD)
    private String method;
    @SerializedName(SERIALIZED_NAME_DATA)
    private String data;
    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public NotificationSettings() {
    }

    public NotificationSettings id(Integer id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NotificationSettings name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotificationSettings isTeam(Boolean isTeam) {

        this.isTeam = isTeam;
        return this;
    }

    /**
     * Get isTeam
     *
     * @return isTeam
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Boolean getIsTeam() {
        return isTeam;
    }

    public void setIsTeam(Boolean isTeam) {
        this.isTeam = isTeam;
    }

    public NotificationSettings method(String method) {

        this.method = method;
        return this;
    }

    /**
     * Get method
     *
     * @return method
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public NotificationSettings data(String data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NotificationSettings disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationSettings notificationSettings = (NotificationSettings) o;
        return Objects.equals(this.id, notificationSettings.id) &&
            Objects.equals(this.name, notificationSettings.name) &&
            Objects.equals(this.isTeam, notificationSettings.isTeam) &&
            Objects.equals(this.method, notificationSettings.method) &&
            Objects.equals(this.data, notificationSettings.data) &&
            Objects.equals(this.disabled, notificationSettings.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isTeam, method, data, disabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationSettings {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isTeam: ").append(toIndentedString(isTeam)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

