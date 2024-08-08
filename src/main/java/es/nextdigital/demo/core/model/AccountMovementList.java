package es.nextdigital.demo.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AccountMovementList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-08T19:41:47.671017400+02:00[Europe/Madrid]")

public class AccountMovementList   {
  @JsonProperty("items")
  @Valid
  private List<AccountMovement> items = null;

  @JsonProperty("totalItems")
  private Integer totalItems;

  public AccountMovementList items(List<AccountMovement> items) {
    this.items = items;
    return this;
  }

  public AccountMovementList addItemsItem(AccountMovement itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * an array with the movements of the account
   * @return items
  */
  @ApiModelProperty(value = "an array with the movements of the account")

  @Valid

  public List<AccountMovement> getItems() {
    return items;
  }

  public void setItems(List<AccountMovement> items) {
    this.items = items;
  }

  public AccountMovementList totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * the total number of movements for pagination purposes
   * @return totalItems
  */
  @ApiModelProperty(value = "the total number of movements for pagination purposes")


  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMovementList accountMovementList = (AccountMovementList) o;
    return Objects.equals(this.items, accountMovementList.items) &&
        Objects.equals(this.totalItems, accountMovementList.totalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMovementList {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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

