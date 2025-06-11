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

# Reduce:

```java
        Optional<String> longestName = footballerList.stream()
                .map(Footballer::getName)
                .reduce((name1, name2)
                        -> name1.length() > name2.length()
                        ? name1 : name2);

        longestName.ifPresent(System.out::println);
        //prints Manoj
```

