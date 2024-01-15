package com.exception;

// WAP to throw exception still finally should get executed 
public class Q10ThrowExceptionTillFinally {

	public static void main(String[] args) {

		int arr[] = { 12, 0, 4 };

		try {
			for (int i = 0; i < arr.length; i++) {
				try {
					System.out.println("Value:" + 100 / arr[i]);
				} catch (ArithmeticException e) {
					System.out.println(e);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally Block ....");
		}

		System.out.println("Rest of Code...");
	}

}
