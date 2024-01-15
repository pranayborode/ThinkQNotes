package com.exception;

//WAP to use try catch finally and in close operation again try catch to be used. 
public class Q23NestedTryCatchFinally {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 3 };

		try {
			for (int i = 0; i < arr.length; i++) {

				try {
					System.out.println("Value: " + 100 / arr[i]);
				} catch (ArithmeticException e) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block");
		}

	}

}
