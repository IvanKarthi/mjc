package cc.hr.strings;

import java.io.IOException;
import java.util.Scanner;

/*
 * Complete the makingAnagrams function, that should return an integer 
 * representing the minimum number of deletions needed to make the strings anagrams.
 * Sample Input: s1 = cde,	s2 = abc
 * Sample Output: 4
   Explanation: We delete the following characters from our two strings to turn them into anagrams of each other:
	1. Remove d and e from cde to get c.
	2. Remove a and b from abc to get c.
	We had to delete 4 characters to make both strings anagrams.
 */

public class MakingAnagrams {

	// Complete the makingAnagrams function below.
	static int makingAnagramsEqual(String s1, String s2) {
		char[] temp1 = s1.toCharArray();
		char[] temp2 = s2.toCharArray();
		int retCount = 0;
		for (int i = 0; i < temp1.length; i++) {
			boolean found = false;
			for (int j = 0; j < temp2.length; j++) {
				if (temp1[i] == temp2[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				retCount++;
			}
		}
		return retCount * retCount;
	}

	static int makingAnagramsNonEqual(String s1, String s2) {
		char[] characters = s1.toCharArray();
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);

		for (char ch : characters) {
			int index1 = sb2.indexOf("" + ch);
			int index2 = sb1.indexOf("" + ch);
			if (index1 != -1) {
				sb2.deleteCharAt(index1);
				sb1.deleteCharAt(index2);
			}
		}
		return sb1.length() + sb2.length();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		scanner.close();
		int result = 0;
		if (s1.length() != s2.length()) {
			result = makingAnagramsNonEqual(s1, s2);
		} else {
			result = makingAnagramsEqual(s1, s2);
		}
		System.out.println(result);
	}
}
