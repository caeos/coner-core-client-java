/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.12
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
 * AddHandicapGroupSetRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-19T13:13:04.562Z")
public class AddHandicapGroupSetRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("handicapGroupIds")
  private List<String> handicapGroupIds = new ArrayList<String>();

  public AddHandicapGroupSetRequest name(String name) {
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

  public AddHandicapGroupSetRequest handicapGroupIds(List<String> handicapGroupIds) {
    this.handicapGroupIds = handicapGroupIds;
    return this;
  }

  public AddHandicapGroupSetRequest addHandicapGroupIdsItem(String handicapGroupIdsItem) {
    this.handicapGroupIds.add(handicapGroupIdsItem);
    return this;
  }

   /**
   * Get handicapGroupIds
   * @return handicapGroupIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getHandicapGroupIds() {
    return handicapGroupIds;
  }

  public void setHandicapGroupIds(List<String> handicapGroupIds) {
    this.handicapGroupIds = handicapGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHandicapGroupSetRequest addHandicapGroupSetRequest = (AddHandicapGroupSetRequest) o;
    return Objects.equals(this.name, addHandicapGroupSetRequest.name) &&
        Objects.equals(this.handicapGroupIds, addHandicapGroupSetRequest.handicapGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handicapGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHandicapGroupSetRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    handicapGroupIds: ").append(toIndentedString(handicapGroupIds)).append("\n");
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

