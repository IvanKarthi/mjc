package com.home.coding.challenge.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
*/

/**
 * @author Karthikeyan
 * @Date   Dec 23, 2016
 */
public class NumberPattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPattern(rows);
		sc.close();
	}

	private static void printPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(i == j ? i : 0);
			}
			System.out.println();
		}
	}
}
