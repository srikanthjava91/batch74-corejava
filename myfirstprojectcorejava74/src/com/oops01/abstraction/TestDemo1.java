package com.oops01.abstraction;

interface In1 {
	void method1();

	void method2();
	
	void method6();

	default void method4() {
		System.out.println("method4 called from In1");
	}
}

interface In2 {
	void method2();

	void method3();

	default void method4() {
		System.out.println("method4 called from In2");
	}

}

interface In3 extends In2, In1 {

	@Override
	default void method4() {
		In2.super.method4();
	}

}

//How Java is supporting multiple inheritance, because in interfaces we have only duplicate declarations 
//but from implemented class, here it is unique implementation, so there is no Ambiguity 
//from the functionalities.
//SO that is the reason Java support multiple Inheritance for interfaces.
class Test1 implements In3 {

	@Override
	public void method1() {
		System.out.println("methdo1 called ");

	}

	@Override
	public void method2() {
		System.out.println("methdo2 called ");

	}

	@Override
	public void method3() {
		System.out.println("methdo3 called ");

	}

	@Override
	public void method4() {
		In3.super.method4();
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		
	}

}

public class TestDemo1 {

	public static void main(String[] args) {

		In3 i = new Test1();
		i.method1();
		i.method2();
		i.method3();
		i.method4();

	}

}
