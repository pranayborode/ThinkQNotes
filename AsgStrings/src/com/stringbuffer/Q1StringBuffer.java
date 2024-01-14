package com.stringbuffer;

//1.	Create String Buffer use append
//2.	Use toString
//3.	Compare StringBuffer with String?

public class Q1StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("I ");
		sb.append("Love ");
		sb.append("India");
		
		System.out.println("StringBuffer: "+sb);
		
		String resultString = sb.toString(); // toString method convert the StringBuffer to a regular String.
		System.out.println("Result String: "+resultString);
		
		
		if(sb.toString().equals(resultString)) {
			System.out.println("StringBuffer is equal to String");
		}else {
			System.out.println("StringBuffer is not equal to String");
		}
		

	}

}
