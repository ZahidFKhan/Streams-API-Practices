package com.github.streams.interview.employee;

import com.github.streams.interview.employee.domain_related.data.DummyEmployees;
import com.github.streams.solutions.InterviewProblemSolutions;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class B_MaxSalaryInEachDept {

  @Test
  @Disabled
  void testMaxSalaryInEachDept() {

    final var employees = DummyEmployees.randomEmployees();

    final var mySolution = InterviewProblemSolutions.getHighestSalaryInEachDepartment(employees);
    final var yourSolution = Map.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
