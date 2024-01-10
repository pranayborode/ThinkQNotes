package com.assignment4;

import java.util.Scanner;

//3. Write a Java program to input any alphabet and check whether it is vowel or consonant 

public class VowelConsonantValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");
		
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		
		case 'a':
		case 'A':	
		case 'e':
		case 'E':	
		case 'i':
		case 'I':	
		case 'o':
		case 'O':	
		case 'u':
			System.out.println("Vowel");
	        break;
	    default: System.out.println("Consonant");    
		}
		sc.close();

	}

}
