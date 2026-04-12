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
<td style="text-align: left;">

← [Single-Use Streams](./I%20Single%20Use%20Streams.md)

</td>
<td style="text-align: right;">

[When NOT to Use Streams API?](./K%20When%20Not%20To%20Use%20Streams%20API.md) →

</td>
</tr>
</table>

