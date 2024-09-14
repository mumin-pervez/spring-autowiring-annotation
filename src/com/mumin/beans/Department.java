package com.mumin.beans;

import java.util.List;

public class Department {

  private int depId;
  private List<String> departments;

  public void setDepId(int depId) {
    this.depId = depId;
  }

  public void setDepartments(List<String> departments) {
    this.departments = departments;
  }

  @Override
  public String toString() {
    return departments.toString();
  }
}
