package com.shoesclick.bff.site.shoes.openapi.model.domain;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 
 */

@Schema(name = "OrderItemRequest", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T11:02:37.025393900-03:00[America/Sao_Paulo]")
public class OrderItemRequest {

  private java.lang.Long idProduct;

  private String nameProduct;

  private java.math.BigDecimal price;

  public OrderItemRequest idProduct(java.lang.Long idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  /**
   * Get idProduct
   * @return idProduct
  */
  @Valid 
  @Schema(name = "idProduct", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idProduct")
  public java.lang.Long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(java.lang.Long idProduct) {
    this.idProduct = idProduct;
  }

  public OrderItemRequest nameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
    return this;
  }

  /**
   * 
   * @return nameProduct
  */
  
  @Schema(name = "nameProduct", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameProduct")
  public String getNameProduct() {
    return nameProduct;
  }

  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }

  public OrderItemRequest price(java.math.BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * 
   * @return price
  */
  @Valid 
  @Schema(name = "price", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public java.math.BigDecimal getPrice() {
    return price;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemRequest orderItemRequest = (OrderItemRequest) o;
    return Objects.equals(this.idProduct, orderItemRequest.idProduct) &&
        Objects.equals(this.nameProduct, orderItemRequest.nameProduct) &&
        Objects.equals(this.price, orderItemRequest.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduct, nameProduct, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemRequest {\n");
    sb.append("    idProduct: ").append(toIndentedString(idProduct)).append("\n");
    sb.append("    nameProduct: ").append(toIndentedString(nameProduct)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

