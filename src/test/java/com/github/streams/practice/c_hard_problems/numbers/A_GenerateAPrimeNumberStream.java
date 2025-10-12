package com.github.streams.practice.c_hard_problems.numbers;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class A_GenerateAPrimeNumberStream {

  @Test
  @Disabled
  void intStreamOfPrimeNumber() {
    final var mySolution = HardNumbersProblemSolution.generateIntStreamOfPrimeNumberStream(5);
    final var yourSolution = IntStream.range(0, 10);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
