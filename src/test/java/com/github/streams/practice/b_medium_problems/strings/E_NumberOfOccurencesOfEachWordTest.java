package com.github.streams.practice.b_medium_problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class E_NumberOfOccurencesOfEachWordTest {
  @Test
  @Disabled
  public void numberOfOccurencesOfEachWord() {
    final var input = "the quick brown fox jumps right over the little lazy dog little";
    final Map<String, Long> mySolution = StringProblemsSolution.numberOfOccurenceOfEachWord(input);

    Map<String, Long> yourSolution = Map.of();
    assertEquals(mySolution, yourSolution);
  }
}
