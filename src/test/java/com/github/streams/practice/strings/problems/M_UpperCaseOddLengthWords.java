package com.github.streams.practice.strings.problems;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class M_UpperCaseOddLengthWords {

  /**
   * Given a list of words, create an output list that contains only the odd-length words, converted
   * to upper case.
   */
  @Test
  @Disabled
  public void uppercaseOddLengthWords() {
    List<String> input = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

    List<String> result = null; // TODO

    Assertions.assertEquals(List.of("BRAVO", "CHARLIE", "DELTA", "FOXTROT"), result);
  }
}
