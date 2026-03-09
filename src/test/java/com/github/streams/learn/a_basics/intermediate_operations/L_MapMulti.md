## MapMulti:
Instead of creating a new stream for each element, it directly sends the generated values to the next step in the stream. 
This makes it simpler and sometimes more efficient when you want to expand or flatten data.


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

