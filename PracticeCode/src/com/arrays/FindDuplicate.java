package com.arrays;

public class FindDuplicate {

	static void findDuplicate(int arr[]) {
		
		int count;
		
		for(int i =0; i<arr.length;i++) {
			
			count = 0;
			if(arr[i] != 0) {
				
				for(int j = i+1; j<arr.length; j++) {
					if(arr[i] == arr[j]) {
						count++;
						arr[j] = 0;
					}
				}
				if(count>=1) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 3, 10, 4, 5, 10, 15, 4, 10, 5 };

		findDuplicate(arr);


	}

}
