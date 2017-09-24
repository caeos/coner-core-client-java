/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.17
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
 * CompetitionGroupApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T22:07:24.418Z")
public class CompetitionGroupApiEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("factor")
  private BigDecimal factor = null;

  @SerializedName("grouping")
  private Boolean grouping = null;

  @SerializedName("resultTimeType")
  private String resultTimeType = null;

  public CompetitionGroupApiEntity id(String id) {
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

  public CompetitionGroupApiEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompetitionGroupApiEntity factor(BigDecimal factor) {
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * minimum: 0.0
   * maximum: 1.0
   * @return factor
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BigDecimal getFactor() {
    return factor;
  }

  public void setFactor(BigDecimal factor) {
    this.factor = factor;
  }

  public CompetitionGroupApiEntity grouping(Boolean grouping) {
    this.grouping = grouping;
    return this;
  }

   /**
   * Get grouping
   * @return grouping
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getGrouping() {
    return grouping;
  }

  public void setGrouping(Boolean grouping) {
    this.grouping = grouping;
  }

  public CompetitionGroupApiEntity resultTimeType(String resultTimeType) {
    this.resultTimeType = resultTimeType;
    return this;
  }

   /**
   * Get resultTimeType
   * @return resultTimeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResultTimeType() {
    return resultTimeType;
  }

  public void setResultTimeType(String resultTimeType) {
    this.resultTimeType = resultTimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitionGroupApiEntity competitionGroupApiEntity = (CompetitionGroupApiEntity) o;
    return Objects.equals(this.id, competitionGroupApiEntity.id) &&
        Objects.equals(this.name, competitionGroupApiEntity.name) &&
        Objects.equals(this.factor, competitionGroupApiEntity.factor) &&
        Objects.equals(this.grouping, competitionGroupApiEntity.grouping) &&
        Objects.equals(this.resultTimeType, competitionGroupApiEntity.resultTimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, factor, grouping, resultTimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionGroupApiEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    resultTimeType: ").append(toIndentedString(resultTimeType)).append("\n");
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

