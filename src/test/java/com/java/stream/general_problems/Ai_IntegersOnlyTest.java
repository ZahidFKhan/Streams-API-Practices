package com.java.stream.general_problems;

/*
* Q13) Given a List of Strings  ["as", "123", "32", "2as"], create another Integer list that contains only integers. The output shoul be: List<Integer> iList = [123,32]
Solution:
listOfStrings.stream().filter( ss -> ss.matches("[0-9]*")).map(Integer::valueOf).collect(Collectors.toList());

*/
public class Ai_IntegersOnlyTest {}
