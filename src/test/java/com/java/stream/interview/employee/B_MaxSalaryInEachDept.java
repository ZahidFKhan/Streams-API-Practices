package com.java.stream.interview.employee;

import com.java.stream.interview.employee.domain_related.DummyData;
import com.java.stream.solutions.InterviewProblemSolutions;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class B_MaxSalaryInEachDept {

  @Test
  @Disabled
  void testMaxSalaryInEachDept() {

    final var employees = DummyData.randomEmployees();

    final var mySolution = InterviewProblemSolutions.getHighestSalaryInEachDepartment(employees);
    final var yourSolution = Map.of();

    Assertions.assertEquals(mySolution, yourSolution);

  }
}
