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

# All Match:

allMatch() checks if the predicate is true for all the elements in the stream.

```java
        boolean allMatch = footballerList.stream()
                .allMatch(footballer -> footballer.getAge() > 25);
        System.out.println("allMatch = " + allMatch);
        
        //prints allMatch = false
```

