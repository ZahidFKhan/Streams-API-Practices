package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.NumbersProblemSolution;
import com.github.streams.practice.a_easy.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class H_ReverseANumber {

  @Test
  @Disabled
  static void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = NumbersProblemSolution.reverseANumber(input);
    int yourSolution = 0;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
