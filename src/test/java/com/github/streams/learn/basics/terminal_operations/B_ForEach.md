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

# For Each:

It loops over the stream elements, calling the supplied function on each element.

```java
        List.of(4,1,6,7,19,2,3,81,64).stream()
                .parallel()
                .filter(number -> number<65)
                .forEach(number -> System.out.println("number = " + number));
                //prints
                //forEach
                //number = 2
                //number = 19
                //number = 3
                //number = 4
                //number = 6
                //number = 7
                //number = 1
                //number = 64
```

