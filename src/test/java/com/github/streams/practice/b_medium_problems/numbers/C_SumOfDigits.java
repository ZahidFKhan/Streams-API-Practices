package com.github.streams.practice.b_medium_problems.numbers;

import com.github.streams.practice.b_medium_problems.numbers.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the sum of digits of a given integer.
 *
 * <p>This method takes an integer as input, breaks it down into individual digits, and returns
 * their sum.
 *
 * <p>Example: <br>
 * Input = 123<br>
 * Output = 6 <br>
 * Explanation: (1 + 2 + 3)
 */
class C_SumOfDigits {

  @Test
  @Disabled
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = MediumNumbersProblemSolution.sumOfDigits(input);
    var yourSolution = 2;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
