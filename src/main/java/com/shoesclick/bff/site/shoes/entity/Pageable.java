package com.shoesclick.bff.site.shoes.entity;

import java.io.Serial;
import java.io.Serializable;

public class Pageable implements Serializable {

  @Serial
  private static final long serialVersionUID = -5420971654891230009L;
  private Integer pageNumber;

  private Integer pageSize;

  private Sort sort;

  private Integer offset;

  private Boolean unpaged;

  private Boolean paged;

  public Integer getPageNumber() {
    return pageNumber;
  }

  public Pageable setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public Pageable setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Sort getSort() {
    return sort;
  }

  public Pageable setSort(Sort sort) {
    this.sort = sort;
    return this;
  }

  public Integer getOffset() {
    return offset;
  }

  public Pageable setOffset(Integer offset) {
    this.offset = offset;
    return this;
  }

  public Boolean getUnpaged() {
    return unpaged;
  }

  public Pageable setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

  public Boolean getPaged() {
    return paged;
  }

  public Pageable setPaged(Boolean paged) {
    this.paged = paged;
    return this;
  }
}

