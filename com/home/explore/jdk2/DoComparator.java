/**
 * @author Karthikeyan.V
 * Concepts Used: Comparator, ArrayList and Collections.sort()
 * Purpose: To sort an Employee object on different parameters using Comparable
 */

package com.home.explore.jdk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DoComparator {
	public static void main(String[] args) {
		ArrayList<Countries> listOfCountries = new ArrayList<Countries>();
		listOfCountries.add(new Countries("USA", "Washington"));
		listOfCountries.add(new Countries("UK", "London"));
		listOfCountries.add(new Countries("Austria", "Vienna"));
		listOfCountries.add(new Countries("India", "New Delhi"));
		listOfCountries.add(new Countries("Zimbabwe", "Harare"));

		System.out.println("(I). Unsorted");
		for (int i = 0; i < listOfCountries.size(); i++)	//regular for loop
			System.out.println(listOfCountries.get(i));

		System.out.println("\n(II). Sorted by Country - Class implements and override Comparator interface.");
		Collections.sort(listOfCountries, new SortByCountry());
		//listOfCountries.stream().forEachOrdered(s-> System.out.println(s));	// encounter order
		for(Countries country : listOfCountries)	//Enhanced for loop
			System.out.println(country);

		System.out.println("\n(III). Sorted by Capital - Anonymous class implementation");
		Collections.sort(listOfCountries, new SortByCapital());
		//listOfCountries.stream().forEach(System.out::println);	//non-deterministic
		for(Countries country : listOfCountries)
			System.out.println(country);
		
		System.out.println("\n(IV). Sorted by Country in reverse order - @since 1.8");
		Collections.sort(listOfCountries, new Comparator<Countries>() {
			@Override
			public int compare(Countries a, Countries b) {
				return a.country.compareTo(b.country);
			}
		}.reversed());
		listOfCountries.stream().forEach(System.out::println);	//forEach loop
	}
}

class SortByCountry implements Comparator<Countries> {
	// Used for sorting in ascending order of country
	public int compare(Countries a, Countries b) {
		return a.country.compareTo(b.country);
	}
}

class SortByCapital implements Comparator<Countries> {
	// Used for sorting in ascending order of capital
	public int compare(Countries a, Countries b) {
		return a.capital.compareTo(b.capital);
	}
}

class Countries {
	String country, capital;

	public Countries(String countryName, String capitalName) {
		this.country = countryName;
		this.capital = capitalName;
	}

	// Used to print countries details in main()
	public String toString() {
		return this.country + " = " + this.capital;
	}
}