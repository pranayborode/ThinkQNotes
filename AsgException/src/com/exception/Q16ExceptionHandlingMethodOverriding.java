package com.exception;

import java.io.IOException;

//16. WAP to check Exception handling with method overriding. Means, If super class method don’t 
//    declare exception then subclass overridden method can declare exception or not.  

class Parent1 {
	int data = 50;

	void printData() throws IOException {
		System.out.println(data);
		throw new IOException("Input error...");
	}
}

class Child1 extends Parent1 {

	int val = 10;

	void printData() throws ArithmeticException, IOException {

		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

	}

	void printData2() throws ArithmeticException, IOException {

		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

	}

}

public class Q16ExceptionHandlingMethodOverriding {

	public static void main(String[] args) throws ArithmeticException, IOException {

		Child1 c = new Child1();
		
		c.printData2();
	}

}
