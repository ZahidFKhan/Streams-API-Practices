package com.java.stream.interview.employee;

import com.java.stream.interview.employee.domain_related.data.DummyData;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class F_CountNumberOfEmployeeBelongToEachDept {
  @Test
  @Disabled
  void countNumberOfEmployeeBelongToEachDept() {
    final var employees = DummyData.randomEmployees();
    final var mySolution =
        employees.stream()
            .collect(Collectors.groupingBy(e -> e.department().name(), Collectors.counting()));

    final var yourSolution = Map.of();
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
