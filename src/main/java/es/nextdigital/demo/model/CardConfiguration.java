package es.nextdigital.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * the configuration of a card
 */
@ApiModel(description = "the configuration of a card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-08T19:41:47.671017400+02:00[Europe/Madrid]")

public class CardConfiguration   {
  @JsonProperty("withdrawLimit")
  private Integer withdrawLimit;

  public CardConfiguration withdrawLimit(Integer withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
    return this;
  }

  /**
   * the limit of money the card can withdraw
   * @return withdrawLimit
  */
  @ApiModelProperty(value = "the limit of money the card can withdraw")


  public Integer getWithdrawLimit() {
    return withdrawLimit;
  }

  public void setWithdrawLimit(Integer withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardConfiguration cardConfiguration = (CardConfiguration) o;
    return Objects.equals(this.withdrawLimit, cardConfiguration.withdrawLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardConfiguration {\n");
    
    sb.append("    withdrawLimit: ").append(toIndentedString(withdrawLimit)).append("\n");
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

