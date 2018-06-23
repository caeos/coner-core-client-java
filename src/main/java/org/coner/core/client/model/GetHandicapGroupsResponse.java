/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.24
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
import org.coner.core.client.model.HandicapGroupApiEntity;

/**
 * GetHandicapGroupsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T19:03:18.365-04:00")
public class GetHandicapGroupsResponse {
  @SerializedName("entities")
  private List<HandicapGroupApiEntity> entities = new ArrayList<HandicapGroupApiEntity>();

  public GetHandicapGroupsResponse entities(List<HandicapGroupApiEntity> entities) {
    this.entities = entities;
    return this;
  }

  public GetHandicapGroupsResponse addEntitiesItem(HandicapGroupApiEntity entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<HandicapGroupApiEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<HandicapGroupApiEntity> entities) {
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
    GetHandicapGroupsResponse getHandicapGroupsResponse = (GetHandicapGroupsResponse) o;
    return Objects.equals(this.entities, getHandicapGroupsResponse.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHandicapGroupsResponse {\n");
    
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

