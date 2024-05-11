package com.java.stream.solutions;

import com.java.stream.interview_problems.domain.Employee;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProblemSolutions {
  public static Map<String, ? extends Number> findUniqueDomainsCount(List<Employee> employees) {
    return employees.stream()
        .filter(x -> x.email().split("@").length == 2)
        .map(x -> x.email().split("@")[1])
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
