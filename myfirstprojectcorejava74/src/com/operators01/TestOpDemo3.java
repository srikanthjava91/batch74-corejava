package com.operators01;

//4) Comparison Operators 
//==  < <=    > >= !=
//byte short int long float double char boolean

//Whenever the data is Primitive types then == operator checks the values only.

//But, Whenever the data is Object Types then == Operator not checks the values, 
//it Checks only the Addresses of the Object.
//But, if you want to check content we must need to use .equals() method or .equalsIngnoreCase()

public class TestOpDemo3 {

	public static void main(String[] args) {

		String name1 = "Srikanth";// String Literals : SCP
		String name2 = "Srikanth";// String Literals: SCP
		System.out.println(name1 == name2);// true

		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));

		String name3 = new String("Srikanth");// Heap Area : 2 Objects internally creates but Srikanth is already there
												// in SCP only Object creates newly.

		System.out.println(System.identityHashCode(name3));
		System.out.println(name2 == name3);// false

		System.out.println(name2.equals(name3));

		String s4 = "srikanth";
		System.out.println(name2.equals(s4));
		System.out.println(name2.equalsIgnoreCase(s4));// true

		String s5 = new String("Jithendra");
		System.out.println(s5.toString());// empty line

		StringBuffer sb = new StringBuffer("Chinmay");
		StringBuffer sb1 = new StringBuffer("Chinmay");
		System.out.println(sb.equals(sb1));

		System.out.println("*********************************");
		int a = 10;
		int b = 10;
		System.out.println(a == b);

		float f1 = 5.765F;
		float f2 = 5.765f;
		System.out.println(f1 == f2);

	}

}
