package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Exercise focusing on the Stream.map() function. The goal is to convert a list of temperatures
 * from Celsius (Integers) to Fahrenheit (Doubles) using the formula:
 * F = (C * 9/5) + 32.
 * This requires using the map function to transform each element and ensure the result is collected into
 * a List<Double>.
 */
class B_MapCelsiusToFahrenheit {

  @Test
  @Disabled
  void convertCelsiusToFahrenheit() {
    final var input = List.of(0, 10, 25, 37, 100);

    final var mySolution = EasyNumbersProblemSolution.convertCelsiusToFahrenheit(input);
    final var yourSolution = List.<Double>of(); // WRITE YOUR IMPLEMENTATION HERE//

    Assertions.assertEquals(
        mySolution,
        yourSolution,
        "Your solution is incorrect. Check the Celsius to Fahrenheit formula: F = (C * 9.0 / 5.0) + 32.");
  }
}
