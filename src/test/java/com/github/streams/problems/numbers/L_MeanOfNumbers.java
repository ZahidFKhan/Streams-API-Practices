package com.github.streams.problems.numbers;

import com.github.streams.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class L_MeanOfNumbers {
  @Test
  @Disabled
  void meanOfNumbers() {
    final var input =
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    final var mySolution = GeneralNumbersProblemSolution.meanOfNumbers(input);
    final var yourSolution = -1;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
