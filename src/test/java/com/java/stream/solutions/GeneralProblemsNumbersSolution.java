package com.java.stream.solutions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GeneralProblemsNumbersSolution {

  public static List<String> getNumberOnly(List<String> values) {
    return values.stream().filter(x -> x.matches("\\d+")).toList();
  }

  public static String getSmallestPossibleValue(List<Integer> input) {
    return input.stream().map(String::valueOf).sorted().collect(Collectors.joining());
  }

  public static String getHighestPossibleValue(List<Integer> input) {
    return input.stream()
        .map(String::valueOf)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining());
  }

  public static <T> List<T> getUniqueNumberFromList(List<T> input) {
    return input.stream().distinct().toList();
  }

  public static long sumOfDigits(List<Integer> input) {
    return input.stream().reduce(0, Integer::sum);
  }
}
