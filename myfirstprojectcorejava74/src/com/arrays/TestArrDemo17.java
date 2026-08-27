package com.arrays;

public class TestArrDemo17 {

	public static void main(String[] args) {

		int[][][] arr = new int[3][3][3];// 0 1 2 ---> 0 1 2 ----> 0 1 2

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][0].length);
		System.out.println("***************************");
		
		arr[0][0][0] = 101;
		arr[0][0][1] = 102;
		arr[0][0][2] = 103;

		arr[1][1][0] = 104;
		arr[1][1][1] = 105;
		arr[1][1][2] = 106;

		arr[2][2][0] = 107;
		arr[2][2][1] = 108;
		arr[2][2][2] = 109;
		
		
		for(int[][] arr2:arr) {
			for(int[] arr1:arr2) {
				for(int a:arr1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				for (int k = 0; k < arr[i][j].length; k++) {
//					System.out.print(arr[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

	}

}
