package com.exceptionhandling;

//WAP to create a text files into your local folders using java Programming.
import java.io.File;
import java.io.IOException;

//Scenario1 : CE  
//IOException checked by the compiler Whenever we called 
//			- createNewfile() from File & 
//			- read() method from FileReader 
//Scenario2 : RE 
//IOException occurs: java.io.IOException: The system cannot find the path specified.

// throws is the keyword to satisfying the compiler whenever the program creates problem with Checked Exception.
//throws vs try-catch : 
//	- try-catch helps you for Graceful termination of the programming.
//	- with throws we will get abnormal termination.
//	- By using throws we can throws unchecked exceptions also but there is no impact.

public class TestExDemo12 {

	public static void main(String[] args) throws IOException, ArithmeticException {
		System.out.println("main method started");
//		System.out.println(10 / 0);

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\bhanu124.txt");
		f.createNewFile();
		System.out.println("main method ended");
	}

}
