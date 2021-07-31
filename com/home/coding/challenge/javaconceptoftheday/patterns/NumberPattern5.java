package com.home.coding.challenge.javaconceptoftheday.patterns;

import java.util.Scanner;

/*
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
*/

/**
 * @author Karthikeyan
 * @Date   Dec 16, 2016
 */
public class NumberPattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPattern(rows);
		printPattern2(rows);
		sc.close();
	}

	private static void printPattern(int rows) {
		for (int i = rows; i > 0; i--) {
			for (int j = rows; j > rows - i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	//2nd approach
	private static void printPattern2(int rows) {
		for (int i = 1; i <= rows; i++) { 
            for (int j = rows; j >= i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
	}
}
