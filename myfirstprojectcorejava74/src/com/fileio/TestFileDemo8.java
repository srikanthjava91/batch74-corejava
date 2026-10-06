package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileDemo8 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\hello.txt");
		Scanner sc = new Scanner(f);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

		System.out.println("main method ended ");
	}
}
