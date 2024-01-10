package com.assignment2;

public class IncrementDecrementQuiz4 {

	public static void main(String[] args) {

		int i = 1, j = 2, k = 3;

		int m = i-- - j-- - k--; // m = 1 - 2 - 3 = -4

		// i = 1 / 0
		// j = 2 / 1
		// k = 3 / 2

		System.out.println("i= " + i);
		System.out.println("j= " + j);
		System.out.println("k= " + k);
		System.out.println("m= " + m);

	}

}
