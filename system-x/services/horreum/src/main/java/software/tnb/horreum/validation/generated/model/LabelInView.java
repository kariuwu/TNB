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
 * LabelInView
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class LabelInView {
    public static final String SERIALIZED_NAME_TYPE = "type";
    public static final String SERIALIZED_NAME_TEST_ID = "testId";
    public static final String SERIALIZED_NAME_TEST_NAME = "testName";
    public static final String SERIALIZED_NAME_VIEW_ID = "viewId";
    public static final String SERIALIZED_NAME_VIEW_NAME = "viewName";
    public static final String SERIALIZED_NAME_COMPONENT_ID = "componentId";
    public static final String SERIALIZED_NAME_HEADER = "header";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;
    @SerializedName(SERIALIZED_NAME_TEST_ID)
    private Integer testId;
    @SerializedName(SERIALIZED_NAME_TEST_NAME)
    private String testName;
    @SerializedName(SERIALIZED_NAME_VIEW_ID)
    private Integer viewId;
    @SerializedName(SERIALIZED_NAME_VIEW_NAME)
    private String viewName;
    @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
    private Integer componentId;
    @SerializedName(SERIALIZED_NAME_HEADER)
    private String header;

    public LabelInView() {
    }

    public LabelInView type(String type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LabelInView testId(Integer testId) {

        this.testId = testId;
        return this;
    }

    /**
     * Get testId
     *
     * @return testId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public LabelInView testName(String testName) {

        this.testName = testName;
        return this;
    }

    /**
     * Get testName
     *
     * @return testName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public LabelInView viewId(Integer viewId) {

        this.viewId = viewId;
        return this;
    }

    /**
     * Get viewId
     *
     * @return viewId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public LabelInView viewName(String viewName) {

        this.viewName = viewName;
        return this;
    }

    /**
     * Get viewName
     *
     * @return viewName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public LabelInView componentId(Integer componentId) {

        this.componentId = componentId;
        return this;
    }

    /**
     * Get componentId
     *
     * @return componentId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public LabelInView header(String header) {

        this.header = header;
        return this;
    }

    /**
     * Get header
     *
     * @return header
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelInView labelInView = (LabelInView) o;
        return Objects.equals(this.type, labelInView.type) &&
            Objects.equals(this.testId, labelInView.testId) &&
            Objects.equals(this.testName, labelInView.testName) &&
            Objects.equals(this.viewId, labelInView.viewId) &&
            Objects.equals(this.viewName, labelInView.viewName) &&
            Objects.equals(this.componentId, labelInView.componentId) &&
            Objects.equals(this.header, labelInView.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, testId, testName, viewId, viewName, componentId, header);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelInView {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
        sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
        sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

