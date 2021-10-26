package cc.jcotd.patterns;

import java.util.Scanner;

/*
   * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 
*/

/**
 * @author Karthikeyan
 * @Date   Dec 20, 2016
 */
public class DiamondPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		printPattern(rows);
		//printPattern2(rows);
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
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= rows - midVal; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < midVal; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	private static void printPattern2(int rows) {
		int midVal = (rows) / 2;
		int row = 1;
		// System.out.println(midVal + "" + rows);
		for (int i = midVal; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= row; j++) {
				System.out.print("* ");
			}
			System.out.println();
			row++;
		}
		for (int i = 0; i <= midVal; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = row; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
			row--;
		}
	}
}
