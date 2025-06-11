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

# To Array:

If we need to get an array out of the stream, we can simply use toArray().

```java
        Footballer[] femaleFootballers = footballerList.stream()
                .filter(footballer -> footballer.getGender().equals(Gender.FEMALE))
                .toArray(Footballer[]::new);

        System.out.println("femaleFootballers = " + Arrays.asList(femaleFootballers));
        //prints To Array femaleFootballers = [Footballer{name='Jennifer', age=29, gender=FEMALE, positions=[CF, CAM]}, Footballer{name='Jana', age=17, gender=FEMALE, positions=[CB]}, Footballer{name='Alexia', age=25, gender=FEMALE, positions=[CAM, RF, LF]}]

```