package com.shoesclick.bff.site.shoes.openapi.model.domain;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.shoesclick.bff.site.shoes.openapi.model.domain.OrderItemRequest;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
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

@Schema(name = "OrderRequest", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T11:02:37.025393900-03:00[America/Sao_Paulo]")
public class OrderRequest {

  private Integer id;

  private Integer status;

  private Integer idCustomer;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime createdAt;

  private String paymentType;

  @Valid
  private Map<String, Object> paymentParams = new HashMap<>();

  @Valid
  private List<@Valid OrderItemRequest> orderItems;

  public OrderRequest id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderRequest status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public OrderRequest idCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
    return this;
  }

  /**
   * Get idCustomer
   * @return idCustomer
  */
  
  @Schema(name = "idCustomer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idCustomer")
  public Integer getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
  }

  public OrderRequest createdAt(java.time.LocalDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public java.time.LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.time.LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OrderRequest paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  
  @Schema(name = "paymentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentType")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public OrderRequest paymentParams(Map<String, Object> paymentParams) {
    this.paymentParams = paymentParams;
    return this;
  }

  public OrderRequest putPaymentParamsItem(String key, Object paymentParamsItem) {
    if (this.paymentParams == null) {
      this.paymentParams = new HashMap<>();
    }
    this.paymentParams.put(key, paymentParamsItem);
    return this;
  }

  /**
   * 
   * @return paymentParams
  */
  
  @Schema(name = "paymentParams", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentParams")
  public Map<String, Object> getPaymentParams() {
    return paymentParams;
  }

  public void setPaymentParams(Map<String, Object> paymentParams) {
    this.paymentParams = paymentParams;
  }

  public OrderRequest orderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public OrderRequest addOrderItemsItem(OrderItemRequest orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
  */
  @Valid 
  @Schema(name = "orderItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderItems")
  public List<@Valid OrderItemRequest> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRequest orderRequest = (OrderRequest) o;
    return Objects.equals(this.id, orderRequest.id) &&
        Objects.equals(this.status, orderRequest.status) &&
        Objects.equals(this.idCustomer, orderRequest.idCustomer) &&
        Objects.equals(this.createdAt, orderRequest.createdAt) &&
        Objects.equals(this.paymentType, orderRequest.paymentType) &&
        Objects.equals(this.paymentParams, orderRequest.paymentParams) &&
        Objects.equals(this.orderItems, orderRequest.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, idCustomer, createdAt, paymentType, paymentParams, orderItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idCustomer: ").append(toIndentedString(idCustomer)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentParams: ").append(toIndentedString(paymentParams)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
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

