package com.shoesclick.bff.site.shoes.entity;

import java.io.Serial;
import java.io.Serializable;

public class Sort implements Serializable {

  @Serial
  private static final long serialVersionUID = -3919151420320594245L;

  private Boolean empty;

  private Boolean sorted;

  private Boolean unsorted;

  public Boolean getEmpty() {
    return empty;
  }

  public Sort setEmpty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  public Boolean getSorted() {
    return sorted;
  }

  public Sort setSorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

  public Boolean getUnsorted() {
    return unsorted;
  }

  public Sort setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }
}

