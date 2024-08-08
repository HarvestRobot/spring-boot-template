package es.nextdigital.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * the details of a card
 */
@ApiModel(description = "the details of a card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-08T19:41:47.671017400+02:00[Europe/Madrid]")

public class CardDetails   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("number")
  private String number;

  @JsonProperty("isDebit")
  private Boolean isDebit;

  @JsonProperty("bankId")
  private String bankId;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("pincode")
  private byte[] pincode;

  public CardDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the internal id of the card
   * @return id
  */
  @ApiModelProperty(value = "the internal id of the card")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CardDetails number(String number) {
    this.number = number;
    return this;
  }

  /**
   * the number of the card
   * @return number
  */
  @ApiModelProperty(value = "the number of the card")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CardDetails isDebit(Boolean isDebit) {
    this.isDebit = isDebit;
    return this;
  }

  /**
   * if the card is debit (true) or credit (false)
   * @return isDebit
  */
  @ApiModelProperty(value = "if the card is debit (true) or credit (false)")


  public Boolean getIsDebit() {
    return isDebit;
  }

  public void setIsDebit(Boolean isDebit) {
    this.isDebit = isDebit;
  }

  public CardDetails bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * the id of the bank that the card belongs to
   * @return bankId
  */
  @ApiModelProperty(value = "the id of the bank that the card belongs to")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public CardDetails active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * if this card is active (true) or not (false). A deactivated card can't be used.
   * @return active
  */
  @ApiModelProperty(value = "if this card is active (true) or not (false). A deactivated card can't be used.")


  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CardDetails pincode(byte[] pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * the pincode of the card, in format base 64
   * @return pincode
  */
  @ApiModelProperty(value = "the pincode of the card, in format base 64")


  public byte[] getPincode() {
    return pincode;
  }

  public void setPincode(byte[] pincode) {
    this.pincode = pincode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(this.id, cardDetails.id) &&
        Objects.equals(this.number, cardDetails.number) &&
        Objects.equals(this.isDebit, cardDetails.isDebit) &&
        Objects.equals(this.bankId, cardDetails.bankId) &&
        Objects.equals(this.active, cardDetails.active) &&
        Objects.equals(this.pincode, cardDetails.pincode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, isDebit, bankId, active, pincode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    isDebit: ").append(toIndentedString(isDebit)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
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

