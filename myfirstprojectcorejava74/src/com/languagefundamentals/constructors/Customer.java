package com.languagefundamentals.constructors;

//Parent or Super or Base 
class Person {

	int cid;
	int age;
	String name;
	String city;

	Person() {
		System.out.println("no arg constructor called from Person ");
	}

	public Person(int cid, int age, String name, String city) {

		System.out.println("parameterized cinstructor called from Person");
		this.cid = cid;
		this.age = age;
		this.name = name;
		this.city = city;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Person ");
	}

	void info() {
		System.out.println("*******************************");
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Name : " + name);
		System.out.println("Customer Age : " + age);
		System.out.println("Customer City : " + city);

	}
}

//Child or Sub or Derived 
public class Customer extends Person {

	Customer() {
		// super();
		System.out.println("no arg constructor called from Customer ");
	}

	Customer(int cid, int age, String name, String city) {
		super(cid, age, name, city);
		System.out.println("parameterized constructor called from Customer ");

	}

	public static void main(String[] args) {
		System.out.println("main method started from  Customer ");

		Customer c1 = new Customer();
		c1.info();

		Customer c2 = new Customer(101, 22, "Ram", "Hyderabad");
		c2.info();

		System.out.println("main method started from  Customer ");

	}

}
