package com.exception;



//27. WAP to show checked exception thrown 
public class Q27CheckedExceptionThrow {

	public static void main(String[] args) {
		
		int result = 10/0;
		throw new ArithmeticException("/ by zero");

	}

}
