package com.exceptionhandling;

//finally is dominating return so the output is 100
//The argument serves as a status code. 
//By convention, a nonzero status code indicates abnormal termination.
//The only option to stop finally block is System.exit(0)
public class TestExDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(hello());
		System.out.println("main method ended ");
	}

	static int hello() {
		try {
//			System.out.println(10 / 0);
			System.exit(19);
			return 5;
		} catch (Exception e) {
			return 10;
		} finally {
			// Initiates the Runtime##shutdown
//			return 100;
		}
	}
}
