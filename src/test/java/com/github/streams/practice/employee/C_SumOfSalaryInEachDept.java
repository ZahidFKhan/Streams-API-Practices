package com.github.streams.practice.employee;

import com.github.streams.practice.ProblemSolutions;
import com.github.streams.practice.employee.ignore.domain_related.dummy_data.DummyEmployees;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/// ## Calculates the sum of salaries in each department.
///
/// ### Input:
/// ```json
/// - Employee("John", "Sales", 50000)
/// - Employee("Jane", "Marketing", 60000)
/// - Employee("Bob", "Sales", 70000)
/// ```
/// ### Output:
///
/// ```json
/// {
///   "Sales": 120000,
///   "Marketing": 60000
/// }
/// ```
class C_SumOfSalaryInEachDept {
  @Test
  @Disabled
  void sumOfSalariesInEachDepartment() {
    final var employees = DummyEmployees.randomEmployees();
    final var mySolution = ProblemSolutions.getSumOfSalariesOnEachDepartment(employees);
    final var yourSolution = Map.<String, Long>of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
