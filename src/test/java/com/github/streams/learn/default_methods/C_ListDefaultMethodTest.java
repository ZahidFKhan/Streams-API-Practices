package com.github.streams.learn.default_methods;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

///
/// Remove the words that have odd lengths from the list.
///
///  Example:
/// ```
///   Input: ["alfa", "bravo", "echo", "charlie"]
///
///   Output: ["alfa", "echo"]
/// ```

class C_ListDefaultMethodTest {

  @Test
  @Disabled
  void removeOddLengthWords() {
    List<String> input =
        new ArrayList<>(List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));

    var yourSolution = List.of();
    var mySolution = DefaultMethodSolutions.removeOddLengthWords(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
