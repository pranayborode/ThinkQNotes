package com.assignment2;

public class Operators1 {

	public static void main(String[] args) {
		
		int a = 34;
		int b = 21;
		int c = a++ + ++b;
		//  c = 34 + 22    = 56

		int d = --a + --b + c--;
		//  d = 34  + 21 + 56   = 111

		int e = a + +b + +c + d--; 
		//  e = 34 + 21 + 55 + 111 = 221

		int f = -a + b-- + -c - d++;
        //  f = -34 + 21 + -55 - 110 = -178

		int sum = a + b + c + d + e + f;
		//        34 + 20 + 55 + 111 + 221 + -178 = 263
		System.out.println("sum = "+sum);

		//a = 34 / 35 / 34 
		//b = 21 / 22 / 21 / 20
		//c = 56 / 55 
		//d = 111 / 110 / 111
		//e = 221
		//f = -178
		
		
	}

}
