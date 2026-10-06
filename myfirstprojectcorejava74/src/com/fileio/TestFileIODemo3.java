package com.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIODemo3 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\students.txt");
		try (FileReader fr = new FileReader(f)) {
			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}
		}
	}

}
