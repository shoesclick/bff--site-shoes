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

@Schema(name = "SortResponse", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T22:40:33.463755800-03:00[America/Sao_Paulo]")
public class SortResponse {

  private Boolean empty;

  private Boolean sorted;

  private Boolean unsorted;

  public SortResponse empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
  */
  
  @Schema(name = "empty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public SortResponse sorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

  /**
   * Get sorted
   * @return sorted
  */
  
  @Schema(name = "sorted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorted")
  public Boolean getSorted() {
    return sorted;
  }

  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }

  public SortResponse unsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }

  /**
   * Get unsorted
   * @return unsorted
  */
  
  @Schema(name = "unsorted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unsorted")
  public Boolean getUnsorted() {
    return unsorted;
  }

  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortResponse sortResponse = (SortResponse) o;
    return Objects.equals(this.empty, sortResponse.empty) &&
        Objects.equals(this.sorted, sortResponse.sorted) &&
        Objects.equals(this.unsorted, sortResponse.unsorted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, sorted, unsorted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortResponse {\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
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

