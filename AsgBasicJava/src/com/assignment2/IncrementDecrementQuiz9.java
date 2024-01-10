package com.assignment2;

public class IncrementDecrementQuiz9 {

	public static void main(String[] args) {

		int m = 1010, n = 1010;

		System.out.println(m++ / ++n * n-- / --m);
		
		// 10 / 11 * 11 / 10 = 0
		
		// convert Binary to Decimal
		// m = 1010  = 10 / 11 / 10
		// n = 1010  = 10 / 11 / 10 
		
		System.out.println(m); //1010
		System.out.println(n); //1010

	}

}
