package com.home.mjc.hr.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TwoStrings {
	private static final Scanner scanner = new Scanner(System.in);
	static String s1 = null;
	static String s2 = null;
	static String[] s = new String[3];
	public static void main(
			String[] args) throws IOException {
		String result = "0";
		/*int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			s1 = scanner.nextLine();
		 	s2 = scanner.nextLine();
		 result = twoStrings(s1, s2);
		}*/
		
		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("E:\\My_Projects\\Try\\TwoStrings\\input\\input12.txt"));
		int i = 0;
		while (bufferedReader.ready()) {
			s[i]  = bufferedReader.readLine();
			i++;
			//System.out.println(bufferedReader.readLine());
		}
		for (int j = 0; j < i; j++) {
			s1 = s[1];
			s2 = s[2];
		}
		result = twoStrings(s1, s2);
		bufferedReader.close();
		/*String s1 = "HI";
		String s2 = "World";
		result = twoStrings(s1, s2);*/
		System.out.println(result);
	}

	static String twoStrings(String s1, String s2) {
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j])
					return "YES";
			}
		}
		return "NO";
	}
}
