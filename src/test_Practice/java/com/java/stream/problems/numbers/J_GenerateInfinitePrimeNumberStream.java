package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J_GenerateIntStreamOfPrimeNumbersTest {

  @Test
  @Disabled
  void intStreamOfPrimeNumber() {
    final var mySolution = GeneralNumbersProblemSolution.generateIntStreamOfPrimeNumberStream(5);
    final var yourSolution = IntStream.range(0, 10);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
