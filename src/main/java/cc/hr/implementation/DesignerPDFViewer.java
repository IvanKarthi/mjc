package cc.hr.implementation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DesignerPDFViewer {

	// Complete the designerPdfViewer function below.
	static int designerPdfViewer(int[] h, String word) {
		char[] inputWord = word.toCharArray();
		HashMap<Character, Integer> pair = new HashMap<Character, Integer>();
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		char[] c = new char[alphabets.length()];
		c = alphabets.toCharArray();
		for (int i = 0; i < c.length; i++) {
			pair.put(c[i], h[i]);
		}
	
		int k = 1;
		for (char j : inputWord) {
			k = k < pair.get(j) ? pair.get(j) : k;
		}
		return k * word.length();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int[] h = new int[26];

		String[] hItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 26; i++) {
			int hItem = Integer.parseInt(hItems[i]);
			h[i] = hItem;
		}

		String word = scanner.nextLine();

		int result = designerPdfViewer(h, word);

		/*
		 * bufferedWriter.write(String.valueOf(result));
		 * bufferedWriter.newLine(); bufferedWriter.close();
		 */

		scanner.close();
		System.out.println(result);
	}
}
