package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//WAP to read the data from the File and print in console..
////Scenario1 : CE   
///Whenever we create Object for FileReader compiler checks and gives CE 
/////Unhandled exception type FileNotFoundException
///
///Scenario2 : RE 
///Exception in thread "main" 
///java.io.FileNotFoundException: 
///C:\Users\srknt\Srikanth Java\test\bhanu125.txt 
///(The system cannot find the file specified)
///
///
///Scenario 1: Interrupted Exception 
///Whenever we call Thread.sleep() will get a CE.
///
///scenario2 : whenever interrupt() method.
public class TestExDemo13 {

	public static void main(String[] args) throws Exception, FileNotFoundException, IOException, InterruptedException {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\bhanu124.txt");
		FileReader fr = new FileReader(f);// Unhandled exception type FileNotFoundException

		int i = fr.read();// Reads a single character.

		while (i != -1) {
			System.out.print((char) i);
			Thread.sleep(500);
			i = fr.read();
		}

		System.out.println("main method ended ");

	}
}
