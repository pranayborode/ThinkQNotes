package com.exception;

//6. WAP to show unchecked exception 
public class Q6ShowUncheckedException {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };

		try {
			System.out.println(arr[5]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		String s = null;
		try {
			System.out.println(s.equals("Abc"));
		} catch (Exception e) {
			System.out.println(e);
		}

		int a = 10;

		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		
	}

}
