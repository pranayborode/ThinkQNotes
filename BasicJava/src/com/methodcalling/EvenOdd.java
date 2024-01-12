package com.methodcalling;

public class EvenOdd {

	public static void checkEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "is Even");
		} else {
			System.out.println(num + "is Odd");
		}
	}
	
	public static int calcSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {

		checkEvenOdd(34);
		
		int result = calcSum(24,67);
		System.out.println(result);
		
		System.out.println(calcSum(87, 89));
	}

}
