package cc.jcotd.strings;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Karthikeyan
 * @Date   Sep 01, 2015
 */
public class StringPrograms {

	public static void main(String[] args) {
		String input = "Super Man Bat Man Spider Man Spider Man2";

		// find the duplicate words and their number of occurrences in a string
		duplicateWords(input);

		// Count the number of words in a string
		countTheWords(input);

		// number of occurrences of a given character in a string without loop
		CountCharacterOccurence(input, "s");
	}

	private static void duplicateWords(String inputString) {
		Map<String, Integer> duplicateWords = new HashMap<String, Integer>();
		String[] words = inputString.toLowerCase().split(" ");
		for (String key : words) {
			if (duplicateWords.containsKey(key))
				duplicateWords.put(key, duplicateWords.get(key) + 1);
			else
				duplicateWords.put(key, 1);
		}
		Set<String> wordsInString = duplicateWords.keySet();
		for (String word : wordsInString) {
			if (duplicateWords.get(word) > 1)
				System.out.format("Word [%s] is occurred [%d] times \n", word, duplicateWords.get(word));
		}
	}

	private static void countTheWords(String inputString) {
		System.out.println("Enter the string");
		String[] words = inputString.trim().split(" ");
		System.out.println("Number of words using string.length = " + words.length);
		int count = 1;
		for (int i = 0; i < inputString.length() - 1; i++) {
			if ((inputString.charAt(i) == ' ') && (inputString.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words using char = " + count);
	}

	private static void CountCharacterOccurence(String input, String in) {
		int count = input.length() - input.toLowerCase().replace(in, "").length();
		System.out.format("Number of occurances of '%s' in [%s] = %d",in, input, count);
	}
}
