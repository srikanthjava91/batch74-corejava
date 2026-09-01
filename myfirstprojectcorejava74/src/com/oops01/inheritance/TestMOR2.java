package com.oops01.inheritance;

abstract class TestA1 {
	abstract void method1();
	
	public static void main(String[] args) {
		
	}
}

class TestA2 extends TestA1 {
	
	public static void mian(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void method1() {

	}

}

abstract class TestA3 extends TestA2 {
	@Override
	abstract void method1();
}

public class TestMOR2 {

	public static void main(String[] args) {

	}

}
