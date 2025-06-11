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

# Peek:

It performs the specified operation on each element of the stream and returns a new stream which can be used further.

```java        
        long malePlayerCount = footballerList.stream()
        .filter(footballer -> footballer.getGender().equals(Gender.MALE))
        .sorted(Comparator.comparing(Footballer::getAge))
        .peek(footballer -> {
            System.out.println("footballer = " + footballer);
        })
        .count();

        System.out.

println("malePlayerCount = "+malePlayerCount);
//        prints
//        footballer = Footballer{name='Surinder', age=20, gender=MALE, positions=[CM, CDM]}
//        footballer = Footballer{name='Arthur', age=23, gender=MALE, positions=[CM, CAM]}
//        footballer = Footballer{name='Manoj', age=27, gender=MALE, positions=[GK]}
//        footballer = Footballer{name='Ibrahim', age=28, gender=MALE, positions=[CF, CAM, LF]}
//        footballer = Footballer{name='Messi', age=32, gender=MALE, positions=[CF, CAM, RF]}
//        malePlayerCount = 5
```

