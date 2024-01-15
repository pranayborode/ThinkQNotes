package com.exception;

//. WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
//StringIndexOutOfBound) exception is generated and handle this exception. 
public class Q8ShowException {

	public static void handleExceptions1(String str, int arr[]) {

		try {
			for (int i = 0; i <= str.length(); i++) {

				System.out.print(str.charAt(i));
			}

			System.out.println(str.charAt(15));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		String str = "I love India";
		int arr[] = { 1, 2, 3 };
		handleExceptions1(str, arr);

	}

}
