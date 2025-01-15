package com.java.stream.interview.employee.domain_related.data;

import com.java.stream.interview.employee.domain_related.Employee;

import static com.java.stream.interview.employee.domain_related.Department.*;
import static com.java.stream.interview.employee.domain_related.Department.Civil;
import static java.util.List.of;

import java.util.ArrayList;
import java.util.Collection;

public class DummyData {
  public static Collection<Employee> randomEmployees() {
    return new ArrayList<>() {
      {
        add(new Employee(new Employee.Identity("x@y.z", "A"), 4000, ComputerScience, of()));
        add(new Employee(new Employee.Identity("x@y.z", "B"), 3000, ComputerScience, of()));
        add(new Employee(new Employee.Identity("x@y.z", "C"), 32001, ComputerScience, of()));
        add(new Employee(new Employee.Identity("x@y.z", "D"), 14000, ComputerScience, of()));

        // Chemical
        add(new Employee(new Employee.Identity("x@y.z", "A"), 12000, Chemical, of()));
        add(new Employee(new Employee.Identity("x@y.z", "B"), 12000, Chemical, of()));
        add(new Employee(new Employee.Identity("x@y.z", "C"), 34000, Chemical, of()));
        add(new Employee(new Employee.Identity("x@y.z", "D"), 64000, Chemical, of()));

        // Mechanical
        add(new Employee(new Employee.Identity("x@y.z", "A"), 51000, Mechanical, of()));
        add(new Employee(new Employee.Identity("x@y.z", "C"), 32000, Mechanical, of()));
        add(new Employee(new Employee.Identity("x@y.z", "B"), 12000, Mechanical, of()));
        add(new Employee(new Employee.Identity("x@y.z", "D"), 4000, Mechanical, of()));
        // Electrical
        add(new Employee(new Employee.Identity("x@y.z", "A"), 12000, Electrical, of()));
        add(new Employee(new Employee.Identity("x@y.z", "C"), 30400, Electrical, of()));
        // Civil
        add(new Employee(new Employee.Identity("x@y.z", "B"), 52000, Civil, of()));
        add(new Employee(new Employee.Identity("x@y.z", "D"), 40600, Civil, of()));
      }
    };
  }
}
