# Limit:

It restricts the stream to the first `n` elements and ignores the rest.

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

List<Integer> result = numbers.stream()
        .limit(3)
        .toList();

System.out.println(result);
```
Output:
```java
[1, 2, 3]
```

---

<table>
<tr>
<td style="text-align: left;">

<- [Peek](./F_Peek.md)

</td>
<td style="text-align: right;">

[Skip](./H_Skip.md) ->

</td>
</tr>
</table>
