/*Problem Statement
Given an array of numbers. Write a program to find the first element 
in the array which is repeated.
*/


import java.util.*;

class Main

{

	static void printFirstRepeating(int arr[])

	{

		int min = -1;

		HashSet<Integer> set = new HashSet<>();

		for (int i = arr.length - 1; i >= 0; i--)

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

	public static void main(String[] args) throws java.lang.Exception

	{

		int i, n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int[] arr = new int[n];

		for (i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

		}

		printFirstRepeating(arr);

	}

}