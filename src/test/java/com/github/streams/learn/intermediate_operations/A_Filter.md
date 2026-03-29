# Filter:

The `filter` is an intermediate operation used to select elements from a stream based on a condition. Only the elements that satisfy the predicate (return true) are kept, and the rest are removed.

Example
```java
List<Integer> result = List.of(1, 2, 3, 4, 5).stream()
.filter(n -> n % 2 == 0)
.toList();

System.out.println(result);
```
Output
```java
[2, 4]
```

---

<div align="right">

[Map](./B_Map.md) ->

</div>
