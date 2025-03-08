package com.github.streams.interview;

import com.github.streams.interview.problems.employee.ignore.domain_related.Department;
import com.github.streams.interview.problems.employee.ignore.domain_related.Employee;
import com.github.streams.interview.problems.employee.ignore.domain_related.Identity;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProblemSolutions {
  public static Map<String, ? extends Number> findUniqueDomainsCount(List<Identity> people) {
    return people.stream()
        .filter(x -> x.email().split("@").length == 2)
        .map(x -> x.email().split("@")[1])
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  public static Integer maxNumberOfVowels(String input) {
    return Arrays.stream(input.split(" "))
        .map(x -> x.length() - x.replaceAll("[aeiouAEIOU]", "").length())
        .max(Comparator.comparing(Integer::intValue))
        .get();
  }

  public static Map<Integer, List<Integer>> groupingOfNumbers(List<Integer> randomIntegers) {
    return randomIntegers.stream().collect(Collectors.groupingBy(e -> e / 10));
  }

  public static Character firstNonRepeatingCharacter(String input) {
    return input
        .chars()
        .mapToObj(x -> (char) x)
        .filter(x -> input.indexOf(x) == input.lastIndexOf(x))
        .findFirst()
        .orElseThrow(RuntimeException::new);
  }

  public static Employee employeesWorkedForMaxProjects(List<Employee> employees) {
    return employees.stream()
        .max(
            Comparator.comparing((Employee employee) -> employee.projects().size())
                .thenComparing(Employee::totalProjectDurations))
        .get();
  }

  public static Map<String, Long> getHighestSalaryInEachDepartment(Collection<Employee> employees) {
    return employees.stream()
        .collect(
            Collectors.groupingBy(
                e -> e.department().name(),
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparing(Employee::salary)),
                    employee -> employee.get().salary())));
  }

  public static Map<String, Long> getMinSalaryInEachDepartment(Collection<Employee> employees) {
    return employees.stream()
        .collect(
            Collectors.groupingBy(
                e -> e.department().name(),
                Collectors.collectingAndThen(
                    Collectors.minBy(Comparator.comparing(Employee::salary)),
                    employee -> employee.get().salary())));
  }

  public static Map<String, Long> getSumOfSalariesOnEachDepartment(Collection<Employee> employees) {
    final var collect =
        employees.stream()
            .collect(
                Collectors.groupingBy(
                    e -> e.department().name(), Collectors.summingLong(e -> e.salary())));
    return collect;
  }

  public static Map<Department, List<String>> getEmployeesBelongToEachDepartment(
      Collection<Employee> employees) {
    return employees.stream()
        .collect(
            Collectors.groupingBy(
                Employee::department,
                Collectors.mapping(e -> e.identity().name(), Collectors.toList())));
  }

  public static Integer largestConsecutiveSequence(List<Integer> input) {
    final var set = new HashSet<>(input);
    return set.stream()
        .filter(value -> set.contains(value - 1))
        .collect(
            Collectors.toMap(
                Function.identity(),
                x -> {
                  int count = 0;
                  while (set.contains(x++)) {
                    ++count;
                  }
                  return count;
                }))
        .values()
        .stream()
        .max(Comparator.comparing(Integer::intValue))
        .get();
  }

  public static Long getManagerIdHavingMaxEmployees(Collection<Employee> employees) {
    return employees.stream()
        .peek(
            e ->
                System.out.println(
                    "Employee " + e.identity().name() + " works for managerID: " + e.managerId()))
        .collect(Collectors.groupingBy(Employee::managerId, Collectors.counting()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .orElseThrow(RuntimeException::new)
        .getValue();
  }
}
