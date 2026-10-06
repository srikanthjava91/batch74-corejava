package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileIODemo1 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

//		Creates a new File instance by converting the given pathname string 
//		into an abstract pathname.
		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\students.txt");

		try {
			System.out.println("in try");

//			Atomically creates a new, empty file named by this abstract pathname 
//			if and only if a file with this name does not yet exist.

			if (!f.exists()) {
				boolean flag = f.createNewFile();

				if (flag) {
					System.out.println("File has beean Created Successfully !!");
				} else {
					System.out.println("Somethig went wrong ");
				}
			} else {
				System.out.println("With this name the file already avilable !");
			}

		} catch (IOException e) {
			System.err.println("in try");
			e.printStackTrace();
		}

		System.out.println("main method ended ");
	}

}
