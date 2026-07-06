package com.languagefundamentals.methods;

public class Bank {

	double balance = 10000.00;

	public static void main(String[] args) {
		System.out.println("main method started ");

		Bank hdfc = new Bank();

		hdfc.deposite(5000.00);
		hdfc.withdraw(10000);

		System.out.println("main method ended ");
	}

	void checkBalance() {
		System.out.println("The Current balanace is: " + balance);
	}
	
	void withdraw(double amount) {
		System.out.println("Withdraw amount is : " + amount);
		balance = balance - amount;
		checkBalance();
	}

	void deposite(double amount) {
		System.out.println("Deposite amount is : " + amount);
		balance = balance + amount;
		checkBalance();
	}

}
