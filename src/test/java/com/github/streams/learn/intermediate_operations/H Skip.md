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
<td style="text-align: left;">

← [Previous: G Limit](./G%20Limit.md)

</td>
<td style="text-align: right;">

[Next: I Take While](./I%20Take%20While.md) →

</td>
</tr>
</table>
