package com.home.coding.challenge.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
*/

/**
 * @author Karthikeyan
 * @Date   Dec 22, 2016
 */
public class NumberPattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		//printPatternIncrement(rows);
		printPatternIncrement2(rows);
		//printPatternIncrement3(rows);
		sc.close();
	}

	private static void printPatternIncrement(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void printPatternIncrement2(int rows) {
		for (int i = 1; i <= rows; i++) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// Printing i spaces at the beginning of each row
			for (int j = i; j <= rows; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void printPatternIncrement3(int rows) {
		for (int i = 1; i <= rows; i++) {
			// Printing i spaces at the beginning of each row
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			// Printing i spaces at the beginning of each row
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
