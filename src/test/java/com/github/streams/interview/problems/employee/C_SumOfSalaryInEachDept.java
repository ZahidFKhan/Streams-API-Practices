package com.github.streams.interview.problems.employee;

import com.github.streams.interview.InterviewProblemSolutions;
import com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data.DummyEmployees;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculation of the sum of salaries in each department.<br>
 *
 * <h2>Input:</h2>
 *
 * <li>Employee("John", "Sales", 50000)
 * <li>Employee("Jane", "Marketing", 60000)
 * <li>Employee("Bob", "Sales", 70000) <br>
 *
 *     <h2>Output:</h2>
 *
 *     <pre>
 *   {
 *     "Sales": 120000,
 *     "Marketing": 60000
 *   }
 *   </pre>
 */
class C_SumOfSalaryInEachDept {
  @Test
  @Disabled
  void sumOfSalariesInEachDepartment() {
    final var employees = DummyEmployees.randomEmployees();
    final var mySolution = InterviewProblemSolutions.getSumOfSalariesOnEachDepartment(employees);
    final var yourSolution = Map.<String, Long>of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
