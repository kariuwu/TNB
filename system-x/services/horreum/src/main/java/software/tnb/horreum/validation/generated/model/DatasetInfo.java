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
 * DatasetInfo
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class DatasetInfo {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_RUN_ID = "runId";
    public static final String SERIALIZED_NAME_ORDINAL = "ordinal";
    public static final String SERIALIZED_NAME_TEST_ID = "testId";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    @SerializedName(SERIALIZED_NAME_RUN_ID)
    private Integer runId;
    @SerializedName(SERIALIZED_NAME_ORDINAL)
    private Integer ordinal;
    @SerializedName(SERIALIZED_NAME_TEST_ID)
    private Integer testId;

    public DatasetInfo() {
    }

    public DatasetInfo id(Integer id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DatasetInfo runId(Integer runId) {

        this.runId = runId;
        return this;
    }

    /**
     * Get runId
     *
     * @return runId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getRunId() {
        return runId;
    }

    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    public DatasetInfo ordinal(Integer ordinal) {

        this.ordinal = ordinal;
        return this;
    }

    /**
     * Get ordinal
     *
     * @return ordinal
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public DatasetInfo testId(Integer testId) {

        this.testId = testId;
        return this;
    }

    /**
     * Get testId
     *
     * @return testId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatasetInfo datasetInfo = (DatasetInfo) o;
        return Objects.equals(this.id, datasetInfo.id) &&
            Objects.equals(this.runId, datasetInfo.runId) &&
            Objects.equals(this.ordinal, datasetInfo.ordinal) &&
            Objects.equals(this.testId, datasetInfo.testId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, runId, ordinal, testId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasetInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
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

