package cc.jcotd.patterns;

import java.util.Scanner;

/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
*/

/**
 * @author Karthikeyan
 * @Date   Dec 23, 2016
 */
public class NumberPattern14 {

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
			if (i % 2 == 0) {
				for (int j = 0; j < rows; j++) {
					System.out.print(j % 2 == 0 ? 0 : 1);
				}
			} else {
				for (int j = 1; j <= rows; j++) {
					System.out.print(j % 2 == 0 ? 0 : 1);
				}
			}

			System.out.println();
		}
		System.out.println();
	}

	private static void printPatternWithSpace(int rows) {
		for (int i = 1; i <= rows; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < rows; j++) {
					System.out.print(j % 2 == 0 ? 0 + " " : 1 + " ");
				}
			} else {
				for (int j = 1; j <= rows; j++) {
					System.out.print(j % 2 == 0 ? 0 + " " : 1 + " ");
				}
			}

			System.out.println();
		}
		System.out.println();
	}
}
