package com.patterns;

public class TestPaterrnDemo7 {

	public static void main(String[] args) {
//		*          *  sp=10
//		**        **
//		***      ***
//		****    ****
//		*****  *****
//		************
//		*****  *****
//		****    ****
//		***      ***
//		**        **
//		*          *

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 1; i <= 6; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("_____");
//		butterfly(12);
	}

//	//n=12
//	static void butterfly(int n) { 
//		int spaces = n-2;
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<i;j++) {
//				System.out.print("*");
//			}
//			
//			for(int k=1;k<i;k++) {
	////				int 
////				System.out.print();
//			}
	////			System.out.println(spaces);
//		}
//		System.out.println();
//	}
//	

}
