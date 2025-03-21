package com.github.streams.interview.problems.strings;

import com.github.streams.interview.InterviewProblemSolutions;
import com.github.streams.interview.problems.employee.ignore.domain_related.Identity;
import java.util.List;
import java.util.Map;
import net.datafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * There is a list of Employees and Employee object has a field called e-mail.
 *
 * Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain?
 * */
class B_UniqueEmailCount {
  @Test
  @Disabled
  void findUniqueDomainsWithCount() {
    final var instance = new Faker();
    final var employees =
        List.of(
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""));

    final var mySolution = InterviewProblemSolutions.findUniqueDomainsCount(employees);

    final Map<String, ? extends Number> yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
