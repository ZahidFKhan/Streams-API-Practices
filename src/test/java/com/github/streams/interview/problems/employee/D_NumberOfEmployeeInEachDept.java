package com.github.streams.interview.problems.employee;

import com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data.DummyEmployees;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculation of the number of employees in each department. <br>
 *
 * <pre>
 * Input:
 *    Employee("John", "Sales", 50000)
 *    Employee("Jane", "Marketing", 60000)
 *    Employee("Bob", "Sales", 70000)
 *
 * Output:
 *    "Sales": 2,
 *    "Marketing": 1
 *
 * </pre>
 *
 * Explanation: This method takes a list of employees as input, groups them by their department
 * names, and returns a map where the keys are the department names and the values are the number of
 * employees in each department.
 */
class D_NumberOfEmployeeInEachDept {
  @Test
  @Disabled
  void countNumberOfEmployeeBelongToEachDept() {
    final var employees = DummyEmployees.randomEmployees();
    final var mySolution =
        employees.stream()
            .collect(Collectors.groupingBy(e -> e.department().name(), Collectors.counting()));

    final var yourSolution = Map.<String, Long>of();
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
