package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<>();

		boys.add("Mahindra");
		boys.add("Abhiram");
		boys.add("Harsha");
		boys.add("Thala");
		boys.add("Bhanu");
		boys.add("Veerendra");
		boys.add("Sai");
		boys.add("Tirupathi");
		boys.add("Anil");
		boys.add("Ramu");

//		System.out.println(boys);

		Collection<String> girls = new ArrayList<>();

		girls.add("Mounika");
		girls.add("Rohini");
		girls.add("Supriya");
		girls.add("Srividya");
		girls.add("Ramya");
		girls.add("Rajini");
		girls.add("Kavya");
		girls.add("Kavya");
		girls.add("Sasi");

//		System.out.println(girls);

		Collection<String> students = new ArrayList<>();

//		boys.clear();// Removes all of the elements from this collection (optional operation).
		students.addAll(boys);
		students.addAll(girls);

		System.out.println(boys);
		System.out.println(students);

		students.remove("Kavya");
		
//		Removes all of this collection's elements that are also contained in the specified collection 
//		(optional operation). After this call returns, this collection will contain no elements in common with the specified collection.
		students.removeAll(boys);

		System.out.println(students.contains("Veerendra"));
		System.out.println(students.containsAll(girls));
		
		System.out.println(students);

	}

}
