package com.languagefundamentals;

//Floating Literals 
public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		float f1 = 10;
//		float f2 = 10.5;//Type mismatch: cannot convert from double to float
		float f3 = 10.5F;
		float f4 = 123;
		float f5 = 0123;
//		float f6 = 0123.5;//Type mismatch: cannot convert from double to float
		float f7 = 0123.5F;
		float f8 = 0x123;
		float f9 = 0x123F;
//		float f10 = 0x123.5F;//Invalid hex literal number
		float f11 = 123F;
		float f12 = 0123F;

		System.out.println(f1);
//		System.out.println(f2);
		System.out.println(f3);//10.5
		System.out.println(f4);//123.0
		System.out.println(f5);//83.0
		System.out.println(f7);//123.5
		System.out.println(f8);
		System.out.println(f9);
		System.out.println(f11);//123.0
		System.out.println(f12);

	}

}
