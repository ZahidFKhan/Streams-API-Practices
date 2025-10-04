package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Imagine you’re building a registration system for a website. Sometimes, due to user error or
 * system retries, duplicate emails get stored in your list.
 * You want to keep only unique email addresses before sending a newsletter.
 */
class C_UniqueEmailAddresses {
  @Test
  @Disabled
  void uniqueEmailAddresses() {
    final var input =
        List.of(
            "john.doe@example.com",
            "alice@example.com",
            "john.doe@example.com", // duplicate
            "bob@example.com",
            "alice@example.com" // duplicate
            );

    final var mySolution = EasyNumbersProblemSolution.uniqueEmailAddresses(input);
    final var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
