package com.github.streams.practice.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProblemsSolution {

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

  public static String find2ndLargestWordInTheString(String input) {
    return Arrays.stream(input.split(" "))
        .sorted(Comparator.comparing(String::length, Comparator.reverseOrder()))
        .skip(1)
        .limit(1)
        .findFirst()
        .orElseThrow(RuntimeException::new);
  }

  public static Map<String, Integer> findLengthOfEachCityAlongWithSize(List<String> cities) {
    return cities.stream()
        .filter(cityName -> "M".equalsIgnoreCase(cityName.substring(0, 1)))
        .collect(Collectors.toMap(Function.identity(), String::length));
  }

  public static Map<Character, Long> findOccurenceOfCharacter(String input) {
    return input
        .chars()
        .mapToObj(x -> (char) x)
        .filter(x -> !Character.isSpaceChar(x))
        .collect(
            Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
  }

  public static String getUniqueCharacters(String input) {
    return input
        .chars()
        .distinct()
        .mapToObj(x -> (char) x)
        .reduce("", (x, y) -> x + y, (a, b) -> a + b);
  }

  public static List<String> getMatchesVowels(String input, int length) {
    return Arrays.stream(input.split(" "))
        .filter(word -> word.replaceAll("[aeiouAEIOU]", "").length() == word.length() - length)
        .toList();
  }

  public static Map<String, Long> numberOfOccurenceOfEachWord(String input) {
    return Arrays.stream(input.split(" "))
        .collect(
            Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
  }

  public static String reverseStringWithSpecialCharacters(String input) {
    return input.chars().mapToObj(x -> (char) x).reduce("", (a, b) -> b + a, (a, b) -> b + a);
  }

  public static String concatenateStrings(List<String> strings) {
    return String.join(",", strings);
  }

  public static List<String> findDuplicateStrings(List<String> input) {
    return input.stream().collect(Collectors.groupingBy(Function.identity())).values().stream()
        .filter(strings -> strings.size() > 1)
        .map(strings -> strings.get(0))
        .collect(Collectors.toList());
  }

  public static String convertListOfCharactersToString(Collection<Character> listOfCharacters) {
    return listOfCharacters.stream().map(Object::toString).reduce("", String::concat);
  }
}
