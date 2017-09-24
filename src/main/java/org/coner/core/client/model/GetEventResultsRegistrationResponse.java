/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.18
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
import java.util.ArrayList;
import java.util.List;
import org.coner.core.client.model.ScoredRunApiEntity;

/**
 * GetEventResultsRegistrationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T22:20:49.725Z")
public class GetEventResultsRegistrationResponse {
  @SerializedName("registrationId")
  private String registrationId = null;

  @SerializedName("scoredRuns")
  private List<ScoredRunApiEntity> scoredRuns = new ArrayList<ScoredRunApiEntity>();

  @SerializedName("score")
  private ScoredRunApiEntity score = null;

  public GetEventResultsRegistrationResponse registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

   /**
   * Get registrationId
   * @return registrationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public GetEventResultsRegistrationResponse scoredRuns(List<ScoredRunApiEntity> scoredRuns) {
    this.scoredRuns = scoredRuns;
    return this;
  }

  public GetEventResultsRegistrationResponse addScoredRunsItem(ScoredRunApiEntity scoredRunsItem) {
    this.scoredRuns.add(scoredRunsItem);
    return this;
  }

   /**
   * Get scoredRuns
   * @return scoredRuns
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ScoredRunApiEntity> getScoredRuns() {
    return scoredRuns;
  }

  public void setScoredRuns(List<ScoredRunApiEntity> scoredRuns) {
    this.scoredRuns = scoredRuns;
  }

  public GetEventResultsRegistrationResponse score(ScoredRunApiEntity score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public ScoredRunApiEntity getScore() {
    return score;
  }

  public void setScore(ScoredRunApiEntity score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventResultsRegistrationResponse getEventResultsRegistrationResponse = (GetEventResultsRegistrationResponse) o;
    return Objects.equals(this.registrationId, getEventResultsRegistrationResponse.registrationId) &&
        Objects.equals(this.scoredRuns, getEventResultsRegistrationResponse.scoredRuns) &&
        Objects.equals(this.score, getEventResultsRegistrationResponse.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, scoredRuns, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEventResultsRegistrationResponse {\n");
    
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    scoredRuns: ").append(toIndentedString(scoredRuns)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

