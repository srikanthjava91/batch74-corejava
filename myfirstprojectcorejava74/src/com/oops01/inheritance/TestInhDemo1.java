package com.oops01.inheritance;

//In Java, Every class extends Object class 
//will consider that as a Implicit Single Inheritance.
//Parent or Super or Base
class Animal {

	void animalInfo() {
		System.out.println("Animal method called ");
	}

	void sound() {
		System.out.println("Every animal can sound !");
	}

}

//One class extends another class will consider as Single Inheritance.
//Child or Sub or Derived 
class Dog extends Animal {

	void dogInfo() {
		System.out.println("Dog method called ");
	}

	@Override
	void sound() {
		System.out.println("Dog sounds like Bow Bow !!");
	}
}

//One class extends another class, 
//that another class one more class this flow will consider as Multi-level inheritance 
//Grand Child 
class BabyDog extends Dog {

	void babyDogInfo() {
		System.out.println("Baby Dog method called ");
	}

	@Override
	void sound() {
		System.out.println("Baby Dog sounds like bu bu bu uff ");
	}

}

public class TestInhDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started from Driver class ");
		BabyDog bg = new BabyDog();

		bg.animalInfo();
		bg.babyDogInfo();
		bg.dogInfo();
		bg.sound();
		System.out.println(bg.hashCode());

	}

}
