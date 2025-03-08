package com.github.streams.interview.problems.employee.ignore.domain_related.dummy_data;

import com.github.streams.interview.problems.employee.ignore.domain_related.Department;
import com.github.streams.interview.problems.employee.ignore.domain_related.Project;
import java.util.Collection;
import java.util.List;

public class DummyProjects {
  private DummyProjects() {
    throw new AssertionError("No instances");
  }

  public static Collection<Project> listOfProjects1() {
    return List.of(
        new Project("E1", 2, Department.ComputerScience),
        new Project("E2", 1, Department.ComputerScience),
        new Project("E3", 2, Department.Civil),
        new Project("E4", 2, Department.Chemical));
  }

  public static Collection<Project> listOfProjects2() {
    return List.of(
        new Project("E1", 2, Department.ComputerScience),
        new Project("E2", 2, Department.ComputerScience),
        new Project("E3", 2, Department.ComputerScience),
        new Project("E4", 2, Department.ComputerScience));
  }
}
