# Skip:
It ignores the first `n` elements of a stream and processes the remaining elements.

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

List<Integer> result = numbers.stream()
        .skip(2)
        .toList();

System.out.println(result);
```
Output:
```java
[3, 4, 5]
```

---

<table>
<tr>
<td align="left">

<- [Limit](./G_Limit.md)

</td>
<td align="right">

[TakeWhile](./I_TakeWhile.md) ->

</td>
</tr>
</table>
