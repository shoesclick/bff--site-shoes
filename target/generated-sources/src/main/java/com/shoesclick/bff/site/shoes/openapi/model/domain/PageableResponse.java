package com.shoesclick.bff.site.shoes.openapi.model.domain;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.shoesclick.bff.site.shoes.openapi.model.domain.SortResponse;
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

@Schema(name = "PageableResponse", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T22:40:33.463755800-03:00[America/Sao_Paulo]")
public class PageableResponse {

  private Integer pageNumber;

  private Integer pageSize;

  private SortResponse sort;

  private Integer offset;

  private Boolean unpaged;

  private Boolean paged;

  public PageableResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  */
  
  @Schema(name = "pageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PageableResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  
  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PageableResponse sort(SortResponse sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @Valid 
  @Schema(name = "sort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public SortResponse getSort() {
    return sort;
  }

  public void setSort(SortResponse sort) {
    this.sort = sort;
  }

  public PageableResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  
  @Schema(name = "offset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public PageableResponse unpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

  /**
   * Get unpaged
   * @return unpaged
  */
  
  @Schema(name = "unpaged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unpaged")
  public Boolean getUnpaged() {
    return unpaged;
  }

  public void setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
  }

  public PageableResponse paged(Boolean paged) {
    this.paged = paged;
    return this;
  }

  /**
   * Get paged
   * @return paged
  */
  
  @Schema(name = "paged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paged")
  public Boolean getPaged() {
    return paged;
  }

  public void setPaged(Boolean paged) {
    this.paged = paged;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageableResponse pageableResponse = (PageableResponse) o;
    return Objects.equals(this.pageNumber, pageableResponse.pageNumber) &&
        Objects.equals(this.pageSize, pageableResponse.pageSize) &&
        Objects.equals(this.sort, pageableResponse.sort) &&
        Objects.equals(this.offset, pageableResponse.offset) &&
        Objects.equals(this.unpaged, pageableResponse.unpaged) &&
        Objects.equals(this.paged, pageableResponse.paged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, sort, offset, unpaged, paged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableResponse {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
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

