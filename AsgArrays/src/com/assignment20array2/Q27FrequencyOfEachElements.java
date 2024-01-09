package com.assignment20array2;

//27. WAJP2 count frequency of each element in an array. 
public class Q27FrequencyOfEachElements {

	public static void findFrequency(int arr[]) {

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
				
				System.out.println(arr[i] + "-->" + count);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 1, 7, 1, 2, 1, 4, 3, 2 };

		findFrequency(arr);
	}

}
