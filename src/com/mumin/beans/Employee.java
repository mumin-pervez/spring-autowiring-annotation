package com.mumin.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

  private int empId;
  private String empName;
  @Autowired  // Injection of DI using @Autowired annotation
  private Address address; // Dependency of Address class
  @Autowired
  private Department department;

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public void displayInfo() {
    System.out.println("Id : " + empId);
    System.out.println("Name : " + empName);
    System.out.println("Address : " + address);
    System.out.println("Department: " + department);
  }
}
