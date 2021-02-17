package com.home.mjc.hr.arrays;

public class ReverseArrayElem {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 3, 2 };
		System.out.print("Input: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

		int[] res = reverseArray(arr);
		System.out.print("\nOutput: ");
		for (int i = 0; i < res.length; i++) {
			System.out.print(" " + res[i]);
		}
	}

	static int[] reverseArray(int[] a) {
		int temp[] = new int[a.length];
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			temp[j] = a[i];
		}
		return temp;
	}
}
