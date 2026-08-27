package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {

		// Step1 : Declaration
		int[] ages;

		// Step2 :Creation
		ages = new int[10];

		// Step3 :Initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 24;
		ages[4] = 25;
		ages[5] = 26;
		ages[6] = 27;
		ages[7] = 28;
		ages[8] = 29;
		ages[9] = 23;

//		 Step4 : Representation with for loop
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}

		// for each loop
		for (int age : ages) {
			System.out.println(age);
		}
	}
}
