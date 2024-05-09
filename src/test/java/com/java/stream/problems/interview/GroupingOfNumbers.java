package com.java.stream.problems.interview;

/*
*
Q12) Given an array of integers (2, 34, 54, 23, 33, 20, 59, 11, 19, 37 ) group the numbers by the range they belong to. The put put should be {0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}

Solution is:
Map<Integer, List<Integer>> map = 
 Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19,37).collect(Collectors.groupingBy (i -> i/10 * 10 )); 
                System.out.println(map);

*/
public class GroupingOfNumbers {

}
