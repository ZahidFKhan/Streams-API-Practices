package com.stream.problems;

/*
 *
 * You are given a list of employees.
 * Each employee has an id, name, and a list of projects they have worked on.
 *
 * Each project has a name and duration in months.
 *
 * Write a Java program to find the employee who has worked on the most projects.
 *
 * If there are multiple employees with the same maximum number of projects,
 *
 * return the employee with the longest total duration of projects. If there are still ties, return any one of the tied employees.*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class af_InterviewProblem {
    @Test
    @Disabled("Remove This Once you Complete The Exercise")
    public void numberOfOccurencesOfEachCharacter() {
        final List<Project> projects1 = List.of(
                new Project("EPAM1", 2),
                new Project("EPAM2", 1),
                new Project("EPAM3", 2),
                new Project("EPAM4", 2)
        );

        final List<Project> projects2 = List.of(
                new Project("EPAM1", 2),
                new Project("EPAM2", 2),
                new Project("EPAM3", 2),
                new Project("EPAM4", 2)
        );

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Priyanka", projects1));
        employees.add(new Employee(2, "Zahid", projects2));


        var actualOutput = ""; // Assert that the actual output matches the expected output
    }

    private Map<Character, Long> solution1() {
        String input = "the quick brown fox jumps right over the little lazy dog little";
        return input.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

    }

    void solution() {
        final List<Project> projects1 = List.of(
                new Project("EPAM1", 2),
                new Project("EPAM2", 1),
                new Project("EPAM3", 2),
                new Project("EPAM4", 2)
        );

        final List<Project> projects2 = List.of(
                new Project("EPAM1", 2),
                new Project("EPAM2", 2),
                new Project("EPAM3", 2),
                new Project("EPAM4", 2)
        );

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Priyanka", projects1));
        employees.add(new Employee(2, "Zahid", projects2));


        final Optional<Employee> first = employees.stream()
                .map(x -> (Employee) x)
                .max(Comparator.comparing(Employee::projectSize)
                        .thenComparing(Employee::sumOfProjectDurations))
                .stream().findFirst();
        ;

    }
}

record Employee(int id, String name, List<Project> project) {
    public long sumOfProjectDurations() {
        return project.stream().mapToInt(Project::duration).sum();
    }

    public long projectSize() {
        return this.project().size();
    }
}

record Project(String name, int duration) {
}
