package com.home.mjc.al.sort;

/*
 * For selection sort there are two loops that go through the elements that makes it a complexity of N*N i.e. 
 * time complexity of Selection sort is O(N2) where total number of comparisons are N*(N-1)/2. 
 * In selection sort the number of swaps are less in comparison to the bubble sort making it faster than the bubble sort. 
 * Selection sort is an "in place" sorting algorithm so apart from the initial array there is no auxiliary space requirement 
 * thus the space complexity of Selection sort is O(1), total space can be considered as O(N).
 */

/**
 * @author Karthikeyan
 * @Date   Sep 07, 2014
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] numArray = { 47, 85, 620, 3456, 7, 10, 4500, 106, 345, 1000 };
		int[] sortedArray = doSelectionSort(numArray);
		
		System.out.println("Sorted using SelectionSort: ");
		for (int num : sortedArray) {
			System.out.print(num + " ");
		}
	}

	private static int[] doSelectionSort(int[] numArray) {
		int lowest;
		for (int i = 0; i < numArray.length - 1; i++) {
			lowest = i;
			for (int j = i + 1; j < numArray.length; j++) {
				// if smaller then this is considered the smallest
				if (numArray[j] < numArray[lowest]) {
					lowest = j;
				}
			}
			swapElements(i, lowest, numArray);
		}
		return numArray;
	}

	private static void swapElements(int index, int lowest, int[] numArray) {
		int temp = numArray[index];
		numArray[index] = numArray[lowest];
		numArray[lowest] = temp;
		// Uncomment it to see the element movement in each iteration

		/*for (int num : numArray) {
			System.out.print(num + " ");
		}
		System.out.println("");*/
	}
}