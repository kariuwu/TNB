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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * TestListing
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class TestListing {
    public static final String SERIALIZED_NAME_TESTS = "tests";
    @SerializedName(SERIALIZED_NAME_TESTS)
    private List<TestSummary> tests = null;

    public TestListing() {
    }

    public TestListing tests(List<TestSummary> tests) {

        this.tests = tests;
        return this;
    }

    public TestListing addTestsItem(TestSummary testsItem) {
        if (this.tests == null) {
            this.tests = new ArrayList<TestSummary>();
        }
        this.tests.add(testsItem);
        return this;
    }

    /**
     * Get tests
     *
     * @return tests
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<TestSummary> getTests() {
        return tests;
    }

    public void setTests(List<TestSummary> tests) {
        this.tests = tests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestListing testListing = (TestListing) o;
        return Objects.equals(this.tests, testListing.tests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestListing {\n");
        sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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

