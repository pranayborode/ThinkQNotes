package com.assignment19array1;

//21. WAP to display all square number in array. 
//Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.  
public class Q21SquareNumber {

	public static void checkSqrNum(int ar[]) {

		for (int i = 0; i < ar.length; i++) {

			int sqrt = (int) Math.sqrt(ar[i]);

			if ((ar[i] == (sqrt * sqrt)) && ar[i] != 0) {
				System.out.print(ar[i] + " ");
			}

		}
	}

	public static void main(String[] args) {

		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };

		checkSqrNum(arr);
	}

}
