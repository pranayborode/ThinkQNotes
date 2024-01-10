package com.assignment2;

public class MyClass {

	public static void main(String[] args) {

		int i = 4;
		int j = 21;

		int k = ++i * 7 + 2 - j--;
		// k = 5 * 7 + 2 - 21 = 16

		// i = 4 / 5
		// j = 21 / 20

		System.out.println("k = " + k); // 16

	}

}
