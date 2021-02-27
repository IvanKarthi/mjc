/**
 * @author Karthikeyan.V
 * Concepts Used: ArrayList, HashSet and LinkedHashSet
 * Purpose: To Remove Duplicate Elements From ArrayList
 */
package com.home.explore.jdk2;

import java.util.Arrays;

import org.apache.log4j.PropertyConfigurator;

public class ExploreArraysMethods {

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		byte[] b = { 51, 22, 8, 37 };
		char[] c = { 'A', 'R', 'R', 'A', 'Y', 'S' };
		short[] s = { 24, 5, 21, 12, 19 };
		int[] i = { 24, 13, 45, 37, 84, 13, 28 };
		long[] l = { 879, 412, 258, 985, 856 };
		double[] d = { 12.5, 87.4, 41.24, 14.9, 55.8 };
		String[] str = { "java", "concepts", "Arrays", "methods" };
		boolean[] bln = { true, false, false, true };
		
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };
		
		doCompare(arr1, arr2);
		sort(b, c, s, i, l, d, str, bln);
		binarySearch(b, c, s, i, l, d, str, bln);
	}

	private static void doCompare(int[] arr1, int[] arr2) {
		System.out.println("(I). Comparing []s object");

		// arr1.equals(arr2) is same as (arr1 == arr2)
		if (arr1 == arr2 || arr1.equals(arr2))
			System.out.println("[]s are same by commparing '==' OR 'equals()'");
		else
			System.out.println("[]s are not same by commparing '=='  OR 'equals()'");

		if (Arrays.equals(arr1, arr2))
			System.out.println("[]s are same by commparing 'Arrays.equals()'");
		else
			System.out.println("[]s are not same by commparing 'Arrays.equals()'");

		// int arr[2]; // It is not allowed to put the size of the array
		// boolean arr[] = new boolean[2]; //runtime exception IllegalFormatConversionException
		short arr[] = new short[2];
		System.out.format("\nArrays default element will be printed: %d and %d \n", arr[0], arr[1]);
	}
	
	private static void sort(byte[] b, char[] c, short[] s, int[] i, long[] l, double[] d, String[] str,
			boolean[] bln) {
		System.out.println("\n(II). Sorted Result");
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

		Arrays.sort(s);
		System.out.println(Arrays.toString(s));

		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

		Arrays.sort(l);
		System.out.println(Arrays.toString(l));

		Arrays.sort(d);
		System.out.println(Arrays.toString(d));

		Arrays.sort(str);
		System.out.println(Arrays.toString(str));

		// Arrays.sort(bln); 
		//Compile time error, because, there is no sort method in Arrays class which sorts boolean type array
	}

	private static void binarySearch(byte[] b, char[] c, short[] s, int[] i, long[] l, double[] d, String[] str,
			boolean[] bln) {
		System.out.println("\n(III). Binary Search Result");
		System.out.println(Arrays.binarySearch(i, 13)); // Output : 1 -last occurrence
		System.out.println(Arrays.binarySearch(i, -5)); // Output : -1 -not exist
		System.out.println(Arrays.binarySearch(i, 55)); // Output : -7 -not exist

		System.out.println("\n" + Arrays.binarySearch(c, 'Y')); // Output : 5
		System.out.println(Arrays.binarySearch(c, 'y')); // Output : -7 -case sensitive, so not exist
		System.out.println(Arrays.binarySearch(c, 'Z')); // Output : -7 -not exist

		System.out.println("\n" + Arrays.binarySearch(str, "Arrays")); // Output: 0
		System.out.println(Arrays.binarySearch(str, "concepts")); // Output : 1
		System.out.println(Arrays.binarySearch(str, "sixth")); // Output : -5 -not exist
	}

}
