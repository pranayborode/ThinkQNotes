package com.assignment20array2;

//23. WAJP2 find and count total number of duplicate elements in an array. 
//24. WAJP2 print all unique elements in the array.  
public class Q23DuplicateElements {

	public static void findDuplicate(int arr[]) {

		int count;
		boolean status;

		for (int i = 0; i < arr.length; i++) {

			count = 1;
			status = false;

			for (int j = i - 1; j >= 0; j--) {

				if (arr[i] == arr[j]) {
					
					status = true;
					break;
				}
			}
			
			if(status ==false) {
				for(int k = i+1; k<arr.length; k++) {
					
					if(arr[i] == arr[k]) {
						count++;
					}
				}
				
				if(count>1) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 1, 7, 1, 2, 1, 4, 3, 2 };

		findDuplicate(arr);
	}

}
