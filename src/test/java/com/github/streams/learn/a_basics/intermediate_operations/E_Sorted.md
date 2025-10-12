# Data Set

```java
   List<Footballer> getFootballers() {
    return List.of(
            new Footballer("Messi", 32, Gender.MALE, List.of("CF", "CAM", "RF")),
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

# Sorted:

The `sorted` method is used to sort the stream.

#### Example: Sort footballers by Gender and if they have the same gender sort by their names.
```java
        List<Footballer>  sortByGenderAndName= footballerList.stream()
                .sorted(Comparator.comparing(Footballer::getGender).thenComparing(Footballer::getName))
                .collect(Collectors.toList());

```

#### Output:

```java
sortByGenderAndName =[

Footballer {
    name = 'Arthur', age = 23, gender = MALE, positions =[CM, CAM]},

Footballer {
    name = 'Ibrahim', age = 28, gender = MALE, positions =[CF, CAM, LF]},

Footballer {
    name = 'Messi', age = 32, gender = MALE, positions =[CF, CAM, RF]},

Footballer {
    name = 'Surinder', age = 20, gender = MALE, positions =[CM, CDM]},

Footballer {
    name = 'Cristiano Ronaldo', age = 27, gender = MALE, positions =[GK]},

Footballer {
    name = 'Alexia', age = 25, gender = FEMALE, positions =[CAM, RF, LF]},

Footballer {
    name = 'Jana', age = 17, gender = FEMALE, positions =[CB]},

Footballer {
    name = 'Jennifer', age = 29, gender = FEMALE, positions =[CF, CAM]},
        ]
```


