package com.assignment19array1;

public class Q6FindDuplicate {

	static void findDuplicate(int ar[]) {

		int count = 0;

		for (int i = 0; i < ar.length; i++) {
			count = 0;
			if (ar[i] != 0) {

				for (int j = i + 1; j < ar.length; j++) {

					if (ar[i] == ar[j]) {
						count++;
						ar[j] = 0;
					}
				}
				if (count >= 1) {
					System.out.print(ar[i]+"  ");
				}
			}
		}
	}

	
	public static void main(String[] args) {

		int arr[] = { 3, 10, 4, 5, 10, 15, 4, 10 };

		findDuplicate(arr);

	}

}
