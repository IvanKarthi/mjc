package cc.jcotd.patterns;

import java.util.Scanner;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
*/

/**
 * @author Karthikeyan
 * @Date   Dec 21, 2016
 */
public class NumberPattern10 {

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
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
