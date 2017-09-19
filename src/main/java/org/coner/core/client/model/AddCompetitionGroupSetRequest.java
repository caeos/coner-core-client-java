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
import java.util.ArrayList;
import java.util.List;

/**
 * AddCompetitionGroupSetRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-19T12:52:09.997Z")
public class AddCompetitionGroupSetRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("competitionGroupIds")
  private List<String> competitionGroupIds = new ArrayList<String>();

  public AddCompetitionGroupSetRequest name(String name) {
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

  public AddCompetitionGroupSetRequest competitionGroupIds(List<String> competitionGroupIds) {
    this.competitionGroupIds = competitionGroupIds;
    return this;
  }

  public AddCompetitionGroupSetRequest addCompetitionGroupIdsItem(String competitionGroupIdsItem) {
    this.competitionGroupIds.add(competitionGroupIdsItem);
    return this;
  }

   /**
   * Get competitionGroupIds
   * @return competitionGroupIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCompetitionGroupIds() {
    return competitionGroupIds;
  }

  public void setCompetitionGroupIds(List<String> competitionGroupIds) {
    this.competitionGroupIds = competitionGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCompetitionGroupSetRequest addCompetitionGroupSetRequest = (AddCompetitionGroupSetRequest) o;
    return Objects.equals(this.name, addCompetitionGroupSetRequest.name) &&
        Objects.equals(this.competitionGroupIds, addCompetitionGroupSetRequest.competitionGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, competitionGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCompetitionGroupSetRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    competitionGroupIds: ").append(toIndentedString(competitionGroupIds)).append("\n");
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

