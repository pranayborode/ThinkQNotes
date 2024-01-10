package com.assignment2;

public class IncrementDecrementQuiz7 {

	public static void main(String[] args) {

		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;
		
		// p = -1 * -1 * -1 * -1 = 1
		
		// m = 0 / -1 / -2
		// n = 0 / -1 / -2

		System.out.println("p = "+p);
		System.out.println("m = "+m); //-2
		System.out.println("n = "+n); //-2

	}

}
