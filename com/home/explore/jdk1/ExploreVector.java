package com.home.explore.jdk1;

import java.util.*;

public class ExploreVector {

	public static void main(String args[]) {
		/* Vector of initial capacity(size) of 2 */
		Vector<String> vec = new Vector<String>(2);
		
		/* check size and capacityIncrement */
		System.out.println("\nExample 1");
		System.out.println("Initial size of vec: " + vec.size());
		System.out.println("Default capacity of vec: " + vec.capacity());

		/* Adding elements to a vector */
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		System.out.println("vec size after addition: " + vec.size());
		System.out.println("vec capacity after increment: " + vec.capacity());
		
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		/* size and capacityIncrement after two insertions */
		System.out.println("vec size after addition: " + vec.size());
		System.out.println("vec capacity after increment: " + vec.capacity());

		/* Display Vector elements */
		Enumeration en = vec.elements();
		System.out.println("\nExample 1 Elements are:");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");
		
		

		Vector<String> vec2 = new Vector<String>(3, 2);
		System.out.println("\n\n\n\nExample 2");
		System.out.println("Initial size of vec2: " + vec2.size());
		System.out.println("Initial capacity of vec2: " + vec2.capacity());
		
		vec2.addElement("Kumar");
		vec2.addElement("Kannan");
		vec2.addElement("Suresh");
		vec2.addElement("Ankit");
		vec2.addElement("Mitree");
		vec2.addElement("Vinay");
		System.out.println("After adding, size of vec2: " + vec2.size());
		System.out.println("Capacity increment is: " + vec2.capacity());
		
		/* Display Vector elements */
		Iterator<String> it = vec2.iterator();
		System.out.println("\nExample 2 Elements are:");
		while (it.hasNext())
			System.out.print(it.next() + " ");
		
	}
}