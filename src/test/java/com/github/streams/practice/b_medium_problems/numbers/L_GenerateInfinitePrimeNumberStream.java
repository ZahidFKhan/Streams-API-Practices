package com.github.streams.practice.b_medium_problems.numbers;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class L_GenerateInfinitePrimeNumberStream {

  @Test
  @Disabled
  void intStreamOfPrimeNumber() {
    final var mySolution = MediumNumbersProblemSolution.generateIntStreamOfPrimeNumberStream(5);
    final var yourSolution = IntStream.range(0, 10);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
