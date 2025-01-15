package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the length of city names that start with 'm' or 'M'.
 * <br>
 * <br>
 * <h3>Example Cities</h3>
 * <ul>
 *   <li>Mumbai</li>
 *   <li>Munnar</li>
 *   <li>Chennai</li>
 *   <li>Hyderabad</li>
 * </ul>
 *
 */
class C_LengthOfCityTest {
  @Test
//  @Disabled
  void testCalculateLengthOfEachCityTest() {
    final var cities = List.of("Mumbai", "Munnar", "Chennai", "Hyderabad");
//    final var mySolution = GeneralStringProblemsSolution.findLengthOfEachCityAlongWithSize(cities);
    final var mySolution = this.findLengthOfEachCityAlongWithSize(cities);

    final Map<String, Integer> yourSolution = new HashMap<>();
    yourSolution.put("Munnar", 6);
    yourSolution.put("Mumbai", 6);
    Assertions.assertEquals(yourSolution, mySolution);
  }

  private Map<String, Integer> findLengthOfEachCityAlongWithSize(List<String> cities) {
    return cities.stream()
            .filter(city-> city.toLowerCase().startsWith("m"))
            .collect(Collectors.toMap(city-> city, city->city.length()));
  }
}
