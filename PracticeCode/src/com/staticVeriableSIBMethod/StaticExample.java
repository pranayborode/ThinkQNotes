package com.staticVeriableSIBMethod;

public class StaticExample {

	static int staticVariable;

	static {
		System.out.println("Static Initialization Block");
		staticVariable = 10;
	}

	static void methodOne() {
		System.out.println("Static method");
		System.out.println(staticVariable);
	}

	public static void main(String[] args) {

		methodOne();	
		
		StaticExample.methodOne();
		StaticExample.staticVariable=20;
		StaticExample.methodOne();
	}

}
