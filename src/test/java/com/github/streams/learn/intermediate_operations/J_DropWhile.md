# Drop While:
It skips elements from the beginning of a stream as long as a given condition is true. 
Once the condition becomes false, it stops dropping elements and processes the rest of the stream normally.

```
        List<Integer> dropWhile = Stream.of(2, 4, 6, 8, 9, 10, 11, 12)
                .dropWhile(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("dropWhile = " + dropWhile);
```
Output:
```java
[9, 10, 11, 12]
```