package com.home.coding.challenge.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
1
10
101
1010
10101
101010
1010101
*/

/**
 * @author Karthikeyan
 * @Date   Dec 23, 2016
 */
public class NumberPattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPattern(rows);
		printPatternWithSpace(rows);
		sc.close();
	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2 == 0 ? 0 : 1);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printPatternWithSpace(int rows) {
		for (int i = 1; i <= rows; i++) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2 == 0 ? 0 + " " : 1 + " ");
			}
			System.out.println();
		}
	}
}
