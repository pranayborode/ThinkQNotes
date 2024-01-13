package com.assignment19array1;

//10. Write a Java program to find a missing number in an array. Means e.g. array has 1 
//to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5  

public class Q10MissingNumber {

	public static void findMissingNo(int ar[]) {
		int size = ar.length;
		int start = ar[0];
		int end = ar[size - 1];
		boolean status = false;
			
		for (int i = start; i <= end; i++) {
			for (int j = 0; j < size; j++) {

				if (ar[j] == i) {
					status = true;
					break;

				} else {
					status = false;
				}
			}
			if (status == false) {
				System.out.println("Missing No is : "+i);
			}
		}
	}	
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 7 };
		findMissingNo(arr);
	}

}
