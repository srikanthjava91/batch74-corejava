package com.stringhandling;

public class TestStrDemo17 {

	public static void main(String[] args) {
		
		String phone = "9988776655";
		boolean isValid = phone.matches("[6-9][0-9]{9}");
		System.out.println(isValid);
		
		String aadhar = "345665436789";
		boolean isValidAadhar = aadhar.matches("[2-9][0-9]{11}");
		System.out.println(isValidAadhar);
		
		String pan = "abCDE1234G";
		boolean isPanValid = pan.matches("[a-z/A-Z]{5}[0-9]{4}[a-z/A-Z]");
		System.out.println(isPanValid);
				

	}

}
