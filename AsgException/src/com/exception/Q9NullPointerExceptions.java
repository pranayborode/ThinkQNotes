package com.exception;


// WAP to show 3 different scenario in which null pointer exceptions generated, and handle that exception. 
public class Q9NullPointerExceptions {

	public static void main(String[] args) {

		try {
			String str1 = null;
			int length = str1.length();
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		
		try {
			int arr[] = null;
			int value = arr[0];
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		
		try {
			String str2 = null;
			
			System.out.println(str2.charAt(0));
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		try {
			String str3 = null;
			boolean isEmpty = str3.isEmpty();
		}catch (NullPointerException e) {
			System.out.println(e);
		}

	}

}
