package com.oops01;

public class TestInhDemo1 {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized method called !!");
	}

	TestInhDemo1() {
		super();
		System.out.println("no arg constructor called !");
	}
	
	
	void welcome(){
		System.out.println("welcome to OOps !!");
		System.out.println(this.getClass());
	}

	public static void main(String[] args) {

		System.out.println("main method started ");
		TestInhDemo1 t1 = new TestInhDemo1();
		System.out.println(t1);

		TestInhDemo1 t2 = new TestInhDemo1();
		System.out.println(t2);
		
		int t1h = 0x27716f4;//Hexa-Decimal  
		int t2h = 0x8efb846;//Hexa-Decimal
		
		System.out.println(t1.hashCode());
		System.out.println(t1h);
		
		System.out.println(t2.hashCode());
		System.out.println(t2h);
		
		System.out.println("--------------------------");

		TestInhDemo1 t3 = new TestInhDemo1();
		t3 = t2;
		
		t3.welcome();
		
//		Runs the garbage collector in the Java Virtual Machine.
		System.gc();
		System.out.println(t1.equals(t2));// false
		System.out.println(t2.equals(t3));//true

	}

}
