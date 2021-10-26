package cc.hr.implementation;

/*
 	Input number: 3
	2
	4
	6
	Output: 3715
*/
import java.io.IOException;
import java.util.Scanner;

public class UtopianTree {

	// Complete the utopianTree function below.
	static int utopianTree(int n) {
		int height = 1;
		if (n == 0)
			return height;
		else {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0)
					height += 1;
				else
					height += height;
			}
		}
		return height;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		StringBuffer res = new StringBuffer();
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int result = utopianTree(n);

			res.append(result);
		}
		System.out.println(String.valueOf(res.toString()));
		scanner.close();
	}
}