package com.scjp.examples.al.sort;

/*
 * If you have noticed in the program each time, the number of elements that are to be compared, increases in progression; 
 * in first iteration only one element has to be compared, in second iteration two elements have to be compared and so on. 
 * 
 * Which gives us the number of comparison as–
 * 1 + 2 + 3 + ............ + N-1 = N*(N-1)/2
 * Which makes the Insertion sort time complexity as O(N2).
 * 
 * In the best case scenario, if the array is already sorted or almost sorted the while loop condition will return false 
 * making the time complexity as O(N) if it is already sorted or almost O(N) if the data is almost sorted.
 * 
 * Insertion sort is an in place sorting algorithm so apart from the initial array there is no auxiliary space requirement, 
 * thus the space complexity of Insertion sort is O(1), total space can be considered as O(N).
 */

/**
 * @author Karthikeyan
 * @Date   Sep 07, 2014
 */
public class InsertionSort {
	public static void main(String[] args) {
		//index 	   { 0,   1,  2,  3, 4,  5,  6,   7, 8,  9}    
		int[] intArr = { 47, 85, 62, 34, 7, 10, 92, 106, 2, 54 };
		int[] sortedArray = doInsertionSort(intArr);
		
		System.out.println("Sorted array is- ");
		for (int num : sortedArray) {
			System.out.print(num + " ");
		}
	}

	private static int[] doInsertionSort(int[] intArr) {
		int temp;
		int j;
		for (int i = 1; i < intArr.length; i++) {
			temp = intArr[i];
			j = i;
			while (j > 0 && intArr[j - 1] > temp) {
				// shifting elements to right
				intArr[j] = intArr[j - 1];
				--j;
			}
			// insertion of the element
			intArr[j] = temp;
		}
		return intArr;
	}
}