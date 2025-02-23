package com.github.streams.interview.employee;

import com.github.streams.interview.employee.domain_related.data.DummyEmployees;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_NumberOfEmployeeInEachDept {
  @Test
  @Disabled
  void countNumberOfEmployeeBelongToEachDept() {
    final var employees = DummyEmployees.randomEmployees();
    final var mySolution =
        employees.stream()
            .collect(Collectors.groupingBy(e -> e.department().name(), Collectors.counting()));

    final var yourSolution = Map.of();
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
