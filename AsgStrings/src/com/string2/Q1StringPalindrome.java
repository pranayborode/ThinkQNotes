package com.string2;

//1. Check string in palindrome
public class Q1StringPalindrome {
	
	public static boolean checkPalindrome(String str) {
		
		str = str.toLowerCase();
		
		int left = 0;
		int right = str.length()-1;
		
		while (left<right) {
			
			if(str.charAt(left) != (str.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		String str = "Eye";
		
		if(checkPalindrome(str)) {
			
			System.out.println("The given String "+str+ " is Palindrome");
		}else {
			System.out.println("The given String "+str+ " is Not Palindrome");
		}

	}

}
