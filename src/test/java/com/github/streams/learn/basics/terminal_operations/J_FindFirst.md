# Data Set

```java
    private List<Footballer> getFootballers() {
        return List.of(
                new Footballer("Messi", 32, Gender.MALE, List.of("CF","CAM", "RF")),
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

# Find First:

findFirst() returns an Optional for the first entry in the stream; the Optional can, of course, be empty.

```java
        Integer findFirst = List.of(4, 1, 3, 7, 5, 6, 2, 28, 15, 29)
        .parallelStream()
        .filter(number -> number > 5)
        .findFirst()
        .get();

        System.out.

println("findFirst = "+findFirst);
//prints findFirst = 7
```