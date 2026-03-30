## Primitive Streams

Boxing `int` into `Integer` for every element is expensive. Java provides three **specialised primitive streams** that avoid this overhead:

| Stream        | Element type | Useful extras                          |
|---------------|-------------|----------------------------------------|
| `IntStream`   | `int`       | `sum()`, `average()`, `range()`        |
| `LongStream`  | `long`      | `sum()`, `average()`, `range()`        |
| `DoubleStream`| `double`    | `sum()`, `average()`                   |

```java
// Sum 1 to 10 without boxing
var total = IntStream.rangeClosed(1, 10).sum();
System.out.println(total); // 55

// Average salary using mapToDouble
var avg = List.of(50_000, 75_000, 90_000).stream()
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElse(0);

System.out.println(avg); // 71666.66...
```

Convert back to an object stream with `.boxed()`:

```java
List<Integer> list = IntStream.range(1, 6).boxed().toList();
System.out.println(list); // [1, 2, 3, 4, 5]
```

---
