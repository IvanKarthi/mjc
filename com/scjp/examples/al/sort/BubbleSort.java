package com.scjp.examples.al.sort;

/*
 * For bubble sort there are two loops that go through the elements that makes it a complexity of N*N i.e. O(N2). 
 * In bubble sort the number of swaps is also high which makes it slow.
 * Bubble sort is an "in place" sorting algorithm so there is no auxiliary space requirement.
 * Thus the space complexity of Bubble sort is O(1).
 */

/**
 * @author Karthikeyan
 * @Date   Sep 07, 2014
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = { 47, 85, 62, 34, 7, 10, 92, 106, 2, 54 };
		int[] sortedArray1 = doBubbleSort1(intArr);
		int[] sortedArray2 = doBubbleSort2(intArr);
		int[] sortedArray3 = doBubbleSort3(intArr);
		
		System.out.println("Sorted using doBubbleSort with ++: ");
		for (int num : sortedArray1) {
			System.out.print(num + " ");
		}
		System.out.println("\nSorted using doBubbleSort with --: ");
		for (int num : sortedArray2) {
			System.out.print(num + " ");
		}
		System.out.println("\nSorted using doBubbleSort with while loop: ");
		for (int num : sortedArray3) {
			System.out.print(num + " ");
		}
	}

	private static int[] doBubbleSort1(int[] intArr) {
		// left to right
		for (int i = 0; i < intArr.length - 1; i++) {
			for (int j = 0; j < intArr.length - i - 1; j++) {
				// if greater swap elements
				if (intArr[j] > intArr[j + 1]) {
					swapElements(j, intArr);
				}
			}
		}
		return intArr;
	}

	private static int[] doBubbleSort2(int[] intArr) {
		// right to left
		for (int i = intArr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// if greater swap elements
				if (intArr[j] > intArr[j + 1]) {
					swapElements(j, intArr);
				}
			}
		}
		return intArr;
	}

	private static int[] doBubbleSort3(int[] intArr) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < intArr.length - 1; i++) {
				if (intArr[i] > intArr[i + 1]) {
					temp = intArr[i];
					intArr[i] = intArr[i + 1];
					intArr[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return intArr;
	}

	private static void swapElements(int index, int[] intArr) {
		int temp = intArr[index];
		intArr[index] = intArr[index + 1];
		intArr[index + 1] = temp;
	}
}