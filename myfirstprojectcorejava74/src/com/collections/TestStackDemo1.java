package com.collections;

import java.util.Stack;

//STACK is working based in Last In First Out  : LIFO 
public class TestStackDemo1 {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();

		if (s.empty()) {
			s.push("J2SE");
			s.push("J2EE");
			s.push("J2ME");
			s.push("Frameworks");
			s.push("Spring");
			s.push("Spring Boot");
			s.push("React");
			s.push("Angular");
			s.push("MySql");
		}

		// Removes the object at the top of this stack and returns that object as the
		// value of this function.
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());// React

		// Returns the 1-based position where an object is on this stack.
//		If the object o occurs as an item in this stack,
//		this method returns the distance from the top of the stack of the occurrence nearest the top of the stack; 
//		the topmost item on the stack is considered to be at distance 1. 
//		The equals method is used to compare o to the items in this stack.
		System.out.println(s.search("Spring Boot"));
		System.out.println(s.search("Java"));

//		System.out.println(s.empty());

		System.out.println(s);

	}

}
