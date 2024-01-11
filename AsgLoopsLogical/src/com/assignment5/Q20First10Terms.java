package com.assignment5;


// 1.	Write a program in Java to display the first 10 terms of the following series:
//      10, 20, 30, 40, ……..


public class Q20First10Terms {

	public static void main(String[] args) {

		int firstTerm = 10;
		int diff = 10;
		int termsToDisplay = 10;

		for (int i = 0; i < termsToDisplay; i++) {

			int term = firstTerm + i * diff;
			System.out.println(term);
		}

	}

}
