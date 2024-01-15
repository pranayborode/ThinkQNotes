package com.exception;

//WAP to show ClassNotFoundException 
public class Q32ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		
		 try {

	            Class.forName("com.exception.Demo");

	            ClassLoader.getSystemClassLoader().loadClass("com.exception.Demo");

	        } catch (ClassNotFoundException e) {
	           System.out.println(e);
	        }
	}

}
