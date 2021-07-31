package com.home.coding.challenge.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
*/

/**
 * @author Karthikeyan
 * @Date   Dec 16, 2016
 */
public class NumberPattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPatternIncrement(rows);
		printPatternDecrement(rows);
		printPatternDecrement2(rows);
		sc.close();
	}

	private static void printPatternIncrement(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j < rows + i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void printPatternDecrement(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows; j >= rows - i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	// 2nd approach
	private static void printPatternDecrement2(int rows) {
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
