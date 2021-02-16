package com.home.mjc.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/

/**
 * @author Karthikeyan
 * @Date   Dec 18, 2016
 */
public class NumberPattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPatternIncrement(rows);
		sc.close();
	}

	private static void printPatternIncrement(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			for (int z = i; z >= 2; z--) {
				System.out.print(z - 1 + " ");
			}
			// OR
			/*for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}*/
			System.out.println();
		}
	}
}
