package com.github.streams.interview.problems.employee;

import com.github.streams.interview.InterviewProblemSolutions;
import com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data.DummyEmployees;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class F_ManagerWithMaxEmployees {

  /**
   * Step 1: Get familiar with the @see{Employee} class Step 2: Look how I create the employee with
   * manager. Step 3: Group Managers with employees and find the one with max employees.
   */
  @Test
  @Disabled
  void findManagerWithMaxEmployeesTest() {
    final var employees = DummyEmployees.randomEmployees();

    final var mySolution = InterviewProblemSolutions.getManagerIdHavingMaxEmployees(employees);
    final var yourSolution = -1;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
