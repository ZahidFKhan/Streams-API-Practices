package com.github.streams.interview.employee.domain_related.data;

import static com.github.streams.interview.employee.domain_related.Department.*;
import static java.util.List.of;

import com.github.javafaker.Faker;
import com.github.streams.interview.employee.domain_related.Department;
import com.github.streams.interview.employee.domain_related.Employee;
import com.github.streams.interview.employee.domain_related.Manager;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class DummyData {

  public static Collection<Employee> randomEmployees() {
    final var faker = Faker.instance();

    final Supplier<Integer> salary = () -> faker.number().numberBetween(1000, 50000);
    final Supplier<String> email = () -> faker.internet().emailAddress();
    final Supplier<String> id = () -> faker.number().digits(6);

    return List.of(
        employeeWith(id.get(), email.get(), salary.get(), ComputerScience),
        employeeWith(id.get(), email.get(), salary.get(), ComputerScience),
        employeeWith(id.get(), email.get(), salary.get(), ComputerScience),
        employeeWith(id.get(), email.get(), salary.get(), ComputerScience),
        employeeWith(id.get(), email.get(), salary.get(), Chemical),
        employeeWith(id.get(), email.get(), salary.get(), Chemical),
        employeeWith(id.get(), email.get(), salary.get(), Chemical),
        employeeWith(id.get(), email.get(), salary.get(), Chemical),
        employeeWith(id.get(), email.get(), salary.get(), Mechanical),
        employeeWith(id.get(), email.get(), salary.get(), Mechanical),
        employeeWith(id.get(), email.get(), salary.get(), Mechanical),
        employeeWith(id.get(), email.get(), salary.get(), Mechanical),
        employeeWith(id.get(), email.get(), salary.get(), Electrical),
        employeeWith(id.get(), email.get(), salary.get(), Electrical),
        employeeWith(id.get(), email.get(), salary.get(), Civil),
        employeeWith(id.get(), email.get(), salary.get(), Civil));
  }

  private static Employee employeeWith(
      final String id, final String email, final int salary, final Department department) {
    return new Employee(
        new Employee.Identity(email, id), salary, department, of(), Manager.DEFAULT_MANAGER);
  }
}
