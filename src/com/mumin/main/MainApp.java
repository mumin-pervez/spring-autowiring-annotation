package com.mumin.main;

import com.mumin.beans.Employee;
import com.mumin.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    Employee employee = context.getBean(Employee.class);
    employee.displayInfo();
  }

}
