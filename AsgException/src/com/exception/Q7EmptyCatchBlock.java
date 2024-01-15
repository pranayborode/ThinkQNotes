package com.exception;

//7. WAP to check can we have an empty catch block? 
public class Q7EmptyCatchBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}catch (Exception e) {
			// Empty catch block
		}

		System.out.println("Rest of code...");
	}

}
