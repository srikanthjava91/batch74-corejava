package com.oops01.inheritance;

abstract class TestAbs {
	abstract void method1();
}

class TesImpl extends TestAbs {

	@Override
	void method1() {

	}
}

abstract class Test extends TesImpl {
	@Override
	abstract void method1();
}

class Test1 {
	public static void main(String[] args) {
		System.out.println("main method started ");
	}
}

class Test2 extends Test1 {

	public static void main(String[] args) {
		System.out.println("main method started from Test2");

	}
}

public class TestMOR {

	public static void main(String[] args) {

	}

}
