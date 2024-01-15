package com.exception;

//2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception. 
public class Q2HandleException {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };

		for (int i = 0; i <= arr.length; i++) {

			try {
				System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		System.out.println("Rest of the code...");

	}

}
//1
//2
//3
//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//Rest of the code...