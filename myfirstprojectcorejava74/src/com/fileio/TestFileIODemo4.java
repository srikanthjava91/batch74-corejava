package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileIODemo4 {

	public static void main(String[] args) throws IOException {

		System.out.println("main method started ");
		try (FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth123.txt")) {
			fw.write(65);
			fw.write('\n');
			fw.write('A');
			fw.write('\n');
			fw.write('S');
		}

	}
}
