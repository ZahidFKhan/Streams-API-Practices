package com.java.stream.interview_problems;

import com.java.stream.solutions.InterviewProblemSolutions;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
*
Q12) Given an array of integers (2,34,54,23,33,20,59,11,19,37 ) group the numbers by the range they belong to.
* The put should be {0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}
*
*/
public class GroupingOfNumbersTest {
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

    final var expected = InterviewProblemSolutions.groupingOfNumbers(randomIntegers);
    final var actual = Collections.<Integer, List<Integer>>emptyMap();

    Assertions.assertEquals(expected, actual);
  }
}
