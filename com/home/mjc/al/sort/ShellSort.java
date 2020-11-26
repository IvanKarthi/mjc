package com.home.mjc.al.sort;

/**
 * @author Karthikeyan
 * @Date   Sep 07, 2014
 */
public class ShellSort {

	public static void main(String[] args) {
		// Array of 20 elements
		int[] intArr = { 47, 85, 620, 3456, 7, 10, 4500, 106, 345, 1000, 67, 80, 5500, 34, 78, 782, 4, 0, 99, 190 };
		int[] sortedArray = doShellSort(intArr);
		
		System.out.println("Sorted array is- ");
		for (int num : sortedArray) {
			System.out.print(num + " ");
		}
	}

	private static int[] doShellSort(int[] intArr) {
		int gap = 1;
		int temp;
		// initial gap value calculation
		while (gap <= intArr.length / 3) {
			gap = (gap * 3) + 1;
		}
		while (gap > 0) {
			for (int i = gap; i < intArr.length; i++) {
				temp = intArr[i];
				int j;
				for (j = i; j > gap - 1 && intArr[j - gap] >= temp; j = j - gap) {
					intArr[j] = intArr[j - gap];
				}
				intArr[j] = temp;
			}
			// next gap value calculation
			gap = (gap - 1) / 3;
		}
		return intArr;
	}
}