package com.java.stream.interview.employee.domain_related;

import java.util.List;

public record Employee(Identity identity, long salary, Department department, List<Project> projects) {
  public long totalProjectDurations() {
    return projects.stream().mapToInt(Project::projectDurationInMonths).sum();
  }

  public long projectSize() {
    return this.projects().size();
  }

  public record Identity(String email, String name) {}
}
