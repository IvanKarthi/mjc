package com.home.mjc.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

/**
 * @author Karthikeyan
 * @Date   Dec 16, 2016
 */
public class NumberPattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPattern(rows);
		sc.close();
	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int z = rows - 1; z > 0; z--) {
			for (int j = 1; j <= z; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
