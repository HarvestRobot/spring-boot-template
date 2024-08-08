package es.nextdigital.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * AccountMovement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-08T19:41:47.671017400+02:00[Europe/Madrid]")

public class AccountMovement   {
  @JsonProperty("type")
  private Dictionary type;

  @JsonProperty("timestamp")
  private String timestamp;

  public AccountMovement type(Dictionary type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public Dictionary getType() {
    return type;
  }

  public void setType(Dictionary type) {
    this.type = type;
  }

  public AccountMovement timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * the timestamp of the movement
   * @return timestamp
  */
  @ApiModelProperty(value = "the timestamp of the movement")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMovement accountMovement = (AccountMovement) o;
    return Objects.equals(this.type, accountMovement.type) &&
        Objects.equals(this.timestamp, accountMovement.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMovement {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

