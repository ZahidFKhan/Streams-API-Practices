package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
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
public class E_SegregateEvenOddNumbersTest {
  @Test
  @Disabled
  void testSegregationOfEvenOddNumbersTest() {
    final var input = IntStream.range(1, 50).boxed();
    final var mySolution = GeneralProblemsNumbersSolution.segregateEvenOddNumbers(input);
    final var yourSolution = new ArrayList<>();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
