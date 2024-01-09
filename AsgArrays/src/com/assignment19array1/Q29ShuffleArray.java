package com.assignment19array1;

import java.util.Arrays;
import java.util.Random;


//29. WAP to shuffle array. Means e.g. arr[] = [5, 6, 23, 67, 39, 10, 2]  
//     So output array is [6, 23, 67, 39, 10, 2, 5]. 
public class Q29ShuffleArray {
	
	public static void shuffleArray(int ar[]) {
		
		Random rand = new Random();
		
		for(int i = ar.length-1; i>0; i-- ) {
			
			int randIndex = rand.nextInt(i+1);
			int temp = ar[i];
			ar[i] = ar[randIndex];
			ar[randIndex] = temp;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {5, 6, 23, 67, 39, 10, 2};
		System.out.println(Arrays.toString(arr));
		
		shuffleArray(arr);
		 
		System.out.println(Arrays.toString(arr));
	}

}
