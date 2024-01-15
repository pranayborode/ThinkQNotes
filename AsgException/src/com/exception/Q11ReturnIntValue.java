package com.exception;

//11. WAP to return int value in try block and return int value in finally block and observe which return takes precedence 
public class Q11ReturnIntValue {

	@SuppressWarnings("finally")
	public static int returnValue() {

		try {
			return 1;
		} 
		finally {
			return 2;
		}
	}

	public static void main(String[] args) {
		System.out.println(returnValue());// 2

	}

}
