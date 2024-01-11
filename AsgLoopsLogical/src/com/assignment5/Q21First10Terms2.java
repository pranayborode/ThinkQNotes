package com.assignment5;


//2.	Write the program in Java to display the first ten terms of the following series: 1, 4, 9, 16,

public class Q21First10Terms2 {

	public static void main(String[] args) {
		
		
		int termsToDisplay = 10;
		

		for (int i = 1; i <= termsToDisplay; i++) {

			int term = i*i;
			System.out.println(term);
		}
		
		

	}

}
