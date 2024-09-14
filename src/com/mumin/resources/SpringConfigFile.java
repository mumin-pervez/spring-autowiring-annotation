package com.mumin.resources;

import com.mumin.beans.Address;
import com.mumin.beans.Department;
import com.mumin.beans.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

  @Bean
  public Address createAddressObj() {
    Address addr = new Address();
    addr.setAdId(101);
    addr.setArea("West Dhanmondi");
    addr.setCity("Mohammadpur");
    return addr;
  }

  @Bean
  public Department createDepartmentObj() {
    Department dept = new Department();

    List<String> depList = new ArrayList<>();
    depList.add("Accounting");
    depList.add("HR");
    depList.add("Developer");

    dept.setDepartments(depList);
    return dept;
  }

  @Bean
  public Employee createEmployeeObj() {
    Employee emp = new Employee();
    emp.setEmpId(101);
    emp.setEmpName("Anik Khan");
    // emp.setAddress(createAddressObj()); // Manual Dependency Injection
    return emp;
  }

}
