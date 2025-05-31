package com.github.streams.interview.problems.numbers;

import com.github.streams.interview.InterviewProblemSolutions;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/// ### Given an array of integers, group the numbers by the range they belong to.
///
/// Each number is grouped into a range starting with the largest multiple of 10 less than or equal
// to the number.
///
/// ### Input:
/// ```
/// [2, 34, 54, 23, 33, 20, 59, 11, 19, 37]
/// ```
///
/// ### Output:
/// ```
/// {
///   0=[2],
///   50=[54, 59],
///   20=[23, 20],
///   10=[11, 19],
///   30=[34, 33, 37]
/// }
/// ```
class B_GroupingOfNumbersTest {
  @Test
  @Disabled
  void testGroupingOfNumbers() {
    final var randomIntegers =
        List.of(
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100),
            new Random().nextInt(100));

    final var mySolution = InterviewProblemSolutions.groupingOfNumbers(randomIntegers);
    final var yourSolution = Collections.<Integer, List<Integer>>emptyMap();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
