package com.accessmodifiers01;

//private is Illegal modifier for the class TestAccessDemo1; 
//only public, <default>, abstract, strictfp & final are permitted

// When we use strictfp we will get Warning : 
//Floating-point expressions are always strictly evaluated from source level 17. Keyword 'strictfp' is not required.
public class TestAccessDemo1 {

	static {
		System.out.println("static block called from TestAccessDemo1 ");
	}

	{
		System.out.println("instance block called from TestAccessDemo1 ");
	}

//	protected data members 
	protected int a4 = 9;
	protected String name4 = "Srikanth";

	protected void method4() {
		System.out.println("method4 called ");
	}

//	public data members 
	public int a3 = 7;
	public String name3 = "Dhoni";

	public void method3() {
		System.out.println("method3 called ");
	}

	// default data members
	int a2 = 45;
	String name2 = "Rohit";

	void method2() {
		System.out.println("method2 called ");
	}

	// private Data Members
	private int a1 = 18;
	private String name1 = "Virat";

	private void method1() {
		System.out.println("method1 called ");
	}

	// no arg constructor
	public TestAccessDemo1() {
		System.out.println("no-arg constructor called");
	}

	public static void main(String[] args) {

		TestAccessDemo1 t1 = new TestAccessDemo1();

		// Accessing the Private data members within the class
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

		// Accessing the default data members within the class
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing the public data members within the class
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing the protected data members within the class
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

	}

}
