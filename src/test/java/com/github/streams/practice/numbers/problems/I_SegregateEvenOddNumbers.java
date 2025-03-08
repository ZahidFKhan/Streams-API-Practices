package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.ArrayList;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Divides a list of integers into two separate lists, one containing all even numbers and the other
 * containing all odd numbers. Input: {1, 2, 3, 4, 5, 6, 7, 8, 9} Output: {2, 4, 6, 8, 1, 3, 5, 7, 9
 * }
 */
class I_SegregateEvenOddNumbers {
  @Test
  @Disabled
  void testSegregationOfEvenOddNumbersTest() {
    final var input = IntStream.range(1, 50).boxed();
    final var mySolution = NumbersProblemSolution.segregateEvenOddNumbers(input);
    final var yourSolution = new ArrayList<>();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
