package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo5 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test\\java123.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Java is High Level");
		bw.newLine();
		bw.write("Java is Platform Independent");
		bw.newLine();
		bw.write("Java is Multithreaded");
		bw.flush();

		System.out.println("main method ended");
	}

}
