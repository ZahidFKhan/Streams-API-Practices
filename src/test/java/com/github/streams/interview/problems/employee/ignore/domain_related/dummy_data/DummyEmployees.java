package com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data;

import static com.github.streams.interview.problems.employee.ignore.domain_related.Department.*;
import static java.util.List.of;

import com.github.streams.interview.problems.employee.ignore.domain_related.Department;
import com.github.streams.interview.problems.employee.ignore.domain_related.Employee;
import com.github.streams.interview.problems.employee.ignore.domain_related.Identity;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;
import net.datafaker.Faker;

public final class DummyEmployees {
  static final Faker faker = new Faker();

  // NON INSTANTIABLE UTILITY CLASS.
  private DummyEmployees() {
    throw new AssertionError("No instances");
  }

  public static Collection<Employee> randomEmployees() {
    final var employeeId = new AtomicInteger(1);
    final Supplier<Integer> id = employeeId::getAndIncrement;

    return List.of(
        createEmployeeWithMgr(id.get(), ComputerScience),
        createEmployeeWithMgr(id.get(), ComputerScience),
        createEmployeeWithMgr(id.get(), ComputerScience),
        createEmployeeWithMgr(id.get(), ComputerScience),
        createEmployeeWithMgr(id.get(), Chemical),
        createEmployeeWithMgr(id.get(), Chemical),
        createEmployeeWithMgr(id.get(), Chemical),
        createEmployeeWithMgr(id.get(), Chemical),
        createEmployeeWithMgr(id.get(), Chemical),
        createEmployeeWithMgr(id.get(), Mechanical),
        createEmployeeWithMgr(id.get(), Mechanical),
        createEmployeeWithMgr(id.get(), Mechanical),
        createEmployeeWithMgr(id.get(), Mechanical),
        createEmployeeWithMgr(id.get(), Electrical),
        createEmployeeWithMgr(id.get(), Electrical),
        createEmployeeWithMgr(id.get(), Civil),
        createEmployeeWithMgr(id.get(), Civil));
  }

  private static Employee createEmployeeWithMgr(final Integer id, final Department department) {
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
