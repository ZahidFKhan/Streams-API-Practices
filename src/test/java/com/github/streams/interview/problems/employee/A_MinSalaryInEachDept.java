package com.github.streams.interview.problems.employee;

import com.github.streams.interview.InterviewProblemSolutions;
import com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data.DummyEmployees;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 *
 * <h2>Given a list of employees, find the minimum salary in each department.</h2>
 *
 * <h2>Input</h2>
 *
 * <li>Employee(department="Sales", salary=5000)
 * <li>Employee(department="Sales", salary=6000)
 * <li>Employee(department="Marketing", salary=4000)
 * <li>Employee(department="Marketing", salary=7000)
 *     <h2>Output</h2>
 *
 * <li>Sales=5000, Marketing=4000
 */
class A_MinSalaryInEachDept {
  @Test
  @Disabled
  void testMinSalaryInEachDepartment() {

    final var employees = DummyEmployees.randomEmployees();

    final var mySolution = InterviewProblemSolutions.getMinSalaryInEachDepartment(employees);
    final var yourSolution = Map.<String, Long>of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
