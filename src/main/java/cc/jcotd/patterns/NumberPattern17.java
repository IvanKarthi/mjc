package cc.jcotd.patterns;

import java.util.Scanner;

/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/

/**
 * @author Karthikeyan
 * @Date   Dec 23, 2016
 */
public class NumberPattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPattern(rows);
		printPatternWith2D(rows);
		sc.close();
	}

	private static void printPattern(int rows) {
		long start = System.currentTimeMillis();
		for (int i = 1; i <= rows; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + rows - j;
			}
			System.out.println();
		}
		System.out.println("Time taken by printPattern:" + (System.currentTimeMillis() - start));
	}

	private static void printPatternWith2D(int rows) {
		int[][] z = new int[rows][rows];
		int lastVal = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < rows; i++) {
			for (int j = i; j < rows; j++) {
				lastVal += 1;
				z[j][i] = lastVal;
			}
		}

		// first for...each loop access the individual array inside the 2d array
		for (int[] innerArray : z) {
			// second for...each loop access each element inside the row
			for (int data : innerArray) {
				System.out.print(data != 0 ? data + " " : "");
			}
			System.out.println();
		}
		System.out.println("Time taken by printPatternWith2D:" + (System.currentTimeMillis() - start));
	}
}
