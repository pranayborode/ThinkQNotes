package com.lab3;

import java.util.Scanner;

// Write a program to print the ASCII Values.
public class Q4PrintASCIIValues {

	public static void printAsciiValue() {
		char ch;
		for(int i=63; i<=122; i++) {
			
			 ch = (char)i;
			System.out.println(ch+" - "+i);
		}
		
	}
	
	
	public static void main(String[] args) {
	
	
		
	  printAsciiValue();
		
		
		

	}

}
