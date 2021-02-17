package com.home.mjc.hr.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Complete the gameOfThrones function below to determine whether a given string can be rearranged into a palindrome.
 * If it is possible, return YES, otherwise return NO.
 * Input:				Output:
 * aaabbbb, 			YES
 * cdefghmnopqrstuvw	NO
 * tattarrattat			YES
 */

public class RearrangeToPalindrome {
	private static final Scanner scanner = new Scanner(System.in);

	// Complete the gameOfThrones function below.
	static String gameOfThrones(String s) {
		char[] chars = s.toCharArray();
		HashMap<String, Integer> charset = new HashMap<String, Integer>();
		for (char c : chars) {
			int i = 0;
			if (charset.get(String.valueOf(c)) != null) {
				charset.put(String.valueOf(c), charset.get(String.valueOf(c)) + 1);
			} else {
				charset.put(String.valueOf(c), ++i);
			}
		}
		Map<String, Integer> result = charset.entrySet().stream().filter(map -> map.getValue() % 2 != 0)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		if (result.size() > 1) {
			System.out.println(result.size());
			return "NO";
		}
		return "YES";
	}

	public static void main(String[] args) {
		String s = scanner.nextLine();

		String result = gameOfThrones(s);
		System.out.println(result);
		scanner.close();
	}
}
