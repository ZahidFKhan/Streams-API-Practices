package com.java.stream.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GeneralProblemsSolution {

  public static List<String> sortListBasedOn2ndCharacter(List<String> input) {
    return input.stream()
        .sorted(Comparator.comparing(e -> e.charAt(1)))
        .collect(Collectors.toList());
  }

  public static String findLargestWordInTheString(String input) {
    String maxString =
        Arrays.stream(input.split(" ")).max(Comparator.comparing(String::length)).get();
    return maxString;
  }
}
