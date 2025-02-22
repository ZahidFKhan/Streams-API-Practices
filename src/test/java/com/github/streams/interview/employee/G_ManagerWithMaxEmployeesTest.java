package com.github.streams.interview.employee;

import com.github.streams.interview.employee.domain_related.data.DummyEmployees;
import com.github.streams.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class G_ManagerWithMaxEmployeesTest {
  @Test
  @Disabled
  void findManagerWithMaxEmployeesTest() {
    final var employees = DummyEmployees.randomEmployees();

    final var mySolution = InterviewProblemSolutions.getManagerIdHavingMaxEmployees(employees);
    final var yourSolution = -1;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
