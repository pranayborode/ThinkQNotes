package com.arrays;

public class MinMaxCharacterArray {

	
	public static char minCharacter(char ar[]) {
		
		char minChar = ar[0];
		
		for(int i = 0; i<ar.length; i++) {
			
			if(ar[i]<minChar) {
				minChar = ar[i];
			}
		}
		return minChar;
	}
	
	public static char maxCharacter(char ar[]) {
		
		int size = ar.length;
		char maxChar = ar[size-1];
		
		for(int i= 0; i<size ; i++) {
			if(ar[i]>maxChar) {
				maxChar= ar[i];
			}
		}
		
		return maxChar;
	}
	public static void main(String[] args) {
		
		char arr[] = { 'A', 'D', 'E', 'x', 'R', 'Z' };

		System.out.println("Min Character is : "+minCharacter(arr));
		
		System.out.println("Max Character is : "+maxCharacter(arr));

	}

}
