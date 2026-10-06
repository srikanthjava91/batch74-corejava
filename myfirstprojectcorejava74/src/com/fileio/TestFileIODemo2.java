package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileIODemo2 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\students");

//		Creates the directory named by this abstract pathname.
		boolean flag = f.mkdir();

		if (flag) {
			System.out.println("Created a New Directory or folder ");
		} else {
			System.out.println("Something went wrong ");
		}

		File f1 = new File(f, "Srikanth.txt");
		f1.createNewFile();

		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());

		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());

		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());

		File f2 = new File("C:\\Users\\srknt\\Srikanth Java");
		String[] files = f2.list();
		int count = 0;

		for (String filename : files) {
			System.out.println(filename);
			count++;
		}

		System.out.println("total Files :" + count);
		System.out.println("total Files :" + files.length);
	}
}
