package com.assignment2;

public class IncrementDecrementQuiz8 {

	public static void main(String[] args) {

		int a = 1;

		a = a++ + ++a * --a - a--;

		// a = 1 + 3 * 2 - 2 =5

		// a = 1 / 2 / 3 / 2 / 1

		System.out.println(a); // 5

	}

}
