package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given an array of {5,6,7,8,5,5,8,8,7)
 * Find the sum of the unique elements.
 * The output should be in this case is: 26.
 */
public class F_SumOfDigitsTest {

  @Test
  @Disabled
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var mySolution = GeneralProblemsNumbersSolution.sumOfDigits(input);
    var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
