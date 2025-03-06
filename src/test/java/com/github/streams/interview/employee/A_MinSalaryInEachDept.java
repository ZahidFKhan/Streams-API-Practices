package com.github.streams.interview.employee;

import com.github.streams.interview.employee.ignore.domain_related.dummy_data.DummyEmployees;
import com.github.streams.solutions.InterviewProblemSolutions;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class A_MinSalaryInEachDept {
  @Test
  @Disabled
  void testMinSalaryInEachDepartment() {

    final var employees = DummyEmployees.randomEmployees();

    final var mySolution = InterviewProblemSolutions.getMinSalaryInEachDepartment(employees);
    final var yourSolution = Map.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
