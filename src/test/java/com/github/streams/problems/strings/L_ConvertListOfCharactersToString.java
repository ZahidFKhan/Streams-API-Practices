package com.github.streams.problems.strings;

import com.github.streams.solutions.GeneralStringProblemsSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class L_ConvertListOfCharactersToString {
  @Test
  @Disabled
  void convertListOfCharactersToString() {
    var listOfCharacters =
        List.of(
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    var mySolution =
        GeneralStringProblemsSolution.convertListOfCharactersToString(listOfCharacters);
    var yourSolution = "";
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
