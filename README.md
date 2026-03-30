# Java Stream API Practice Exercises for Java 17+

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![GitHub forks](https://img.shields.io/github/forks/ZahidFKhan/Streams-API-Practices?logo=github)](https://github.com/ZahidFKhan/Streams-API-Practices)
[![GitHub stars](https://img.shields.io/github/stars/ZahidFKhan/Streams-API-Practices?logo=github)](https://github.com/ZahidFKhan/Streams-API-Practices)
![Java 17](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36)
![JUnit 5](https://img.shields.io/badge/Tested%20with-JUnit%205-25A162)

---

## How to use? 🛠️

1. Fork this repository.
2. Remove the `@Disabled` Tags.
3. Solve the Problem.

##### NOTE: Don't forget to rate this to bookmark.

--- 
This repository is a **Java Stream API practice project** built with **Java 17**, **Maven**, and **JUnit 5**. It helps developers learn Java streams through **step-by-step notes**, **intermediate and terminal operation examples**, and **hands-on coding exercises** across easy, medium, and hard difficulty levels.

If you are searching for **Java Stream API exercises**, **Java stream interview-style practice**, **functional programming examples in Java**, or **Stream API problems with solutions**, this project is designed to be a practical learning resource.

### Why this repository is useful

- Learn the Java Stream API from core concepts to advanced problem solving.
- Practice `filter`, `map`, `flatMap`, `distinct`, `sorted`, `reduce`, `collect`, and more.
- Solve JUnit-based exercises where your answer is compared against a reference solution.
- Explore related topics like functional interfaces and stream gatherers.
- Use a repository layout that is easy to study, fork, and extend.

### Learning path

1. Start with [`learn/concepts`](./src/test/java/com/github/streams/learn/concepts/)
2. Review [`learn/intermediate_operations`](./src/test/java/com/github/streams/learn/intermediate_operations/)
3. Review [`learn/terminal_operations`](./src/test/java/com/github/streams/learn/terminal_operations/)
4. Solve [`practice/a_easy_problems`](./src/test/java/com/github/streams/practice/a_easy_problems/)
5. Move to [`practice/b_medium_problems`](./src/test/java/com/github/streams/practice/b_medium_problems/)
6. Finish with [`practice/c_hard_problems`](./src/test/java/com/github/streams/practice/c_hard_problems/)
7. Explore [`practice/functional_interfaces`](./src/test/java/com/github/streams/practice/functional_interfaces/)
8. Explore gatherer notes in [`learn/gatherers`](./src/test/java/com/github/streams/learn/gatherers/) and gatherer exercises in [`practice/gatherers`](./src/test/java/com/github/streams/practice/gatherers/)

For a topic-by-topic index, open [`TOPICS.md`](./TOPICS.md).

#### Repository structure
```text
src/test/java/com/github/streams/
├── learn/
│   ├── concepts/
│   ├── gatherers/
│   ├── intermediate_operations/
│   └── terminal_operations/
└── practice/
    ├── a_easy_problems/
    │   ├── numbers/
    │   └── strings/
    ├── b_medium_problems/
    │   ├── employee/
    │   ├── numbers/
    │   └── strings/
    ├── c_hard_problems/
    │   └── numbers/
    ├── functional_interfaces/
    └── gatherers/
```
Each exercise follows the same pattern:

1. Open a test class under `src/test/java/com/github/streams/practice/...`
2. Remove the `@Disabled` annotation
3. Write your Stream API solution in the `yourSolution` variable
4. Run the test and compare your implementation against mine.




## What you will find inside

### Java Stream API concept notes

- Beginner-friendly stream fundamentals
- Stream vs collection differences
- Lazy evaluation
- Optional results
- When not to use the Streams API

### Intermediate operation guides

- `filter`
- `map`
- `flatMap`
- `distinct`
- `sorted`
- `peek`
- `limit`
- `skip`
- `takeWhile`
- `dropWhile`
- `mapMulti`

### Terminal operation guides

- `count`
- `forEach`
- `forEachOrdered`
- `toArray`
- `min` / `max`
- `anyMatch` / `allMatch` / `noneMatch`
- `findFirst` / `findAny`
- `reduce`
- `collect`

### Practice tracks

- Easy number and string problems
- Medium number, string, and employee aggregation problems
- Hard number challenges such as prime streams and consecutive sequence problems
- Functional interface exercises with `Predicate`, `Function`, `Consumer`, `Supplier`, and more
- Gatherer practice for modern stream processing patterns

## Who this repository is for

- Java beginners learning the Stream API
- Intermediate Java developers looking to solidify their stream knowledge
- Experienced Java engineers preparing for coding interviews that involve stream-based problems
- Developers preparing for coding interviews involving streams
- Engineers who want Java functional programming examples
- Students looking for JUnit-based practice problems with solutions

##### Support the project
If this repository helps you learn Java streams, consider starring it so more developers can discover it.