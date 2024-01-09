package com.assignment20array2;

public class Q16AddAllElements {

	public static void add(int... arr) {

		int sum = 0;

		for (int x : arr) {
			sum += x;
		}

		System.out.println("Sum Of all Emements in Array : " + sum);
	}

	public static void main(String[] args) {

		add(1, 2);
		add(1, 2, 4, 5, 6, 7, 8);

	}

}
