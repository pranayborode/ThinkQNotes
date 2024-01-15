package com.exception;

//17. WAP to show throw and throws keyword. 

class Parent {
	int data = 50;

	void printDate() {
		System.out.println(data);
	}

	void printData2() throws ArithmeticException {
		System.out.println(data / 0);
	}
}

class Child extends Parent {

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

public class Q17UseOfThrowAndThrows {

	public static void main(String[] args) {

		Child c = new Child();

		c.printData2();
	}

}
