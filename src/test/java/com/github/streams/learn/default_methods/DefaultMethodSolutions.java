package com.github.streams.learn.default_methods;

import java.util.List;

public class DefaultMethodSolutions {

  public static List<StringBuilder> appendNewSuffix(List<StringBuilder> input) {
    input.replaceAll(x -> x.append("new"));
    return input;
  }

  public static List<String> removeOddLengthWords(List<String> input) {
    input.removeIf(x -> x.length() % 2 == 1);
    return List.copyOf(input);
  }

  public static List<String> upperCaseAllWords(List<String> list) {
    list.replaceAll(String::toUpperCase);
    return List.copyOf(list);
  }
}
