package com.exception;

//1. WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the 
//   line number from where the Exception is thrown 
public class Q1ThrowsException {

	public static void main(String[] args) {
		
		int arr[] = {1, 3, 4};
		for(int i =0; i<=arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
//Exception in thread "main" 1
//3
//4
//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//	at AsgException/com.exception.Q1ThrowsException.main(Q1ThrowsException.java:12)