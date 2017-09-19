/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coner.core.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * ScoredRunApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-19T12:52:09.997Z")
public class ScoredRunApiEntity {
  @SerializedName("runId")
  private String runId = null;

  @SerializedName("rawTimeScored")
  private BigDecimal rawTimeScored = null;

  @SerializedName("handicapTimeScored")
  private BigDecimal handicapTimeScored = null;

  public ScoredRunApiEntity runId(String runId) {
    this.runId = runId;
    return this;
  }

   /**
   * Get runId
   * @return runId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public ScoredRunApiEntity rawTimeScored(BigDecimal rawTimeScored) {
    this.rawTimeScored = rawTimeScored;
    return this;
  }

   /**
   * Get rawTimeScored
   * @return rawTimeScored
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getRawTimeScored() {
    return rawTimeScored;
  }

  public void setRawTimeScored(BigDecimal rawTimeScored) {
    this.rawTimeScored = rawTimeScored;
  }

  public ScoredRunApiEntity handicapTimeScored(BigDecimal handicapTimeScored) {
    this.handicapTimeScored = handicapTimeScored;
    return this;
  }

   /**
   * Get handicapTimeScored
   * @return handicapTimeScored
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getHandicapTimeScored() {
    return handicapTimeScored;
  }

  public void setHandicapTimeScored(BigDecimal handicapTimeScored) {
    this.handicapTimeScored = handicapTimeScored;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoredRunApiEntity scoredRunApiEntity = (ScoredRunApiEntity) o;
    return Objects.equals(this.runId, scoredRunApiEntity.runId) &&
        Objects.equals(this.rawTimeScored, scoredRunApiEntity.rawTimeScored) &&
        Objects.equals(this.handicapTimeScored, scoredRunApiEntity.handicapTimeScored);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, rawTimeScored, handicapTimeScored);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoredRunApiEntity {\n");
    
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    rawTimeScored: ").append(toIndentedString(rawTimeScored)).append("\n");
    sb.append("    handicapTimeScored: ").append(toIndentedString(handicapTimeScored)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

