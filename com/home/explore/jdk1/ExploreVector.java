package com.home.explore.jdk1;

import java.util.*;

public class ExploreVector {

	public static void main(String args[]) {
		/* Vector of initial capacity(size) of 2 */
		Vector vec = new Vector(2);

		/* check size and capacityIncrement */
		System.out.println("\nExample 1");
		System.out.println("Initial size of vec: " + vec.size());
		System.out.println("Default capacity of vec: " + vec.capacity());

		/* Adding elements to a vector */
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		System.out.println("Vector size after adding 4 items: " + vec.size());
		System.out.println("Vector capacity after increment: " + vec.capacity());

		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		/* size and capacityIncrement after two insertions */
		System.out.println("Vector size after adding 3 items: " + vec.size());
		System.out.println("Vector capacity after increment: " + vec.capacity());

		/* Display Vector elements */
		Enumeration en = vec.elements();
		System.out.println("\nExample 1 Elements are:");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");

		Vector vec2 = new Vector(3, 2);
		System.out.println("\n\n\n\nExample 2");
		System.out.println("Initial size of Vector: " + vec2.size());
		System.out.println("Initial capacity of Vector: " + vec2.capacity());

		vec2.addElement("Rahul");
		vec2.addElement("Kannan");
		vec2.addElement("Suresh");
		vec2.addElement("Ankit");
		vec2.addElement("Muthu");
		vec2.addElement("Yuvaraj");
		System.out.println("Vector size after adding adding 6 items: " + vec2.size());
		System.out.println("Vector capacity after increment: " + vec2.capacity());

		/* Display Vector elements */
		Iterator it = vec2.iterator();
		System.out.println("\nExample 2 Elements are:");
		while (it.hasNext())
			System.out.print(it.next() + ", ");

		Vector vec3 = new Vector(new ArrayList(Arrays.asList("India", "US")));
		System.out.println("\n\n\n\nExample 3");
		System.out.println("Initial size of Vector: " + vec3.size());
		System.out.println("Initial capacity of Vector: " + vec3.capacity());
		
		vec3.addElement("German");
		vec3.addElement("France");
		vec3.addElement("Mexico");
		vec3.addElement("China");
		vec3.addElement("Russia");
		
		System.out.println("Vector size after adding adding 5 items: " + vec3.size());
		System.out.println("Vector capacity after increment: " + vec3.capacity());
	}
}