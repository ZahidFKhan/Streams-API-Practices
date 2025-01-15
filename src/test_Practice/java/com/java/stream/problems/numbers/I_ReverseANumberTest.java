package com.java.stream.problems.numbers;

import com.github.javafaker.Faker;
import com.java.stream.solutions.GeneralNumbersProblemSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class I_ReverseANumberTest {

  @Test
  @Disabled
  void reverseANumber() {
    final var input = Faker.instance().number().numberBetween(1, 1_00_000);
    var mySolution = GeneralNumbersProblemSolution.reverseANumber(input);
    int yourSolution = 0;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
