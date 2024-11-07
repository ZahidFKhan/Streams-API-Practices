package com.java.stream.solutions;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneralNumbersProblemSolution {

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
  public static long sumOfUniqueDigits(List<Integer> input) {
    return input.stream().distinct().reduce(0, Integer::sum);
  }

  public static List<Integer> segregateEvenOddNumbers(Stream<Integer> input) {
    return input.collect(Collectors.partitioningBy(x -> x % 2 == 0)).values().stream()
        .flatMap(Collection::stream)
        .toList();
  }
}
