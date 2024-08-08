package es.nextdigital.demo.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * a dictionary object, with an id, a short description and a long description
 */
@ApiModel(description = "a dictionary object, with an id, a short description and a long description")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-08T19:41:47.671017400+02:00[Europe/Madrid]")

public class Dictionary   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("shortDescription")
  private String shortDescription;

  @JsonProperty("longDescription")
  private String longDescription;

  public Dictionary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the id of the type of movement
   * @return id
  */
  @ApiModelProperty(value = "the id of the type of movement")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Dictionary shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * a short description
   * @return shortDescription
  */
  @ApiModelProperty(value = "a short description")


  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Dictionary longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  /**
   * a long longDescription
   * @return longDescription
  */
  @ApiModelProperty(value = "a long longDescription")


  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dictionary dictionary = (Dictionary) o;
    return Objects.equals(this.id, dictionary.id) &&
        Objects.equals(this.shortDescription, dictionary.shortDescription) &&
        Objects.equals(this.longDescription, dictionary.longDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortDescription, longDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dictionary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
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

