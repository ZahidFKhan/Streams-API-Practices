package com.github.streams.practice.numbers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumbersProblemSolution {

  public static List<String> getNumberOnly(List<String> values) {
    return values.stream()
        .<String>mapMulti(
            (value, stream) -> {
              try {
                Double.parseDouble(value);
                stream.accept(value);
              } catch (NumberFormatException ignore) {
              }
            })
        .toList();
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

  public static long sumOfNumbers(List<Integer> input) {
    return input.stream().reduce(0, Integer::sum);
  }

  public static long sumOfUniqueNumbers(List<Integer> input) {
    return input.stream().distinct().reduce(0, Integer::sum);
  }

  public static List<Integer> segregateEvenOddNumbers(Stream<Integer> input) {
    return input.collect(Collectors.partitioningBy(x -> x % 2 == 0)).values().stream()
        .flatMap(Collection::stream)
        .toList();
  }

  public static long sumOfDigits(int input) {
    final IntPredicate isDivisibleBy10 = number -> number > 0;
    final IntUnaryOperator divideBy10 = number -> number / 10;

    System.out.println("Input number : " + input);

    return IntStream.iterate(input, isDivisibleBy10, divideBy10).map(x -> x % 10).sum();
  }

  public static int reverseANumber(int input) {
    System.out.println("Input number : " + input);
    return IntStream.iterate(input, x -> x > 0, x -> x / 10)
        .map(x -> x % 10)
        .reduce(0, (value, previous) -> value * 10 + previous);
  }

  public static List<Integer> generateIntStreamOfPrimeNumberStream(final int limit) {
    final IntPredicate isPrime =
        number ->
            IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(divisor -> number % divisor == 0);

    return IntStream.iterate(2, x -> x < Integer.MAX_VALUE, x -> x + 1)
        .filter(isPrime)
        .limit(limit)
        .boxed()
        .toList();
  }

  public static List<List<Integer>> convertInt2DArrayToList(int[][] input) {
    return Arrays.stream(input)
        .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
        .collect(Collectors.toList());
  }

  public static double meanOfNumbers(List<Integer> input) {
    return input.stream().mapToInt(Integer::intValue).average().orElse(0);
  }
}
