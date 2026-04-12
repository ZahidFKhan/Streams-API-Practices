# Characteristics of a Stream

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

> Pipeline execution is covered further in [Intermediate vs Terminal Operations](./G%20Intermediate%20Vs%20Terminal%20Operations.md).

---
[Previous: A What Is A Stream?.md](./A%20What%20Is%20A%20Stream%3F.md)
[Next: C How To Create A Stream?.md](./C%20How%20To%20Create%20A%20Stream%3F.md)
