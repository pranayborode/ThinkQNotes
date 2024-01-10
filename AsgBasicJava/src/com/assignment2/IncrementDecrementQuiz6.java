package com.assignment2;

public class IncrementDecrementQuiz6 {

	public static void main(String[] args) {

		int i = 19, j = 29, k;

		k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;

		// k = 19 - 18 + 28 - 29 + 18 - 29 + 19 - 28 = -20

		// i = 19 / 18 / 19 / 18 / 19
		// j = 29 / 28 / 29 / 28 / 29

		System.out.println("i= " + i); // 19
		System.out.println("j= " + j); // 29
		System.out.println("k= " + k); // -20

	}

}
