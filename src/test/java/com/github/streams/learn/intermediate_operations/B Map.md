# Map:

Map is an intermediate operation used to transform each element of a stream into another value.
It applies a function to every element and produces a new stream containing the transformed elements.

Example
```java
List<Integer> result = List.of(1, 2, 3, 4).stream()
.map(n -> n * 2)
.toList();

System.out.println(result);
```


Output
```java
[2, 4, 6, 8]
```

---

<table>
<tr>
<td style="text-align: left;">

← [Previous: A Filter](./A%20Filter.md)

</td>
<td style="text-align: right;">

[Next: C Flat Map](./C%20Flat%20Map.md) →

</td>
</tr>
</table>
