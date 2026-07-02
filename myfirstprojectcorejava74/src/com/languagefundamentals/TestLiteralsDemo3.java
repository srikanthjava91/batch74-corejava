package com.languagefundamentals;

public class TestLiteralsDemo3 {

	public static void main(String[] args) {

//		char Literals 
//		In Characters, we can store Single quote values, ASCII, Unicode values or Hex values
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0012';
		char c4 = '\uffaa';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

//		Boolean Literals --> either true or false 
		boolean flag = false;
		boolean isHomeFoodTasty = true;

//		String Literals 
//		Collection of characters storing inside a double quotes will consider as String Literals.
		String str = "Srikanth";

		String name = null;

		System.out.println(str.length());// 8
		System.out.println(name.length());// NPE : NullPointerException :

	}

}
