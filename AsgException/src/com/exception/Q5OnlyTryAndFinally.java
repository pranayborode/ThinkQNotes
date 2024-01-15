package com.exception;
//5. WAP where only try and finally is used 
public class Q5OnlyTryAndFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} 
		finally {
			System.out.println("Finally Block...");
		}

		System.out.println("Rest of the code...");
	}
}
//Last code...
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at AsgException/com.exception.Q5OnlyTryAndFinally.main(Q5OnlyTryAndFinally.java:10)