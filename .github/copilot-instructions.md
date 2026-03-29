# GitHub Copilot Instructions – Streams-API-Practices

## Project Overview
A **Java 17 Maven** project by Zahid Khan for learning and practising the **Java Stream API**. All source code lives exclusively in `src/test/java` — there is no `src/main/java` directory.

---

## Tech Stack
| Concern | Technology / Version |
|---|---|
| Language | Java 17 |
| Build tool | Maven |
| Test framework | JUnit Jupiter 5.13.1 |
| Boilerplate reduction | Lombok 1.18.38 |
| Test-data generation | DataFaker 2.4.3 |

---

## Repository Layout

```
src/test/java/com/github/streams/
├── learn/                          # Markdown docs + concept notes
│   ├── gatherers/                  # Notes on Java 22 Stream Gatherers
│   ├── intermediate_operations/    # filter, map, flatMap, distinct, sorted …
│   └── terminal_operations/        # count, forEach, reduce, collect …
└── practice/                       # Hands-on exercises (JUnit tests)
    ├── a_easy_problems/
    │   ├── numbers/                # CountEven, Celsius→Fahrenheit, sorting …
    │   └── strings/                # Vowels, largest word, duplicates …
    ├── b_medium_problems/
    │   ├── employee/               # Salary / department aggregations
    │   ├── numbers/
    │   └── strings/
    ├── c_hard_problems/
    │   └── numbers/                # Prime streams, longest consecutive seq.
    ├── functional_interfaces/      # Predicate, Function, Consumer, Supplier …
    └── gatherers/                  # Scan, WindowFixed
```

---

## Exercise Pattern
1. Each exercise is a **JUnit 5 test class** with the test annotated `@Disabled`.
2. A companion **`*Solution.java`** file in the same package contains the reference implementation (e.g. `EasyNumbersProblemSolution`, `StringProblemsSolution`, `HardNumbersProblemSolution`).
3. **Workflow**: remove `@Disabled` → write your Stream-based solution in the `yourSolution` variable → run the test and compare against `mySolution`.

---

## Coding Conventions
- Use the **Java Stream API** for all solutions — avoid imperative loops where a stream equivalent exists.
- Prefer **`toList()`** (Java 16+) over `Collectors.toList()`.
- Use **`var`** for local variables where the type is obvious.
- Tests use `Assertions.assertEquals(mySolution, yourSolution, message)` — keep the argument order.
- Lombok annotations (`@Data`, `@Builder`, `@AllArgsConstructor`, etc.) are available for model/data classes.
- DataFaker is available for generating realistic fake test data.

---

## Build & Test
```bash
# Compile and run all tests (skips gatherer tests on JDK < 25 via Maven profile)
mvn test

# Run tests for a specific class
mvn test -Dtest=A_CountEvenNumbers

# Run only the gatherer tests (requires JDK 25+)
mvn test -P "!enable-upto-jdk17-testcases"
```

---

## Notes for Copilot
- When suggesting solutions, always use the **Java Stream API**.
- Gatherers (`java.util.stream.Gatherer`) are a **JDK 22+ preview / JDK 24 GA** feature — the project conditionally excludes gatherer tests on older JDKs via the `enable-upto-jdk17-testcases` Maven profile.
- Do **not** add a `src/main/java` directory — all code belongs under `src/test/java`.
- Package root: `com.github.streams`.

