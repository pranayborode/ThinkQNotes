package com.exception;

//12. WAP to return int value in try and return int value in finally and see finally takes precedence. 
public class Q12ReturnIntValue {

	@SuppressWarnings("finally")
	public static int returnValue() {
		
//		finally {
//			return 2;
//		}
		//The finally block should be used in conjunction with a try block, and it cannot exist independently. 
		try {
			return 1;
		} finally {
			return 2;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(returnValue());// 2

	}

}
