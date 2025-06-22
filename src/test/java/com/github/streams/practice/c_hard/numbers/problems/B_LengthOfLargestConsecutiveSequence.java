package com.github.streams.practice.c_hard.numbers.problems;

import com.github.streams.practice.c_hard.numbers.HardNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/// ### Longest Consecutive Sequence
///
/// Given an unsorted array of integers `nums`, return the length of the longest consecutive
// elements
/// sequence.
///
/// You must write an algorithm that runs in $O(n)$ time.
///
/// ### Example 1:
///
/// ```
/// Input: nums = [100, 4, 200, 1, 3, 2]
/// ```
/// ```
/// Output: 4
/// ```
/// Explanation: The longest consecutive elements sequence is `[1, 2, 3, 4]`. Therefore its length
// is 4.
///
/// ### Example 2:
///
/// ```
/// Input: nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
/// ```
/// ```
/// Output: 9
/// ```
class B_LengthOfLargestConsecutiveSequence {
  @Test
  @Disabled
  void largestConsecutiveSequence() {
    final var input = List.of(1, 12, 33, 4, 2, 3, 99, 100, 101, 102, 104, 98);
    final var mySolution = HardNumbersProblemSolution.largestConsecutiveSequence(input);
    final var yourSolution = 0;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
