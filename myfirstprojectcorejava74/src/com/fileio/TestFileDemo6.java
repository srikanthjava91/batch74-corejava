package com.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileDemo6 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started");

		try (PrintWriter pw = new PrintWriter("C:\\Users\\srknt\\Srikanth Java\\test\\cricket.txt")) {
			pw.println(123);
			pw.println('X');
			pw.println("Srikanth");
			pw.println(123.5F);
			pw.println(123.5);
		}

		System.out.println("main method ended");

	}

}
