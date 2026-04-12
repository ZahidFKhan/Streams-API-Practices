# How to Create a Stream?

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
<table>
<tr>
<td style="text-align: left;">
<a href="./B%20Characteristics%20Of%20A%20Stream.md">Previous: B Characteristics Of A Stream.md</a>
</td>
<td style="text-align: right;">
<a href="./D%20Primitive%20Streams.md">Next: D Primitive Streams.md</a>
</td>
</tr>
</table>
