package com.assignment19array1;

import java.util.Arrays;

//WAP to find min character in character array. 
//Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’. 

//18. WAP to find max character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, 
//‘R’, ‘Z’, ‘p’], so max character is ‘x’.  

public class Q17MinMaxCharacterArray {

	public static char minCharacter(char ar[]) {

		char minChar = ar[0];

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] < minChar) {
				minChar = ar[i];
			}

		}
		return minChar;
	}
	
	public static char maxCharacter(char ar[]) {
		
		int size = ar.length;
		char maxCahr = ar[size-1];
		
		for(int i = 0; i<size; i++) {
			
			if(ar[i]> maxCahr) {
				maxCahr = ar[i];
			}
		}
		return maxCahr;
		
	}

	public static void main(String[] args) {

		char arr[] = { 'A', 'D', 'E', 'x', 'R', 'Z' };

		System.out.println("Min Character is : "+minCharacter(arr));
		
		System.out.println("Max Character is : "+maxCharacter(arr));

	}

}
