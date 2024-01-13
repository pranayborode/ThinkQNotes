package com.assignment19array1;

//11. WAP to calculate average of all elements in an Array except max and min element 
//(Means don’t include the highest and lowest number of your array in your average). 

public class Q11AverageWithoutMinMax {

	public static void calcAverageWithoutMinMax(int ar[]) {
		int max = findMax(ar);
		int min = findMin(ar);
		int size = ar.length;
		int sum = 0;
		
		for(int i = 0; i<size; i++) {
		    sum += ar[i]; 	
		}
		int ave = (sum-(max+min))/(size-2);
		System.out.println("AverageWithoutMinMax : "+ave);
	}

	static int findMax(int ar[]) {

		int max = 0;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}

	static int findMin(int ar[]) {

		int min = 0;

		for (int i = 1; i < ar.length; i++) {

			if (ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {

		int arr[] = { 12, 5, 18, 3, 25, 9 };

		calcAverageWithoutMinMax(arr);
	}

}
