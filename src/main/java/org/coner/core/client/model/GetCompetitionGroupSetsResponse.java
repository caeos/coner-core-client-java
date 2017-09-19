/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.10
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
import org.coner.core.client.model.CompetitionGroupSetApiEntity;

/**
 * GetCompetitionGroupSetsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-19T12:48:05.472Z")
public class GetCompetitionGroupSetsResponse {
  @SerializedName("entities")
  private List<CompetitionGroupSetApiEntity> entities = new ArrayList<CompetitionGroupSetApiEntity>();

  public GetCompetitionGroupSetsResponse entities(List<CompetitionGroupSetApiEntity> entities) {
    this.entities = entities;
    return this;
  }

  public GetCompetitionGroupSetsResponse addEntitiesItem(CompetitionGroupSetApiEntity entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CompetitionGroupSetApiEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<CompetitionGroupSetApiEntity> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCompetitionGroupSetsResponse getCompetitionGroupSetsResponse = (GetCompetitionGroupSetsResponse) o;
    return Objects.equals(this.entities, getCompetitionGroupSetsResponse.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCompetitionGroupSetsResponse {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

