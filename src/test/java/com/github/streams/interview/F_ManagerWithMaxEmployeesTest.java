package com.github.streams.interview;

import com.github.streams.interview.employee.domain_related.data.DummyData;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class F_ManagerWithMaxEmployeesTest {
  @Test
  @Disabled
  void findManagerWithMaxEmployeesTest() {
    final var employees = DummyData.randomEmployees();
    System.out.println(employees);
    Assumptions.assumeFalse(true);
  }
}
