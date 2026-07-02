package com.languagefundamentals;

//Integral Literals 
public class TestLiteralsDemo1 {

	public static void main(String[] args) {

//		i) Decimal Literals : Base 10 --> 0 to 9 
		int a1 = 10;
		int a2 = 123;
		int a3 = 789;

//		ii) Octal Literals : Base 8 --> 0 to 7 
//		Octal Literals starts with 0 (zero)
//		0 1 2 3 --> 0 +1*8^2 +2*8^1 +3*8^0 --> 64 + 16 + 3 = 83
		int a4 = 0123;

		int a5 = 0654;// 456 --> 428
		int a6 = 0675;// 445
//		int a7 = 0865;// The literal 0865 of type int is out of range

//		iii) Hexa-Decimal Literals : Base 16 --> 0 to 9 & a-f/A-F 
//		Hexa-Decimal Literals starts with 0X or 0x 
//	    A/a = 10, B/b =11, C/c = 12, D/d = 13, E/e =14, F/f =15 

		int a7 = 0x123;
//		0 + 1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291

		int a8 = 0x1A2B;// 6699
		int a9 = 0X345;// 837
		int a10 = 0xabc;// 2748
		int a11 = 0xbeE;
//		int a12 = 0xbeer;//Syntax error on token "r", delete this token

		TestLiteralsDemo1 t = new TestLiteralsDemo1();
		System.out.println(t);// 27716f4
		System.out.println(t.hashCode());// 41359092
		int i = 0x27716f4;
		System.out.println(i);// 41359092

//		Binary Literals : Base 2 --> 0 to 1 values 
//		Binary values starts with 0b or OB 
		int a12 = 0b1010; // --> 1*2^3 +0*2^2 +1*2^1 +0*2^0 = 8 + 2 = 10
		int a13 = 0B101101;

		System.out.println(a1);// 10
		System.out.println(a2);// 123
		System.out.println(a3);// 789
		System.out.println(a4);// 83
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);// 291
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);// 2748
		System.out.println(a11);// 3054
		System.out.println(a12);
		System.out.println(a13);
	}
}
