package com.java.stream.interview_problems.domain;

import java.util.List;

public record CorporateEmployee(int id, String name, List<Project> project) {
  public long sumOfProjectDurations() {
    return project.stream().mapToInt(Project::duration).sum();
  }

  public long projectSize() {
    return this.project().size();
  }
}
