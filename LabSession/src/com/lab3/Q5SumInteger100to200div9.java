package com.lab3;

public class Q5SumInteger100to200div9 {

	public static void sumInteger() {

		int sum = 0;
		for (int i = 100; i <= 200; i++) {

			if (i % 9 == 0) {
				System.out.println(i);
				sum += i;
			}

		}
		System.out.println("Sum integer between 100 to 200 div by 9 : " + sum);
	}

	public static void main(String[] args) {

		sumInteger();
	}

}
