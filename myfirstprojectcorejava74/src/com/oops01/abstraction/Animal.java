package com.oops01.abstraction;

//SRS : Software Requirement Specification 
//By default, 
//	- interface variables are public static & final 
//  - interface methods are public & abstract 
public abstract interface Animal {

	public static final String ORG_NAME = "Vcube-PET-Store";

	public static void main(String[] args) {
		System.out.println("Hello Animal interface main method started ");
	}

	public abstract void sound();

	public void walk();

	void eat();

//	To avoid backward compatibility problems we use default methods to provide utility behavior.
//	default methods can override in classes.
	public default void run() {
		System.out.println("Every animal can Run !!");
		hello();
	}

//	In interface, we can write any number of default methods.
	public default void sleep() {
		System.out.println("Every animal sleep for sure !! !!");
		hello();
	}

//	private method introduced to avoid duplication from default methods, 
//	private methods we cannot override.

	private void hello() {
		System.out.println("Hello ");
		System.out.println("Hello ");
		System.out.println("Hello ");
		System.out.println("Hello ");
		System.out.println("Hello ");
		System.out.println("Hello ");
	}

//	To provide constant behavior we use static methods
//	static methods we cannot override.
//	Generally, static methods we can call by using class name or reference variables names but, 
//	interface static methods we can call only by using interface name but not object reference variables.
	public static void breath() {
		System.out.println("Every animal should breath to survive !!");
	}

//	Abstract methods do not specify a body
//	void sound() {
//		
//	}

}
