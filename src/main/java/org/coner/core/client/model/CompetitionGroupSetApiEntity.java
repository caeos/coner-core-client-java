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
import org.coner.core.client.model.CompetitionGroupApiEntity;

/**
 * CompetitionGroupSetApiEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-24T22:20:49.725Z")
public class CompetitionGroupSetApiEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("competitionGroups")
  private List<CompetitionGroupApiEntity> competitionGroups = new ArrayList<CompetitionGroupApiEntity>();

  public CompetitionGroupSetApiEntity id(String id) {
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

  public CompetitionGroupSetApiEntity name(String name) {
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

  public CompetitionGroupSetApiEntity competitionGroups(List<CompetitionGroupApiEntity> competitionGroups) {
    this.competitionGroups = competitionGroups;
    return this;
  }

  public CompetitionGroupSetApiEntity addCompetitionGroupsItem(CompetitionGroupApiEntity competitionGroupsItem) {
    this.competitionGroups.add(competitionGroupsItem);
    return this;
  }

   /**
   * Get competitionGroups
   * @return competitionGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CompetitionGroupApiEntity> getCompetitionGroups() {
    return competitionGroups;
  }

  public void setCompetitionGroups(List<CompetitionGroupApiEntity> competitionGroups) {
    this.competitionGroups = competitionGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitionGroupSetApiEntity competitionGroupSetApiEntity = (CompetitionGroupSetApiEntity) o;
    return Objects.equals(this.id, competitionGroupSetApiEntity.id) &&
        Objects.equals(this.name, competitionGroupSetApiEntity.name) &&
        Objects.equals(this.competitionGroups, competitionGroupSetApiEntity.competitionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, competitionGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionGroupSetApiEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    competitionGroups: ").append(toIndentedString(competitionGroups)).append("\n");
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

