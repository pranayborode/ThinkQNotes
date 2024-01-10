package com.assignment2;

public class Addition2 {

	public static void main(String[] args) {
		
		int a = 4;
		
		a -= 10; // a = 4 - 10 = -6
		
		a = -a; // a = -(-6) = 6
		
		a = 7 + a; // 7 + 6 = 13
		System.out.println(" a = " + a); //13
		
		a %= a; // a = 13 % 13 = 0
		
		a = a * a - 3; // a = 0 * 0 - 3 = -3
		
		System.out.println(" a = " + a); //-3
		
		// a = 4 / -6 / 6 / 13 / 0 / -3
	}

}
