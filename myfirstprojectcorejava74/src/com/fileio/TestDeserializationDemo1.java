package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//De-serialization
public class TestDeserializationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\sri.ser");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee obj = (Employee) ois.readObject();

		System.out.println(obj);

		System.out.println("main method ended ");

	}

}
