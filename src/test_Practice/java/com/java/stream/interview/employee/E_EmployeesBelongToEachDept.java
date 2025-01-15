package com.java.stream.interview.employee;

import com.java.stream.interview.employee.domain_related.data.DummyData;

import com.java.stream.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Map;

class E_EmployeesBelongToEachDept {
  @Test
  @Disabled
  void employeesBelongToEachDept() {
    final var employees = DummyData.randomEmployees();
    final var mySolution = InterviewProblemSolutions.getEmployeesBelongToEachDepartment(employees);
    final var yourSolution = Map.of();

    Assertions.assertEquals(yourSolution, mySolution);
  }
}
