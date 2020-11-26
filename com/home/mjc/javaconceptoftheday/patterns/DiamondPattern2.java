package com.home.mjc.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
   1
  2 2
 3 3 3
4 4 4 4
 3 3 3
  2 2
   1
*/

/**
 * @author Karthikeyan
 * @Date   Dec 20, 2016
 */
public class DiamondPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPattern(rows);
		// printPatternWithSpace(rows);
		sc.close();
	}

	private static void printPattern(int rows) {
		int midVal = Math.abs(rows / 2) + 1;
		if (rows % 2 == 0) {
			rows += 1;
		}
		// System.out.println(midVal + "" + rows);
		for (int i = 1; i <= midVal; i++) {
			for (int j = i; j < midVal; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = rows - midVal; i >= 1; i--) {
			for (int j = i; j < midVal; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
