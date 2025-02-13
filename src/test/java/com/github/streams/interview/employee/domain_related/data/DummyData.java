package com.github.streams.interview.employee.domain_related.data;

import static com.github.streams.interview.employee.domain_related.Department.*;
import static java.util.List.of;

import com.github.javafaker.Faker;
import com.github.streams.interview.employee.domain_related.Department;
import com.github.streams.interview.employee.domain_related.Employee;
import com.github.streams.interview.employee.domain_related.Manager;
import java.util.Collection;
import java.util.List;

public class DummyData {

  public static Collection<Employee> randomEmployees() {
    final var faker = Faker.instance().internet();
    return List.of(
        createEmployee(faker.emailAddress(), "A0001", 4000, ComputerScience),
        createEmployee(faker.emailAddress(), "A0002", 3000, ComputerScience),
        createEmployee(faker.emailAddress(), "A0003", 32001, ComputerScience),
        createEmployee(faker.emailAddress(), "A0004", 14000, ComputerScience),
        createEmployee(faker.emailAddress(), "A0005", 12000, Chemical),
        createEmployee(faker.emailAddress(), "A0006", 12000, Chemical),
        createEmployee(faker.emailAddress(), "A0007", 34000, Chemical),
        createEmployee(faker.emailAddress(), "A0008", 64000, Chemical),
        createEmployee(faker.emailAddress(), "M0001", 32000, Mechanical),
        createEmployee(faker.emailAddress(), "M0002", 12000, Mechanical),
        createEmployee(faker.emailAddress(), "M0003", 4000, Mechanical),
        createEmployee(faker.emailAddress(), "M0004", 51000, Mechanical),
        createEmployee(faker.emailAddress(), "E0001", 12000, Electrical),
        createEmployee(faker.emailAddress(), "E0002", 30400, Electrical),
        createEmployee(faker.emailAddress(), "C0001", 52000, Civil),
        createEmployee(faker.emailAddress(), "C0002", 40600, Civil));
  }

  private static Employee createEmployee(
      final String email, String id, int salary, Department department) {
    return new Employee(
        new Employee.Identity(email, id), salary, department, of(), Manager.DEFAULT_MANAGER);
  }
}
