# Data Set

```java
   List<Footballer> getFootballers() {
        return List.of(
                new Footballer("Messi", 32, Gender.MALE, List.of("CF","CAM", "RF")),
                new Footballer("Ibrahim", 28, Gender.MALE, List.of("CF", "CAM", "LF")),
                new Footballer("Arthur", 23, Gender.MALE, List.of("CM", "CAM")),
                new Footballer("Cristiano Ronaldo", 27, Gender.MALE, List.of("GK")),
                new Footballer("Surinder", 20, Gender.MALE, List.of("CM", "CDM")),
                new Footballer("Jennifer", 29, Gender.FEMALE, List.of("CF", "CAM")),
                new Footballer("Jana", 17, Gender.FEMALE, List.of("CB")),
                new Footballer("Alexia", 25, Gender.FEMALE, List.of("CAM", "RF", "LF"))
        );
    }
```

# Map:

The `map()` produces a new stream after applying a function to each element of the original stream. The new stream could
be of different type.

#### Example: Get all females footballers over 24 years old and count them.

```java
        long femalesMoreThan24y = footballerList.stream()
        .filter(footballer -> footballer.getGender().equals(Gender.FEMALE))
        .map(Footballer::getAge)
        .filter(age -> age > 24)
        .count();
```

#### Output:

```
femalesMoreThan24y = 2
```
