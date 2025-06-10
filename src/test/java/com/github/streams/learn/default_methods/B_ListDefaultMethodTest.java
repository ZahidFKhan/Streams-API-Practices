package com.github.streams.learn.default_methods;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

///
///   Given a list of StringBuilders, modify each StringBuilder in-place by appending the string
///   "new" to each one.
///
///  Example:
/// ```
///   Input: ["alfa", "bravo", "charlie"]
///
///   Output: ["alfanew", "bravonew", "charlienew"]
/// ```

class B_ListDefaultMethodTest {
  @Test
  @Disabled()
  void testAppendNewSuffixInAllTheStrings() {
    final var input =
        new ArrayList<>(
            List.of(
                new StringBuilder("alfa"),
                new StringBuilder("bravo"),
                new StringBuilder("charlie")));

    var yourSolution = List.of();
    var mySolution = DefaultMethodSolutions.appendNewSuffix(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
