package com.github.streams.interview.employee;

import com.github.streams.interview.employee.domain_related.data.DummyEmployees;
import com.github.streams.solutions.InterviewProblemSolutions;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_SumOfSalaryInEachDept {
  @Test
  @Disabled
  void sumOfSalariesInEachDepartment() {
    final var employees = DummyEmployees.randomEmployees();
    final var mySolution = InterviewProblemSolutions.getSumOfSalariesOnEachDepartment(employees);
    final var yourSolution = Map.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
