package com.java.stream.general_problems;

/*
Q16) Given a numeric array , re arrange the elements to form a highest possible value.

input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

output is: 998764543431
Solution is: Arrays.stream(arr).mapToObj(i-> i+"").sorted((o1,o2) -> (o2+o1).compareTo(o1+o2)).forEach(System.out::print)


	2) Arrays.stream(arr12).mapToObj(i-> i+"").sorted(Collections.reverseOrder()).forEach(System.out::print); ( solution is wrong. Associates need to fix it).


* */
public class Al_ReArrangeElementInDecendingOrderTest {}
