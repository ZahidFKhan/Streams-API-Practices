package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class E_NumberOfOccurencesOfEachWordTest {
  @Test
  @Disabled
  public void numberOfOccurencesOfEachWord() {
    final var input = "the quick brown fox jumps right over the little lazy dog little";
    final Map<String, Long> mySolution =
        GeneralStringProblemsSolution.numberOfOccurenceOfEachWord(input);

    Map<String, Long> yourSolution = Map.of();
    assertEquals(mySolution, yourSolution);
  }
}
