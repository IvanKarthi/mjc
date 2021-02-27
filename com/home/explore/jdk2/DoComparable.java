/**
 * @author Karthikeyan.V
 * Concepts Used: Comparable, List and Collections.sort()
 * Purpose: To sort an Employee object on different parameters using Comparable
 */

package com.home.explore.jdk2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DoComparable {
	public static void main(String[] args) {
		doSortUsingComparable();
	}

	public static void doSortUsingComparable() {
		Employee e1 = new Employee(1, "Karthi", 1000, 32, new Date(2011, 10, 1));
		Employee e2 = new Employee(3, "ABI", 1300, 22, new Date(2012, 10, 1));
		Employee e3 = new Employee(2, "Buvan", 10, 42, new Date(2010, 11, 3));
		Employee e4 = new Employee(5, "Muthu", 100, 23, new Date(2011, 10, 1));
		Employee e5 = new Employee(4, "Aarti", 1200, 26, new Date(2011, 10, 1));

		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.addAll(Arrays.asList(e3, e4, e5));
		System.out.println("(I). Unsorted List :\n " + listOfEmployees);
		assertEquals(e1, listOfEmployees.get(0));
		assertEquals(e5, listOfEmployees.get(4));
		
		 // Sorting using Comparable
		Collections.sort(listOfEmployees);
		System.out.println("\n(II). Comparable Impl - Sorted based on id in natural order: \n" + listOfEmployees);
		
		 // Sorting using Comparator
		System.out.println("\n(III). Comparator Impl - Sorted by Name:");
		listOfEmployees.stream().sorted(Employee.NameComparator).forEach(System.out::print);

		Collections.sort(listOfEmployees, Employee.AgeComparator);
		System.out.println("\n(IV). Comparator Impl - Sorted by Age:\n" + listOfEmployees);

		Collections.sort(listOfEmployees, Employee.SalaryComparator);
		System.out.println("\n(V). Comparator Impl - Sorted by Salary in ACE:\n" + listOfEmployees);

		System.out.println("\n(VI). Comparator Impl - Sorted by Salary in DES:");
		listOfEmployees.stream().sorted(Employee.ReverseSalaryComparator).forEach(System.out::print);

		Collections.sort(listOfEmployees, Employee.DOJComparator);
		System.out.println("\n(VII). Comparator Impl - Sorted by DOJ:\n" + listOfEmployees);
	}
}