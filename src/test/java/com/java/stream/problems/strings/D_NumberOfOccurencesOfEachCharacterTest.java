package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralProblemsSolution;

import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class D_NumberOfOccurencesOfEachCharacterTest {
  @Test
  @Disabled("Remove This Once you Complete The Exercise")
  void numberOfOccurencesOfEachCharacter() {
    final String input = "the quick brown fox jumps right over the little lazy dog little";
    final var mySolution = GeneralProblemsSolution.findOccurenceOfCharacter(input);
    final Map<Character, Long> yourSolution = null;

    assertEquals(mySolution, yourSolution);
  }
}
