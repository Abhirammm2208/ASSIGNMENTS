/*Problem Statement



Given an array of numbers. Write a program to find the first element in the array which is repeated.

Input format :
The first line of the input consists of the value of n.

The next input is the array elements.

Output format :
The output prints the first repeated element in the array.



Refer to the sample output for formatting specifications.

Sample test cases :
Input 1 :
7
10 5 3 5 3 4 6
Output 1 :
The first repeating element is 5
Input 2 :
5
1 5 6 8 7
Output 2 :
There are no repeating elements*/

import java.util.*;
class Main

{

	static void printFirstRepeating(int arr[])

	{

		int min = -1;

		HashSet<Integer> set = new HashSet<>();

		for (int i=arr.length-1; i>=0; i--)

		{

			if (set.contains(arr[i]))

				min = i;


			else 

				set.add(arr[i]);

		}

		if (min != -1)

		System.out.println("The first repeating element is " + arr[min]);

		else

		System.out.println("There are no repeating elements");

	}

	public static void main (String[] args) throws java.lang.Exception

	{

		int i,n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int [] arr = new int[n];

		for(i=0;i<n;i++) {

		    arr[i] = sc.nextInt();

		}

		printFirstRepeating(arr);
		
	}

}