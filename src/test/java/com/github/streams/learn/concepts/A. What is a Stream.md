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

---

## How to Create a Stream

There are several ways to get a stream:

### From a Collection

The most common way. Every `Collection` has a `.stream()` method.

```java
var names = List.of("Ali", "Sara", "John");
Stream<String> stream = names.stream();
```

### From an Array

```java
var numbers = new int[]{1, 2, 3, 4, 5};
IntStream stream = Arrays.stream(numbers);
```

### From Static Factory Methods

```java
// From individual values
Stream<String> s1 = Stream.of("a", "b", "c");

// An empty stream (useful as a safe default)
Stream<String> empty = Stream.empty();
```

### From `Stream.generate()` — Infinite Stream

Produces an **infinite** stream by calling a `Supplier` repeatedly.
Always pair it with `limit()` to avoid running forever.

```java
var randoms = Stream.generate(Math::random)
        .limit(5)
        .toList();
```

### From `Stream.iterate()` — Infinite Stream

Produces an **infinite** stream by repeatedly applying a function to a seed value.

```java
// Java 9+ form with a predicate stop condition
var evens = Stream.iterate(0, n -> n < 20, n -> n + 2)
        .toList();

System.out.println(evens);
```

Output
```
[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
```

### From a File (Lines as a Stream)

```java
try (var lines = Files.lines(Path.of("src/test/resources/SonnetI.txt"))) {
    lines.filter(line -> !line.isBlank())
         .forEach(System.out::println);
}
```

> The stream returned by `Files.lines()` must be closed after use. Use try-with-resources.

---

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

> Details of the pipeline are covered in [Stream Pipeline](./C_Stream_Pipeline.md).

---


## Quick Summary

```
java.util.stream.Stream<T>
│
├── Created from → Collection, Array, Stream.of(), Stream.generate(), Files.lines(), …
│
├── Key traits   → no storage, functional, lazy, single-use, optionally parallel
│
├── Pipeline     → source → intermediate ops → terminal op
│
└── Variants     → IntStream, LongStream, DoubleStream  (avoid boxing)
```

---

<div align="right">

[Stream vs Collection](./B_Stream_vs_Collection.md) →

</div>
