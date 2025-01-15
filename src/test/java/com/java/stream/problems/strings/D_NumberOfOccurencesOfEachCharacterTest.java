package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Test;

class D_NumberOfOccurencesOfEachCharacterTest {
  @Test
//  @Disabled("Remove This Once you Complete The Exercise")
  void numberOfOccurencesOfEachCharacter() {
    final String input = "the quick brown fox jumps right over the little lazy dog little";
//    final var mySolution = GeneralStringProblemsSolution.findOccurenceOfCharacter(input);
    final var mySolution = this.findOccurenceOfCharacter(input);
    final Map<Character, Long> yourSolution = null;

    assertEquals(mySolution, yourSolution);
  }

  private Map<Character, Integer> findOccurenceOfCharacter(String input) {
    return input.chars()
            .filter(c -> !Character.isWhitespace(c)) // Exclude spaces
            .mapToObj(c -> (char) c) // Convert int to char
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Group by character and count
;
  }
}
