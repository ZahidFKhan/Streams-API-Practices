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

# Distinct:

Returns distinct elements in the stream, eliminating duplicates. It uses the equals() method of the elements to decide
whether two elements are equal or not.

```java
        String allUniquePositionsOfMaleLessThan30y = footballerList.stream()
        .filter(footballer -> footballer.getGender().equals(Gender.MALE))
        .filter(footballer -> footballer.getAge() < 30)
        .map(Footballer::getPositions)
        .flatMap(Collection::stream)
        .distinct()
        .collect(Collectors.joining(","));

        System.out.

println("allUniquePositionsOfMaleLessThan30y = "+allUniquePositionsOfMaleLessThan30y);
//prints allUniquePositionsOfMaleLessThan30y = CF,CAM,LF,CM,GK,CDM
```


