package cc.jcotd.patterns;

import java.util.Scanner;

/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/

/**
 * @author Karthikeyan
 * @Date   Dec 23, 2016
 */
public class NumberPattern15 {

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
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(1);
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
