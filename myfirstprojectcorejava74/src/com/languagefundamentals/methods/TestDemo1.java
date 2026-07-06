package com.languagefundamentals.methods;

///i) No return type + no argument 
public class TestDemo1 {

	static void show() {
		System.out.println("show method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		TestDemo1 t = new TestDemo1();
		show();
		t.welcome();
		System.out.println("main method ended !!");
	}

	void welcome() {
		System.out.println("welcome to methods !!");
	}

}
