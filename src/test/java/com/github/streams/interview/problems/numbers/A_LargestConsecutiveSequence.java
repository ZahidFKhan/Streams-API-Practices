package com.github.streams.interview.problems.numbers;

import com.github.streams.interview.InterviewProblemSolutions;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements
 * sequence. <br>
 * You must write an algorithm that runs in O(n) time. <br>
 * Example 1: <br>
 * Input: nums = [100,4,200,1,3,2]<br>
 * Output: 4<br>
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is
 * 4.<br>
 * <br>
 * <br>
 * Example 2:<br>
 * <br>
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]<br>
 * Output: 9<br>
 * <br>
 */
class A_LargestConsecutiveSequence {
  @Test
  @Disabled
  void largestConsecutiveSequence() {
    final var input = List.of(1, 12, 33, 4, 2, 3, 99, 100, 101, 102, 104, 98);
    final var mySolution = InterviewProblemSolutions.largestConsecutiveSequence(input);
    final var yourSolution = 0;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
