# Data Set

```java
    private List<Footballer> getFootballers() {
    return List.of(
            new Footballer("Messi", 32, Gender.MALE, List.of("CF", "CAM", "RF")),
            new Footballer("Ibrahim", 28, Gender.MALE, List.of("CF", "CAM", "LF")),
            new Footballer("Arthur", 23, Gender.MALE, List.of("CM", "CAM")),
            new Footballer("Manoj", 27, Gender.MALE, List.of("GK")),
            new Footballer("Surinder", 20, Gender.MALE, List.of("CM", "CDM")),
            new Footballer("Jennifer", 29, Gender.FEMALE, List.of("CF", "CAM")),
            new Footballer("Jana", 17, Gender.FEMALE, List.of("CB")),
            new Footballer("Alexia", 25, Gender.FEMALE, List.of("CAM", "RF", "LF"))
    );
}
```

# Take While:

```
        //Normal Filter
        List<Integer> filteredList = Stream.of(2, 4, 6, 8, 9, 10, 11, 12)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("filteredList = " + filteredList);
        //prints filteredList = [2, 4, 6, 8, 10, 12]

        //Take, While ...
        List<Integer> takeAWhile = Stream.of(2, 4, 6, 8, 9, 10, 11, 12)
                .takeWhile(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("takeAWhile = " + takeAWhile);
        //prints takeAWhile = [2, 4, 6, 8]

```
