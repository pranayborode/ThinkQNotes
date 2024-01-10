package com.assignment2;

public class IncrementDecrementQuiz10 {

	public static void main(String[] args) {

		int x = 001, y = 010, z = 100;

		
		int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
		
		// i = 0 + 8 - 100 - 98 + 10 - -1 + 10 - -2 = -167
		
		//convert Octal to Decimal
		// x = 001 = 1 / 0 / -1 / -2
		// y = 010 = 8 / 9 / 10 / 9 
		
		// z = 100 / 99 / 98 

		System.out.println("x = " + x); //-2
		System.out.println("y = " + y); //9
		System.out.println("z = " + z); //98
		System.out.println("i = " + i); //-167

	}

}
