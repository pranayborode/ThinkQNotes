package com.logical;

import java.util.Arrays;

public class StringArraySort {

	public static void sortArray(String str[]) {

		// Sort the array on the basis of length
		// of length is same then lexo

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {

				if (str[i].length() == str[j].length()) {
					if (str[i].compareTo(str[j]) > 0) {

						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				} else if (str[i].length() > str[j].length()) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		String arr[] = {"Java", "C", "Angular", "Devops", "Python", "Kotlin"};
		
		System.out.println("Before: "+Arrays.toString(arr));
		sortArray(arr);
		System.out.println("After : "+Arrays.toString(arr));
		
	}

}
