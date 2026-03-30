# What is a Stream?

## Basic Definition

A `Stream<T>` is a **sequence of elements** that supports a chain of operations to produce a result or a side effect.

It does **not store** data. It carries data from a source through a pipeline of steps.

---

## The `Stream<T>` Interface

`Stream<T>` lives in the `java.util.stream` package and was introduced in **Java 8**.

```java
import java.util.stream.Stream;
```

It is a **generic interface**. The type parameter `T` is the type of each element flowing through the pipeline.

```java
Stream<String>  // a stream of strings
Stream<Integer> // a stream of integers
Stream<Employee>// a stream of objects
```

## Key Characteristics

| Characteristic    | What it means                                                |
|-------------------|--------------------------------------------------------------|
| **Not a storage** | Streams carry data from a source; they do not hold it        |
| **Functional**    | Operations take lambdas or method references, not statements |
| **Lazy**          | Intermediate steps do not execute until a terminal is called |
| **Single-use**    | Once a terminal operation runs, the stream is consumed       |
| **Possibly parallel** | Any stream can be made parallel with `.parallelStream()` |

---

## The Three Parts of a Pipeline

Every stream expression follows the same three-part structure:

```
Source  →  Zero or more intermediate operations  →  One terminal operation
```

```java
var result = List.of(5, 3, 8, 1, 9, 2).stream()   // 1. source
        .filter(n -> n > 3)                        // 2. intermediate
        .sorted()                                  // 2. intermediate
        .toList();                                 // 3. terminal

System.out.println(result);
```

Output
```
[5, 8, 9]
```

> Pipeline execution is covered further in [Intermediate vs Terminal Operations](./E. Intermediate vs Terminal Operations.md).

---

<div align="right">

[How to Create a Stream](./B. How to Create a Stream?.md) →

</div>
