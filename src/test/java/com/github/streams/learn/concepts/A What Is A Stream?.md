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
<table>
<tr>
<td style="text-align: left;">

</td>
<td style="text-align: right;">
<a href="./B%20Characteristics%20Of%20A%20Stream.md">Next: B Characteristics Of A Stream.md</a>
</td>
</tr>
</table>
