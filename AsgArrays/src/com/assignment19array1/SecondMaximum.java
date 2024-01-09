package com.assignment19array1;

public class SecondMaximum {

	
	static void shrotingArray(int ar[]) {
		
		int maxNum = ar[0];
		int secMax = 0; 
		for(int i = 0; i<ar.length; i++) {
			
			if(ar[i]>maxNum) {
				secMax = maxNum;
				maxNum = ar[i];
			}
			else if(secMax<ar[i] && ar[i]!= maxNum) {
				secMax = ar[i];
			}
		}
		System.out.println("Maximum Number : "+maxNum);
		System.out.println("Second Max : "+secMax);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {12, 35, 30, 45, 32};
		
		shrotingArray(arr);

	}

}
