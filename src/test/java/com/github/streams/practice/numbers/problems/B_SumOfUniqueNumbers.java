package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the sum of unique elements in an array. <br>
 * Example: <br>
 * Input: [5, 6, 7, 8, 5, 5, 8, 8, 7]<br>
 * Output: 26
 */
class B_SumOfUniqueNumbers {

  @Test
  @Disabled
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var mySolution = NumbersProblemSolution.sumOfUniqueNumbers(input);
    var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
