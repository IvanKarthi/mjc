package com.home.mjc.javaconceptoftheday.strings;

import java.util.Scanner;

/**
 * @author Karthikeyan
 * @Date   Nov 3, 2014
 */
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		usingStringBuffer(input);
		usingIterative(input);
		String result = usingRecursive(input);
		System.out.println(result);
		sc.close();
	}

	private static void usingStringBuffer(String input) {
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());
	}

	private static void usingIterative(String input) {
		char[] in = input.toCharArray();
		char[] res = input.toCharArray();
		for (int i = in.length - 1, j = 0; i >= 0; i--, j++) {
			res[j] = in[i];
			// System.out.print(in[i]); //just to print & not to store
		}
		System.out.println(res);
	}

	private static String usingRecursive(String input) {
		if ((null == input) || (input.length() <= 1)) {
			return input;
		}
		//System.out.println(input.substring(1)+input.charAt(0));
		return usingRecursive(input.substring(1)) + input.charAt(0);
	}
}
