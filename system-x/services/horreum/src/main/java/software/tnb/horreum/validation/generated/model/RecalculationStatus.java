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
 * RecalculationStatus
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class RecalculationStatus {
    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
    public static final String SERIALIZED_NAME_TOTAL_RUNS = "totalRuns";
    public static final String SERIALIZED_NAME_FINISHED = "finished";
    public static final String SERIALIZED_NAME_DATASETS = "datasets";
    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    private Long timestamp;
    @SerializedName(SERIALIZED_NAME_TOTAL_RUNS)
    private Long totalRuns;
    @SerializedName(SERIALIZED_NAME_FINISHED)
    private Long finished;
    @SerializedName(SERIALIZED_NAME_DATASETS)
    private Long datasets;

    public RecalculationStatus() {
    }

    public RecalculationStatus timestamp(Long timestamp) {

        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public RecalculationStatus totalRuns(Long totalRuns) {

        this.totalRuns = totalRuns;
        return this;
    }

    /**
     * Get totalRuns
     *
     * @return totalRuns
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Long getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Long totalRuns) {
        this.totalRuns = totalRuns;
    }

    public RecalculationStatus finished(Long finished) {

        this.finished = finished;
        return this;
    }

    /**
     * Get finished
     *
     * @return finished
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Long getFinished() {
        return finished;
    }

    public void setFinished(Long finished) {
        this.finished = finished;
    }

    public RecalculationStatus datasets(Long datasets) {

        this.datasets = datasets;
        return this;
    }

    /**
     * Get datasets
     *
     * @return datasets
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Long getDatasets() {
        return datasets;
    }

    public void setDatasets(Long datasets) {
        this.datasets = datasets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecalculationStatus recalculationStatus = (RecalculationStatus) o;
        return Objects.equals(this.timestamp, recalculationStatus.timestamp) &&
            Objects.equals(this.totalRuns, recalculationStatus.totalRuns) &&
            Objects.equals(this.finished, recalculationStatus.finished) &&
            Objects.equals(this.datasets, recalculationStatus.datasets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, totalRuns, finished, datasets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecalculationStatus {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    totalRuns: ").append(toIndentedString(totalRuns)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
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

