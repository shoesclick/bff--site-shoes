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

@Schema(name = "OrderItemResponse", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T22:40:33.463755800-03:00[America/Sao_Paulo]")
public class OrderItemResponse {

  private Integer idProduct;

  private String nameProduct;

  private java.math.BigDecimal price;

  public OrderItemResponse idProduct(Integer idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  /**
   * Get idProduct
   * @return idProduct
  */
  
  @Schema(name = "idProduct", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idProduct")
  public Integer getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Integer idProduct) {
    this.idProduct = idProduct;
  }

  public OrderItemResponse nameProduct(String nameProduct) {
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

  public OrderItemResponse price(java.math.BigDecimal price) {
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
    OrderItemResponse orderItemResponse = (OrderItemResponse) o;
    return Objects.equals(this.idProduct, orderItemResponse.idProduct) &&
        Objects.equals(this.nameProduct, orderItemResponse.nameProduct) &&
        Objects.equals(this.price, orderItemResponse.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduct, nameProduct, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemResponse {\n");
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

