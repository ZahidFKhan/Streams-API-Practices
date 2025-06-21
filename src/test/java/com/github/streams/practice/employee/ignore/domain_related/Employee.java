package com.github.streams.practice.employee.ignore.domain_related;

import java.util.Collection;

public record Employee(
    int employeeId,
    Identity identity,
    long salary,
    Department department,
    Collection<Project> projects,
    long managerId) {
  public long totalProjectDurations() {
    return projects.stream().mapToInt(Project::projectDurationInMonths).sum();
  }
}
