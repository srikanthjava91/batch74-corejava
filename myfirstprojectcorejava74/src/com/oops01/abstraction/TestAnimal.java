package com.oops01.abstraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

	public static void main(String[] args) throws SQLException {

		///		Cannot instantiate the type Animal
//		Animal a = new Animal();

		System.out.println("*********Dog Info ***********");

//		Create an Object of a Dog class and store into a interface Animal 
//		is the process of Abstraction with the help of Up-casting.

		Animal d = new Dog();

		d.eat();
		d.sound();
		d.walk();
		d.run();
		d.sleep();
		Animal.breath();
		System.out.println("******************************");

		System.out.println("*********cat Info ***********");
		Animal c = new Cat();
		c.eat();
		c.sound();
		c.walk();
		c.run();
		c.sleep();
		Animal.breath();
		System.out.println("******************************");

		System.out.println("*********Monkey Info ***********");
		Animal m = new Monkey();
		m.eat();
		m.sound();
		m.walk();
		m.run();
		Animal.breath();
		System.out.println("******************************");

	}

}
