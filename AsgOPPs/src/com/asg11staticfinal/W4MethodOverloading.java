package com.asg11staticfinal;

//4.	Write a meaningful program to show the use of method overloading.

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double multiply(double x, double y) {
		return x * y;
	}

	public double multiply(double x, double y, double z) {
		return x * y * z;
	}

}

public class W4MethodOverloading {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		System.out.println("addition of two numbers : "+c1.add(4, 9));
		System.out.println("addition of three numbers : "+c1.add(1, 2, 3));
		System.out.println("product of two numbers : "+c1.multiply(7, 5));
		System.out.println("product of three numbers : "+c1.multiply(8, 4, 9));

	}

}
