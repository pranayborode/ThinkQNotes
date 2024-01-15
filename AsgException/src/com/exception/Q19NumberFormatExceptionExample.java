package com.exception;

//. WAP to show the scenario in which number-format exception is generated and handle this exception. 

public class Q19NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		try {
		int a = Integer.parseInt("abc123");
		System.out.println(a);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of code...");
	}

}
