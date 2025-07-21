package com.github.streams.practice.c_hard.numbers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HardNumbersProblemSolution {

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

  public static Integer largestConsecutiveSequence(final List<Integer> input) {
    final var set = new HashSet<>(input);
    return input.stream()
            .distinct()
        .filter(value -> !set.contains(value - 1))
        .collect(
            Collectors.toMap(
                Function.identity(),
                x -> {
                  int count = 0;
                  while (set.contains(x++)) {
                    ++count;
                  }
                  return count;
                }))
        .values()
        .stream()
        .max(Comparator.comparing(Integer::intValue))
        .get();
  }
}
