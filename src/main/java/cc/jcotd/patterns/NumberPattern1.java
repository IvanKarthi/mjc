package cc.jcotd.patterns;

import java.util.Scanner;
/*
 * https://javaconceptoftheday.com/number-pattern-programs-in-java/
 * https://javaconceptoftheday.com/number-pattern-programs-in-java/2/
*/

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/

/**
 * @author Karthikeyan
 * @Date   Dec 15, 2016
 */
public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		printPattern(in);
		sc.close();
	}

	private static void printPattern(int in) {
		for (int i = 1; i <= in; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
