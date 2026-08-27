package com.arrays;

public class TestArrDemo18 {

	public static void main(String[] args) {

		int[][][] arr = { { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80 } },
				{ { 90, 100 }, { 110, 120, 130 }, { 140, 150 }, { 160, 170, 180 } }, { { 190, 200 }, { 210, 220 } } };
		System.out.println(arr);

//		for(int[][] arr2:arr) {
//			for(int[] arr1:arr2) {
//				for(int a:arr1) {
//					System.out.print(a + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
