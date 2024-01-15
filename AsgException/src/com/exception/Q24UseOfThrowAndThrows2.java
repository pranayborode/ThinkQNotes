package com.exception;

//17. WAP to show throw and throws keyword. 

class Parent2 {
	int data = 50;

	void printDate() {
		System.out.println(data);
	}

	void printData2() throws ArithmeticException {
		System.out.println(data / 0);
	}
}

class Child2 extends Parent2 {

	int val = 0;

	void printData() throws ArithmeticException {
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

	}

	void printData2() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);

	}

}

public class Q24UseOfThrowAndThrows2 {

	public static void main(String[] args) {

	}

}
