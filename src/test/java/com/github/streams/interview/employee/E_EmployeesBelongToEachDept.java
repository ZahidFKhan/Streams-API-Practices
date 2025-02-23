package com.github.streams.interview.employee;

import com.github.streams.interview.employee.domain_related.data.DummyEmployees;
import com.github.streams.solutions.InterviewProblemSolutions;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class E_EmployeesBelongToEachDept {
  @Test
  @Disabled
  void employeesBelongToEachDept() {
    final var employees = DummyEmployees.randomEmployees();
    final var mySolution = InterviewProblemSolutions.getEmployeesBelongToEachDepartment(employees);
    final var yourSolution = Map.of();

    Assertions.assertEquals(yourSolution, mySolution);
  }
}
