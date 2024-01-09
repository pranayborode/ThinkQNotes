package com.assignment20array2;

//26. WAJP2 find the second smallest element in an array. 
public class Q26SecondSmallestElement {
	
	static void shrotingArray(int ar[]) {

		int minNum = ar[0];
		int secMin = Integer.MAX_VALUE;
		
		for (int i = 1; i < ar.length; i++) {

			if (ar[i] < minNum) {
				secMin = minNum;
				minNum = ar[i];
			} else if (secMin > ar[i] && ar[i] != minNum) {
				secMin = ar[i];
			}
		}
		System.out.println("Minimum Number : " + minNum);
		System.out.println("Second Min : " + secMin);
	}

	public static void main(String[] args) {
		int arr[] = { 3,2,1, 12, 35, 30, 9, 3, 45, 32 };

		shrotingArray(arr);

	}


}
