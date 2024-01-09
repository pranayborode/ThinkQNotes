package com.assignment20array2;

//7. Write two methods that return the average of an array with 
//following headers.  
//a. public static int average(int[] array)  
//b. public static double average(double[] array).  
//c. Use {1,2,3,4,5,6} , {6.0,3.4,6.4,1.2,4.0} to test the methods 

public class Q7ArrayAverage {

	public static int average(int[] array) {

		int sum = 0;
		int size = array.length;
		for (int i = 0; i < size; i++) {

			sum += array[i];

		}
		return (sum / size);
	}
	
	
	public static double average(double[] array) {

		double sum = 0;
		int  size = array.length;
		for (int i = 0; i < size; i++) {

			sum += array[i];

		}
		return (sum / size);
	}
	

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6 };

		double arr2[] = { 6.0, 3.4, 6.4, 1.2, 4.0 };

		System.out.println("Average of int type array : "+average(arr1));
		
		System.out.println("Average of double type array : "+average(arr2));
	}

}
