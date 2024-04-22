package com.lab13;


class A3{
	static void methodOne() {
		System.out.println("AAA");
	}
}

class B3 extends A3{
	static void mehtodOne() {
		System.out.println("BBB");
	}
}
public class MainClass {

	public static void main(String[] args) {
		
		A3 a = new B3();
		a.methodOne();

	}

}
