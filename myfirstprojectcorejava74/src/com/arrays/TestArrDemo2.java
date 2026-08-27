package com.arrays;

public class TestArrDemo2 {

	public static void main(String[] args) {

		double[] salaries = new double[5];// 0 1 2 3 4

		salaries[0] = 400000.00;
		salaries[1] = 600000.00;
		salaries[2] = 900000.00;
		salaries[3] = 700000.00;
		salaries[4] = 800000.00;

		for (int i = 0; i < salaries.length; i++) {
			if (salaries[i] > 600000) {
				System.out.println(salaries[i]);
			}
		}

//		for(double sal:salaries) {
//			System.out.println(sal);
//		}

	}

}
