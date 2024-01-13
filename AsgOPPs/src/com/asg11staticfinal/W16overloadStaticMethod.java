package com.asg11staticfinal;

//16.	WAP to overload static method.
public class W16overloadStaticMethod {

	public static void add(int a, int b) {
		System.out.println("Sum of two numbers : " + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println("Sum of three numbers : " + (a + b + c));
	}

	public static void main(String[] args) {

		add(12, 17);
		add(17, 10, 20);
	}

}
