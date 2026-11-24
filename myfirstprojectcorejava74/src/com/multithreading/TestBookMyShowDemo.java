package com.multithreading;

class BookMyShow {
	int total_tickets = 10;

	synchronized void bookMyTicket(String name, int tickets) {

		if (total_tickets >= tickets) {
			System.out.println(tickets + " - Tickets have been Booked Sucessfully By " + name);
			total_tickets -= tickets;
			System.out.println("The Remaining tickets are availble : " + total_tickets);
		} else {
			System.err.println("The Tickets are sold out !! mr " + name);
			System.err.println("The Remaining tickets are availble : " + total_tickets);
		}

	}

}

class Customer extends Thread {

	String customerName;
	BookMyShow bms;
	int tickets;

	public Customer(String customerName, BookMyShow bms, int tickets) {
		this.customerName = customerName;
		this.bms = bms;
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bms.bookMyTicket(customerName, tickets);
	}

}

public class TestBookMyShowDemo {

	static BookMyShow bms = new BookMyShow();

	public static void main(String[] args) {
		System.out.println("Welcome Book My Show !! Have Fun !!");

		Customer c1 = new Customer("Aakash", bms, 4);
		c1.start();

		Customer c2 = new Customer("Karthi", bms, 4);
		c2.start();

		Customer c3 = new Customer("Sravan", bms, 4);
		c3.start();

	}

}
