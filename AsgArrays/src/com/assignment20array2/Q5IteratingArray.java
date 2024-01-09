package com.assignment20array2;

import java.util.Arrays;

//5. WAJP2 copy an array by iterating the array.  

public class Q5IteratingArray {

	public static void main(String[] args) {
		
		int myArray [] = {2, 3, 5, 7, 9};
		
		System.out.println("My Array : "+Arrays.toString(myArray));
		
		int newArray [] = new int [5];
		
		for(int i = 0; i<myArray.length; i++) {
			
			newArray[i] = myArray[i];
		}

		System.out.println("New Array : "+Arrays.toString(newArray));
	}

}
