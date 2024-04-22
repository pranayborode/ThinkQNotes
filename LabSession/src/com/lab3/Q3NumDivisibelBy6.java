package com.lab3;

public class Q3NumDivisibelBy6 {

	public static void printNumCount() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 6 == 0) {
				System.out.println(i);
				count++;

			}

		}
		System.out.println("Count  : " + count);
	}

	public static void main(String[] args) {

		printNumCount();
	}

}
