package com.oops01.abstraction;

public class SavingsAccount extends BankAccountAbs {

	double balance = 10000.00;

	@Override
	public void deposite(double amount) {
		hello();
		System.out.println("Your deposite amount i s: " + amount);
		balance = balance + amount;
		checkBalance();

	}

	@Override
	public void withdraw(double amount) {
		hello();
		System.out.println("Your withdraw amount i s: " + amount);
		if (amount <= balance) {
			balance = balance - amount;
			checkBalance();
		} else {
			System.out.println("In sufficient balanace : ");
		}

		checkBalance();
	}

	@Override
	public void checkBalance() {
		System.out.println("The Current balanace is : " + balance);
	}

	@Override
	void hello() {
		System.out.println("Good morning Have a nice day !!");
	}

}
