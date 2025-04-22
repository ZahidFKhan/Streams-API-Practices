package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the sum of all elements in an integer array.
 *
 * <p>Example: <br>
 * Input: [5, 6, 7, 8]
 *
 * <p>Output: 26
 */
class A_SumOfNumbers {

  @Test
  @Disabled
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var mySolution = NumbersProblemSolution.sumOfNumbers(input);
    var yourSolution = -1;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
