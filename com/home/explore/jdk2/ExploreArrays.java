package com.home.explore.jdk2;

public class ExploreArrays {

	public static void main(String[] args) {
		copyingArray();
		doJaggedArray();
	}

	private static void copyingArray() {
		System.out.println("\n(I). Copy of arry elements using 4 ways");
		int[] a = { 1, 2, 3, 4, 5 }; // Declaring and initializing an array of
										// ints
		System.out.println("\nInitial 'a' array elements");
		System.out.println("\n(1). Changing the value of one array will be reflected in another array.");
		int[] b = a; // copying array using assignment
		a[2] = 10; // Changing value of 3rd element of array 'a'
		printArray(a, b);

		System.out.println("\n\n(2). Changing the value of one array will not be reflected in another array.");
		int[] c = new int[a.length]; // Declaring and instantiating another array of ints with same length
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		a[2] = 100;
		printArray(a, c);
		System.out.println("\nChanging 3rd element in array 'a' to 100 will not change other:" + c[2]);

		System.out.println("\n(3). Changing the value of one array will not be reflected in another array");
		int[] d = a.clone(); // copying array using Object.clone()
		a[2] = 200;
		printArray(a, d);
		System.out.println("\nChanging 3rd element in array 'a' to 200 will not change other:" + d[2]);

		System.out.println("\n(4). Changing the value of one array will not be reflected in another array");
		int[] e = new int[a.length];
		System.arraycopy(a, 0, e, 0, a.length); // copying array using System.arraycopy()
		a[2] = 300;
		printArray(a, e);
		System.out.println("\nChanging 3rd element in array 'a' to 300 will not change other:" + e[2]);
	}

	private static void printArray(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.print("\n");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
	}
	private static void doJaggedArray() {
		// Jagged array is array of arrays such that member arrays can be of
		// different sizes, i.e., we can create a 2-D arrays but with variable
		// number of columns in each row.
		System.out.println("\n(II). Print jagged [] elements");

		int jaggedArray[][] = new int[4][];
		jaggedArray[0] = new int[1];
		jaggedArray[1] = new int[2];
		jaggedArray[2] = new int[3];
		jaggedArray[3] = new int[4];

		int i, j, k = 0;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < i + 1; j++) {
				jaggedArray[i][j] = k;
				k++;
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print(" " + jaggedArray[i][j]);
			}
			System.out.println();
		}
	}

}
