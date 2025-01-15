package com.java.stream.interview.employee;

import com.java.stream.interview.employee.domain_related.data.DummyData;
import com.java.stream.solutions.InterviewProblemSolutions;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_SumOfSalaryInEachDept {
  @Test
  @Disabled
  void sumOfSalariesInEachDepartment() {
    final var employees = DummyData.randomEmployees();
    final var mySolution = InterviewProblemSolutions.getSumOfSalariesOnEachDepartment(employees);
    final var yourSolution = Map.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
