package com.github.streams.interview.problems.employee;

import com.github.streams.interview.InterviewProblemSolutions;
import com.github.streams.interview.problems.employee.ignore.domain_related.Department;
import com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data.DummyEmployees;
import java.util.List;
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
    final var yourSolution = Map.<Department, List<String>>of();

    Assertions.assertEquals(yourSolution, mySolution);
  }
}
