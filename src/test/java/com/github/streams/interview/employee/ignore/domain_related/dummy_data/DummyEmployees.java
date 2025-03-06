package com.github.streams.interview.employee.ignore.domain_related.dummy_data;

import static com.github.streams.interview.employee.ignore.domain_related.Department.*;
import static java.util.List.of;

import com.github.javafaker.Faker;
import com.github.streams.interview.employee.ignore.domain_related.Department;
import com.github.streams.interview.employee.ignore.domain_related.Employee;
import com.github.streams.interview.employee.ignore.domain_related.Identity;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;

public final class DummyEmployees {
  static final Faker faker = Faker.instance();

  // NON INSTANTIABLE UTILITY CLASS.
  private DummyEmployees() {
    throw new AssertionError("No instances");
  }

  public static Collection<Employee> randomEmployees() {
    final var employeeId = new AtomicInteger(1);
    final Supplier<Integer> id = employeeId::getAndIncrement;

    return List.of(
        employeeWith(id.get(), ComputerScience),
        employeeWith(id.get(), ComputerScience),
        employeeWith(id.get(), ComputerScience),
        employeeWith(id.get(), ComputerScience),
        employeeWith(id.get(), Chemical),
        employeeWith(id.get(), Chemical),
        employeeWith(id.get(), Chemical),
        employeeWith(id.get(), Chemical),
        employeeWith(id.get(), Chemical),
        employeeWith(id.get(), Mechanical),
        employeeWith(id.get(), Mechanical),
        employeeWith(id.get(), Mechanical),
        employeeWith(id.get(), Mechanical),
        employeeWith(id.get(), Electrical),
        employeeWith(id.get(), Electrical),
        employeeWith(id.get(), Civil),
        employeeWith(id.get(), Civil));
  }

  private static Employee employeeWith(final Integer id, final Department department) {
    final Supplier<String> name = () -> faker.name().firstName();
    final Supplier<String> email = () -> faker.internet().emailAddress();
    final Supplier<Integer> salary = () -> faker.number().numberBetween(1000, 50000);
    final Function<Department, Integer> managerId =
        deptt ->
            switch (deptt) {
              case ComputerScience -> 1;
              case Chemical -> 5;
              case Mechanical -> 9;
              case Electrical -> 13;
              case Civil -> 15;
            };

    final var identity = new Identity(email.get(), name.get());
    return new Employee(id, identity, salary.get(), department, of(), managerId.apply(department));
  }
}
