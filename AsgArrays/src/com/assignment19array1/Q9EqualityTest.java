package com.assignment19array1;

//9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 
//32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] Here both arrays are equal  

public class Q9EqualityTest {
	
	public static boolean checkArraysEqual(int arr1[], int arr2[]) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i = 0; i<arr1.length; i++) {
			if(arr1[i] !=arr2[i]) {
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		
		int arr1[] = {12, 22, 32, 42, 52, 62};
		//int arr2[] = {52, 22, 62, 12, 42, 22};
		int arr2[] = {12, 22, 32, 42, 52, 62};
		
		if(checkArraysEqual(arr1, arr2)) {
			System.out.println("Arrays are Equal");
		}else {
			System.out.println("Here both arrays are equal");
		}
		

	}

}
