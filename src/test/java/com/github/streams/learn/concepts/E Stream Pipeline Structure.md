
# Structure of a Stream Pipeline

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

<div align="right">

[How to Create a Stream](./C%20How%20To%20Create%20A%20Stream.md) →

</div>
