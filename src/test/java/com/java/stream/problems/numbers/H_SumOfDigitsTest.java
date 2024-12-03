package com.java.stream.problems.numbers;

import com.github.javafaker.Faker;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given an array of {5,6,7,8,5,5,8,8,7)
 * Find the sum of the unique elements.
 * The output should be in this case is: 26.
 */
class H_SumOfDigitsTest {

  @Test
  @Disabled
  void testSumOfDigitsTest() {
    //todo: complete it
    final var input = Faker.instance().number().randomNumber();
    var mySolution = 0L;
    var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
