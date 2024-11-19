package com.java.stream.interview.employee.domain_related;

import java.util.List;

public record Employee(int id, Identity identity, List<Project> projects) {
  public long sumOfProjectDurations() {
    return projects.stream().mapToInt(Project::projectDurationInMonths).sum();
  }

  public long projectSize() {
    return this.projects().size();
  }

  public record Identity(String email, String name, long salary) {}
}
