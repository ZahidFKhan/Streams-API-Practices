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

# Limit:

The `limit` method is used to reduce the size of the stream.

```java
        List<Footballer> twoMaleFootballers = footballerList.stream()
        .filter(footballer -> footballer.getGender().equals(Gender.MALE))
        .limit(2)
        .collect(Collectors.toList());
//prints 
//twoMaleFootballers = [Footballer{name='Messi', age=32, gender=MALE, positions=[CF, CAM, RF]}, Footballer{name='Ibrahim', age=28, gender=MALE, positions=[CF, CAM, LF]}]

```
