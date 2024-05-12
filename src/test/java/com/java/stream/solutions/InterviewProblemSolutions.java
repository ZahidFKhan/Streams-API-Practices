package com.java.stream.solutions;

import com.java.stream.interview_problems.domain.Employee;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProblemSolutions {
  public static Map<String, ? extends Number> findUniqueDomainsCount(List<Employee> employees) {
    return employees.stream()
        .filter(x -> x.email().split("@").length == 2)
        .map(x -> x.email().split("@")[1])
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  public static Integer maxNumberOfVowels(String input) {
    final var i =
        Arrays.stream(input.split(" "))
            .map(x -> x.length() - x.replaceAll("[aeiouAEIOU]", "").length())
            .max(Comparator.comparing(Integer::intValue))
            .get();

    return i;
  }

  public static Map<Integer, List<Integer>> groupingOfNumbers(List<Integer> randomIntegers) {
    return randomIntegers.stream()
            .collect(Collectors.groupingBy(e->e / 10));
  }
}
