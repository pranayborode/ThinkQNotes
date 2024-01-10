package com.assignment4;

public class Price {

	public static void main(String[] args) {

		int price = 6;
		switch (price) {
		case 2:
			System.out.println("It is: 2");
		default:
			System.out.println("It is: default");
		case 5:
			System.out.println("It is: 5");
		case 9:
			System.out.println("It is: 9");

//          Result:			
//			It is: default
//			It is: 5
//			It is: 9
		}

	}

}
