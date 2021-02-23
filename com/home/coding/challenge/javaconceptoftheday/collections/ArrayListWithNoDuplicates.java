/**
 * @author Karthikeyan.V
 * Concepts Used: ArrayList, HashSet and LinkedHashSet
 * Purpose: To Remove Duplicate Elements From ArrayList
 */
package com.home.coding.challenge.javaconceptoftheday.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ArrayListWithNoDuplicates {

	static Logger logger = Logger.getLogger(ArrayListWithNoDuplicates.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Sample debug message");

		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");
		
		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(listWithDuplicateElements);
		
		removingDuplicateElementsUsingHashSet(listWithDuplicateElements);
		removingDuplicateElementsUsingLinkedHashSet(listWithDuplicateElements);
		
		shuffleArrayUsingShuffle();
		shuffleArrayUsingRandom();
	}

	/**
	 * Removing duplicate elements using HashSet (insertion order is not maintained)
	 * @param listWithDuplicateElements
	 */
	private static void removingDuplicateElementsUsingHashSet(ArrayList<String> listWithDuplicateElements) {
		// Constructing HashSet using listWithDuplicateElements
		HashSet<String> set = new HashSet<String>(listWithDuplicateElements);

		// Constructing listWithoutDuplicateElements using HashSet
		ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);

		// Printing listWithoutDuplicateElements
		System.out.print("\n\n1. Removed Duplicate Elements by not retaining insertion order using HashSet :");
		System.out.println(listWithoutDuplicateElements);
	}

	/**
	 * Removing duplicate elements using LinkedHashSet (insertion order is maintained)
	 * @param listWithDuplicateElements
	 */
	private static void removingDuplicateElementsUsingLinkedHashSet(ArrayList<String> listWithDuplicateElements) {
		// Constructing LinkedHashSet using listWithDuplicateElements
		LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);

		// Constructing listWithoutDuplicateElements using LinkedHashSet
		ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);

		// Printing listWithoutDuplicateElements
		System.out.print("2. Removed Duplicate Elements by retaining insertion order using LinkedHashSet:");
		System.out.println(listWithoutDuplicateElements);
	}
	
	/**
	 * Shuffle Array Elements using Collections Class
	 */
	private static void shuffleArrayUsingShuffle() {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> intList = Arrays.asList(intArray);
		Collections.shuffle(intList);
		intList.toArray(intArray);
		System.out.println("\n\n1. Shuffle Array Elements using Collections Class: " + Arrays.toString(intArray));
	}
	
	
	/**
	 * Shuffle Array Elements using Random Class
	 */
	private static void shuffleArrayUsingRandom() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		System.out.println("2. Shuffle Array Elements using Random Class: " +Arrays.toString(array));
	}
	
}
