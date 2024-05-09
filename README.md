Q7) Given a word, find the occurrence of Each Character
Q8) There is a list of Employees and Employee object has a field called e-mail. Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain.
Q9) Given a string, find the words with the maximum number of vowels.

       "The quick brown fox jumps right over the little lazy dog."
        Maximum Number of Vowels: 2
        output Words: quick, over, little  ( because each word has maximum of 2 vowels)



Solution is:

String s = "The quick brown fox jumps right over the little lazy dog.";
Arrays.stream(s.split(" "))
.filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2)
.forEach(System.out::println);



NOTE: Please understand the REGEX solution here


Q10) Reverse a string with speical characters and Speical characters position shouldn't be changed".



Solution is:



public static String reverseString(String input) {

        String reversedString = new StringBuffer(input.replaceAll("[^a-zA-Z]", "")).reverse().toString();
        String replacedString = input.replaceAll("[a-zA-Z]", "_");

        char ch[] = reversedString.toCharArray();
        for(char c:ch) {
            replacedString = replacedString.replaceFirst("_", String.valueOf(c));
        }
        System.out.println("-------> " + replacedString);
        return replacedString;
    }


	public static void main(String[] args) {
           String input = "Za$pn&il";
            String[] arr = input.split("");
            String regex = "[^0-9a-zA-Z]";

            StringBuilder reversed=new StringBuilder(input.replaceAll(regex, "")).reverse();

            IntStream.range(0, input.length()-1)
            .filter(i->arr[i].matches(regex))
            .forEach(i->reversed.insert(i, arr[i]));

            System.out.println(reversed);
    }


Q11) Given a list of integers, divide into two lists one having even numbers and other having odd numbers.


Solutions:

List<List<Integer>> lists = intList.stream()
.collect(Collectors.groupingBy(key->key%2==0,Collectors.toList()))
.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
System.out.println(lists);

2. intList.stream()
   .collect(Collectors.partitioningBy(integerValue->integerValue%2==0))
   .entrySet().stream().map(mapValue->mapValue.getValue()).collect(Collectors.toList());

3. Map<Boolean, List<Integer>> partitions = ints.stream()
   .collect(Collectors.partitioningBy(x -> x % 2 == 0));
   List<Integer> evens = partitions.get(true);
   List<Integer> odds = partitions.get(false);
   The entryset logic in solution 1 and 2 is to process the map. and also please know the difference between partitionBy and groupBy and when to use.



Q12) Given an array of integers (2, 34, 54, 23, 33, 20, 59, 11, 19, 37 ) group the numbers by the range they belong to. The put put should be {0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}

Solution is:
Map<Integer, List<Integer>> map = 
 Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19,37).collect(Collectors.groupingBy (i -> i/10 * 10 )); 
                System.out.println(map);


Q13) Given a List of Strings  ["as", "123", "32", "2as"], create another Integer list that contains only integers. The output shoul be: List<Integer> iList = [123,32]
Solution:
listOfStrings.stream().filter( ss -> ss.matches("[0-9]*")).map(Integer::valueOf).collect(Collectors.toList());


Q14) Given an array of integers arr = {5,6,7,8,5,5,8,8,7) find the sum of the unique elements. The output should be in this case is: 26.

Solution : Arrays.stream(arr).distinct().sum();


Q15 ) Given a numeric array , re arrange the elements to form a smallest possible value.

input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

output is: 133444576998

Solution is: Arrays.stream(arr).mapToObj(i-> i+"").sorted().forEach(System.out::print);


Q16) Given a numeric array , re arrange the elements to form a highest possible value.

input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

output is: 998764543431


Solution is: Arrays.stream(arr).mapToObj(i-> i+"").sorted((o1,o2) -> (o2+o1).compareTo(o1+o2)).forEach(System.out::print)


	2) Arrays.stream(arr12).mapToObj(i-> i+"").sorted(Collections.reverseOrder()).forEach(System.out::print); ( solution is wrong. Associates need to fix it).


Q17)  Given a String = The quick brown fox jumps over the lazy dog, find the first non repeated character. (Google interview)


	Solution with java 8 :

	String res = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
	System.out.println(res);



______________________________________________________________________________________________________________________________________________________________________________
1) Find the longest word in a sentence?

   Input: I am interested to grow in my organization
   output is: organization

2) Find the lenght of the longest word.

   Input: I am interested to grow in my organization
   output is: 	12

3) Find the 2nd highest length in the sentence.

4) FInd the length of the 2nd longest word.


5) List of cities

   "Mumbai"
   "Munnar"
   "chennai"
   "Hyderabad"

   Calcullate the lenght of each city where the city name starts with 'm' or 'M' and create a list.


Can you  write a program to create another list that contains the cities start with "m"?


6)  I have to arrays
    int arr1[] = {21,6,8,9,10,5};
    int arr2[] = {10,21,5,8,6,9};

    write a program to check whether both arrays are equal or not.

7)  Given a string, find the words with the maximum number of vowels.

    	"The quick brown fox jumps right over the little lazy dog."
    	Maximum Number of Vowels: 2

    	output Words: quick, over, little  ( because each word has maximum of 2 vowels)

8)  I have an array.  Find the next greatest element for each element in a given array.

{15, 10, 16, 20, 8, 9, 7, 50}

OutPut:

15 -16
10 -16
16-20
20-50
8-9
9-50
7-50
50 - Max Integer

Solution :
int[] intArray = {15, 10, 16, 20, 8, 9, 7, 50};

           for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] > intArray[i]) {
                    System.out.println(intArray[i] + " - " + intArray[j]);
                    break;
                }
            }
        }
        System.out.println(intArray[intArray.length - 1] + " - Max Integer");

9) I have two sorted arrays. Need to merge those.


10) A List<String> contains alpha, numeric and alpha numeric values as strings. Write a program to create a List<Integer>s from the original List.

    	input :  List <String> ls =  ["as", "123", "32", "2as"]
    	output : List<Integer> iList = [123,32]


11) How to remove duplicates from an arrayList?


12)	I have a passenger Object. that has an e-mail.  So given the list of passenger Objects
       I need to find the list of domains and the no of times each domain occured.



13)

Student class 
sting name
string subject
int marks
List of student
student - A - hindi - 50
student - A - maths - 90
student - A - science - 70

student - B - hindi - 80
student - B - maths - 90
student - B - science - 70
output - 
student a hindi 50 (least for student A)
student a maths 90 (hightest for student A)

student b scice 70 (least for student b)
student b maths 90 (hightest for student b)



14)

Left Rotate array :

input : 1 2 3 4 5 6
number: 3 -
output: 4 5 6 1 2 3



				Work on recursion problems.

15. Fibonacci series.

    Input: N = 10
    Output: 0 1 1 2 3 5 8 13 21 34

    Input: N = 15
    Output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377



16. Permutations from a string.

    Input is: ABC
    Output is:
    ABC ACB
    BAC BCA
    CBA CAB

17. Reversal program with special characters.

    	Input : Zw$pn&il
    	Output : lin$p&wZ



	98413211 47



1)

Given 2 numbers as list, add the numbers and store the result in a new list.
2->3->5->7->NULL
8->2->7->NULL
Output : 3->1->8->4->NULL

   Input Array is: {15, 10, 16, 20, 8, 9, 7, 50 }

15 -16
   10 -16
   16-20
   20-50
   8-9
   9-50
   7-50
   50 -1

Find the next greatest element for each element in the Array.



3)


Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.

Input : A[] = {l, 3, 15, 11, 2}
        B[] = {23, 127, 235, 19, 8}

Output : 3
the pair is: 11, 8








insertion sort.
quick sort
selection sort
merge sort
bubble sort.



100)
	For a given string, like "aabbccdeff", count each char and declare winner or loser by following rules
· Winner char will have max number of char count and no other char will have same count
· Loser will have min number of char count and no other char will have same count.
Input: aabbccdeff
Output: winner: none, loser: e


101)
	The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.

	https://www.geeksforgeeks.org/java-program-for-stock-buy-sell-to-maximize-profit/


