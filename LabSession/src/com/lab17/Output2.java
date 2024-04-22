package com.lab17;

public class Output2 {

	static void foo(int i) {
		System.out.println(1);
	}
	static void foo(Number i) {
		System.out.println(2);
	}
	static void foo(double i) {
		System.out.println(3);
	}
	static void foo(Long i) {
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		long num = 90;
		foo(num);

	}

}
