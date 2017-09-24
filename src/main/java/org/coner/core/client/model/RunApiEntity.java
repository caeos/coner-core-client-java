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
import java.math.BigDecimal;

/**
 * RunApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T22:20:49.725Z")
public class RunApiEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("registrationId")
  private String registrationId = null;

  @SerializedName("sequence")
  private Integer sequence = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("rawTime")
  private BigDecimal rawTime = null;

  @SerializedName("cones")
  private Integer cones = null;

  @SerializedName("didNotFinish")
  private Boolean didNotFinish = null;

  @SerializedName("disqualified")
  private Boolean disqualified = null;

  @SerializedName("rerun")
  private Boolean rerun = null;

  @SerializedName("competitive")
  private Boolean competitive = null;

  public RunApiEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunApiEntity eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RunApiEntity registrationId(String registrationId) {
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

  public RunApiEntity sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public RunApiEntity timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public RunApiEntity rawTime(BigDecimal rawTime) {
    this.rawTime = rawTime;
    return this;
  }

   /**
   * Get rawTime
   * @return rawTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getRawTime() {
    return rawTime;
  }

  public void setRawTime(BigDecimal rawTime) {
    this.rawTime = rawTime;
  }

  public RunApiEntity cones(Integer cones) {
    this.cones = cones;
    return this;
  }

   /**
   * Get cones
   * @return cones
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCones() {
    return cones;
  }

  public void setCones(Integer cones) {
    this.cones = cones;
  }

  public RunApiEntity didNotFinish(Boolean didNotFinish) {
    this.didNotFinish = didNotFinish;
    return this;
  }

   /**
   * Get didNotFinish
   * @return didNotFinish
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDidNotFinish() {
    return didNotFinish;
  }

  public void setDidNotFinish(Boolean didNotFinish) {
    this.didNotFinish = didNotFinish;
  }

  public RunApiEntity disqualified(Boolean disqualified) {
    this.disqualified = disqualified;
    return this;
  }

   /**
   * Get disqualified
   * @return disqualified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDisqualified() {
    return disqualified;
  }

  public void setDisqualified(Boolean disqualified) {
    this.disqualified = disqualified;
  }

  public RunApiEntity rerun(Boolean rerun) {
    this.rerun = rerun;
    return this;
  }

   /**
   * Get rerun
   * @return rerun
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRerun() {
    return rerun;
  }

  public void setRerun(Boolean rerun) {
    this.rerun = rerun;
  }

  public RunApiEntity competitive(Boolean competitive) {
    this.competitive = competitive;
    return this;
  }

   /**
   * Get competitive
   * @return competitive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCompetitive() {
    return competitive;
  }

  public void setCompetitive(Boolean competitive) {
    this.competitive = competitive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunApiEntity runApiEntity = (RunApiEntity) o;
    return Objects.equals(this.id, runApiEntity.id) &&
        Objects.equals(this.eventId, runApiEntity.eventId) &&
        Objects.equals(this.registrationId, runApiEntity.registrationId) &&
        Objects.equals(this.sequence, runApiEntity.sequence) &&
        Objects.equals(this.timestamp, runApiEntity.timestamp) &&
        Objects.equals(this.rawTime, runApiEntity.rawTime) &&
        Objects.equals(this.cones, runApiEntity.cones) &&
        Objects.equals(this.didNotFinish, runApiEntity.didNotFinish) &&
        Objects.equals(this.disqualified, runApiEntity.disqualified) &&
        Objects.equals(this.rerun, runApiEntity.rerun) &&
        Objects.equals(this.competitive, runApiEntity.competitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventId, registrationId, sequence, timestamp, rawTime, cones, didNotFinish, disqualified, rerun, competitive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunApiEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    rawTime: ").append(toIndentedString(rawTime)).append("\n");
    sb.append("    cones: ").append(toIndentedString(cones)).append("\n");
    sb.append("    didNotFinish: ").append(toIndentedString(didNotFinish)).append("\n");
    sb.append("    disqualified: ").append(toIndentedString(disqualified)).append("\n");
    sb.append("    rerun: ").append(toIndentedString(rerun)).append("\n");
    sb.append("    competitive: ").append(toIndentedString(competitive)).append("\n");
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

