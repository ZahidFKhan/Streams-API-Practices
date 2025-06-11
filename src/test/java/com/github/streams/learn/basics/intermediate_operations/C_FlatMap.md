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

# FlatMap:

A stream can hold complex data structures like Stream<List<String>>. In cases like this, `flatMap()` helps us to flatten
the data structure to simplify further operations.

```java
        String allPositionsOfMaleLessThan30y = footballerList.stream()
        .filter(footballer -> footballer.getGender().equals(Gender.MALE))
        .filter(footballer -> footballer.getAge() < 30)
        .map(Footballer::getPositions)
        .flatMap(Collection::stream)
        .collect(Collectors.joining(","));

        System.out.

println("allPositionsOfMaleLessThan30y = "+allPositionsOfMaleLessThan30y);
//prints allPositionsOfMaleLessThan30y = CF,CAM,LF,CM,CAM,GK,CM,CDM
```