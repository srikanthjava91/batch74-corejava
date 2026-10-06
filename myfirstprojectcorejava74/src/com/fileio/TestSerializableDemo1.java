package com.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serialization
class Employee implements Serializable {

	private static final long serialVersionUID = 2L;
	String username = "Srikanth";
	transient String password = "Srikanth123";
	int cvv = 123;

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", cvv=" + cvv + "]";
	}

}

public class TestSerializableDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");

		Employee emp = new Employee();

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\sri.ser");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);

		System.out.println("main method ended ");
	}

}
