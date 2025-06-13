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

# Skip:

```java
        List<Footballer> sortByGenderAndNameSkipping5 = footballerList.stream()
        .sorted(Comparator.comparing(Footballer::getGender).thenComparing(Footballer::getName))
        .skip(5)
        .collect(Collectors.toList());
//prints (prettified)
//sortByGenderAndNameSkipping5 = [
//Footballer{name='Alexia', age=25, gender=FEMALE, positions=[CAM, RF, LF]}, 
//Footballer{name='Jana', age=17, gender=FEMALE, positions=[CB]}, 
//Footballer{name='Jennifer', age=29, gender=FEMALE, positions=[CF, CAM]}]
//Note : See the above mentioned Sorted example for comparison


```