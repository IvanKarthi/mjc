package com.home.explore.jdk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExploreCollections {

	public static void main(String[] args) {
		binarySearchUsingCollections();
		sortUsingCollections();
		copyOneCollectionToAnother();
		unmodifiable();
		disjointCollections();
		findMinAndMax();
	}

	/*
	 * java.util.Collections.binarySearch() method returns the position of an
	 * object in a sorted list. To use this method, the list should be sorted in
	 * ascending order, otherwise, the result returned from the method will be
	 * wrong. If the element exists in the list, the method will return the
	 * position of the element in the sorted list, otherwise, the result
	 * returned by the method would be the – (insertion point where the element
	 * should have been present if exist)-1).
	 */
	private static void binarySearchUsingCollections() {
		System.out.println("(I). Binary Search Using Collections");
		List<String> items = new ArrayList<>();
		items.add("Puma");
		items.add("Bata");
		items.add("Nike");
		items.add("Reebok");
		items.add("Addidas");

		Collections.sort(items);
		System.out.format("Index of Addidas is: %d, and Nike is: %d", Collections.binarySearch(items, "Addidas"),
				Collections.binarySearch(items, "Nike"));
	}

	private static void sortUsingCollections() {
		System.out.println("\n\n(II). Sort Using Collections");
		Integer[] strArr = { 55, 44, 33 };
		List<Integer> list = new ArrayList<Integer>();
		list.add(66);
		list.add(77);
		list.add(22);
		list.add(11);

		Collections.addAll(list, 99, 88, 77);
		Collections.addAll(list, strArr);

		Collections.sort(list);
		System.out.println("Sorted List");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("\nReversed List");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	/*
	 * Collections.copy() is used to copy all the elements from one list into
	 * another. After the operation, the index of each copied element in the
	 * destination list will be identical to its index in the source list. The
	 * destination list must be at least as long as the source list. If it is
	 * longer, the remaining elements in the destination list are unaffected.
	 */
	private static void copyOneCollectionToAnother() {
		System.out.println("\n\n(III). Copy One Collection To Another");
		List<String> destination = new ArrayList<>();
		destination.add("One");
		destination.add("Two");
		destination.add("Three");

		System.out.println("Original Destination list: ");
		for (int i = 0; i < destination.size(); i++) {
			System.out.print(destination.get(i) + " ");
		}
		System.out.println();

		List<String> source = new ArrayList<>();
		source.add("JDK1");
		source.add("JDK2");

		// copy the elements from source to destination
		Collections.copy(destination, source);

		System.out.println("\nDestination List After copy: ");
		for (int i = 0; i < destination.size(); i++) {
			System.out.print(destination.get(i) + " ");
		}
	}

	private static void unmodifiable() {
		System.out.println("\n\n(IV). Copy One Collection To Another");
		Map<String, String> mutableMap = new HashMap<>();
		mutableMap.put("LA", "USA");
		mutableMap.put("LV", "USA");
		mutableMap.put("MI", "USA");
		System.out.println("Mutable Map" + mutableMap);

		Map<String, String> emptyMap = Collections.EMPTY_MAP;
		System.out.println("Empty Map size: " + emptyMap.size());

		// Unmodifiable Map
		Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);
		// Uncomment below line cause an UnsupportedOperationException
		// unmodifiableMap.put("North America", "Canada");
		// System.out.println(unmodifiableMap);

		if (unmodifiableMap.containsKey("LA"))
			System.out.println("\nImmutable Map" + unmodifiableMap);

		// underlying mutable map can still be changed and the modifications are
		// reflected in the Unmodifiable map as well
		mutableMap.remove("MI");
		System.out.println("\nMutable Map after removing 'MI'" + mutableMap);

		if (unmodifiableMap.containsKey("LA"))
			System.out.println("\nImmutable Map" + unmodifiableMap);

	}

	/*
	 * Collections.disjoint() is used to check whether two specified collections
	 * are disjoint or not. More formally, two collections are disjoint if they
	 * have no elements in common. It returns true if the two collections do not
	 * have any element in common.
	 */
	private static void disjointCollections() {
		System.out.println("\n\n(V). Disjoint Collections");
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");

		List<String> list2 = new ArrayList<>();
		list2.add("Four");
		list2.add("Five");

		// check if disjoint or not
		System.out.println("Is disjoint: " + Collections.disjoint(list1, list2));
	}

	private static void findMinAndMax() {
		System.out.println("\n(VI). Min and Max on Collections");
		Integer[] strArr = { 55, 44, 33 };
		List<Integer> list = new ArrayList<Integer>();
		list.add(66);
		list.add(77);
		list.add(22);
		list.add(11);
		Collections.addAll(list, 99, 88, 77);
		Collections.addAll(list, strArr);
		System.out.println("Minimum element from the collection: " + Collections.min(list));
		System.out.println("Maximum element from the collection: " + Collections.max(list));
	}

	private void immutableMap() {
		/*
		 * Guava provides immutable versions of each java.util.Map using
		 * ImmutableMap. It throws an UnsupportedOperationException whenever we
		 * try to modify it. Since it contains its own private data, this data
		 * won't change when the original map is changed.
		 */
	}
}
