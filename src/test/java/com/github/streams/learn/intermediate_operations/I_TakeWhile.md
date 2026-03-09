# Take While: 

It keeps elements from the start of the stream as long as a condition is true. 
When the condition becomes false, the stream stops processing further elements.

```java
List<Integer> numbers = List.of(1, 2, 3, 6, 2, 4);

List<Integer> result = numbers.stream()
        .takeWhile(n -> n < 5)
        .toList();

System.out.println(result);
```

Output:
```java
[1, 2, 3]
```
