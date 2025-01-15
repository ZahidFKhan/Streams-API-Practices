package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.util.stream.Collectors.toList;

/**
 * Finds the words with the given number of vowels in a given string. <br>
 * <br>
 * Example:
 *
 * <pre>
 *  "The quick brown fox jumps right over the little lazy dog.";
 * </pre>
 *
 * <pre>
 *   Number of Vowels: 2
 *   Words with Maximum Vowels: [quick, over, little]
 * </pre>
 *
 * <br>
 * Example:
 *
 * <pre>
 *  "Hello World";
 * </pre>
 *
 * <pre>
 *   Maximum Number of Vowels: 2
 *   Words with Maximum Vowels: [Hello, World]
 * </pre>
 */
class A_MatchesNoOfVowelsTest {
  @Test
//  @Disabled
  void testAM_MaxNoOfVowelsTest() {
    var input = "The quick brown fox jumps right over the little lazy dog.";
    final var length = 2;

    //var mySolution = GeneralStringProblemsSolution.getMatchesVowels(input, length);
    var mySolution = this.getMatchesVowels(input, length);
    var yourSolution = List.of("quick", "over", "little");
    Assertions.assertEquals(mySolution, yourSolution);
  }

  private List<String> getMatchesVowels(String input, int length) {
    return Arrays.stream(input.split(" "))
            .filter(word-> {
              String transformedWord = word.replaceAll("[aeiouAEIOU]", "");
              System.out.println("Original word: " + word + ", After replaceAll: " + transformedWord); // Debugging statement
              System.out.println("Length - transformedWord.length()" + transformedWord.length() + " : " + (word.length() - length));
              return transformedWord.length() == word.length() - length;
    }).toList();
  };

}
