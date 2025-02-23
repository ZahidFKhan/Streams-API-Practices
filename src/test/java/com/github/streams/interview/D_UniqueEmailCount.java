package com.github.streams.interview;

import com.github.javafaker.Faker;
import com.github.streams.interview.employee.domain_related.Identity;
import com.github.streams.solutions.InterviewProblemSolutions;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * There is a list of Employees and Employee object has a field called e-mail.
 *
 * Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain?
 * */
class D_UniqueEmailCount {
  @Test
  @Disabled
  void findUniqueDomainsWithCount() {
    final var employees =
        List.of(
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""),
            new Identity(Faker.instance().internet().emailAddress(), ""));

    final var mySolution = InterviewProblemSolutions.findUniqueDomainsCount(employees);

    final Map<String, ? extends Number> yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
