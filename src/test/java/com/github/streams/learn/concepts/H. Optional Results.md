# Optional Results

Some terminal operations may not find a value. In that case, streams often return `Optional` instead of `null`.

Common examples:
- `findFirst()`
- `findAny()`
- `max()`
- `min()`

Example
```java
var firstEven = List.of(1, 3, 5, 8, 10).stream()
        .filter(number -> number % 2 == 0)
        .findFirst();

System.out.println(firstEven.orElse(0));
```

Output
```java
8
```

Using `Optional` makes missing values explicit and safer to handle.

---

<table>
<tr>
<td align="left">

← [Single-Use Streams](./G. Single-Use Streams.md)

</td>
<td align="right">

[When NOT to Use Streams API?](./I. When NOT to Use Streams API?.md) →

</td>
</tr>
</table>

