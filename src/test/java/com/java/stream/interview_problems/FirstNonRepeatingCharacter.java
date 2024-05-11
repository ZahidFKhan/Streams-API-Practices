package com.java.stream.interview_problems;

/*
*
Q17)  Given a String = The quick brown fox jumps over the lazy dog, find the first non repeated character. (Google interview)


	Solution with java 8 :

	String res = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
	System.out.println(res);


*/
public class FirstNonRepeatingCharacter {}
