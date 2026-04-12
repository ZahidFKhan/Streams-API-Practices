## MapMulti:
Instead of creating a new stream for each element, it directly sends the generated values to the next step in the stream. 
This makes it simpler and sometimes more efficient when you want to expand or flatten data. 
Often, you can achieve the same result using filter and map. But the problem with that is we have to use 2 different streams
and do the operations twice. MultiMap allows us to do the both operation of filter and map in one stream thus makes it efficient.


### Example 1:

```java
List<String> words = List.of("Hi", "Java");

List<Character> result = words.stream()
        .<Character>mapMulti((word, consumer) -> {
            for (char c : word.toCharArray()) {
                consumer.accept(c);
            }
        })
        .toList();

System.out.println(result);
```
Output:
```java
[H, i, J, a, v, a]
```
### Example 2:

````java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

List<Integer> result = numbers.stream()
        .<Integer>mapMulti((n, consumer) -> {
            if (n % 2 == 0) {
                consumer.accept(n);
            }
        })
        .toList();
````

Output:
```java
[1, 2, 3, 4]
```

---

<table>
<tr>
<td style="text-align: left;">

← [Previous: J Drop While](./J%20Drop%20While.md)

</td>
<td style="text-align: right;">
</td>
</tr>
</table></div>
