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
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
*/

/**
 * @author Karthikeyan
 * @Date   Dec 18, 2016
 */
public class PyramidPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking noOfRows value from the user
		System.out.println("How Many Rows You Want In Your Pyramid?");
		int noOfRows = sc.nextInt();
		System.out.println("Here Is Your Pyramid....!!!");
		printPattern(noOfRows);
		// printPattern2(noOfRows);
		sc.close();
	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void printPattern2(int rows) {
		int rowCount = 1;
		for (int i = rows; i > 0; i--) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			// Printing 'j' value at the end of each row
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
