package com.wordslogical;

public class ReverseWordByWord {

	public static void reverseByWord(String st) {

		String arr[] = st.split("\\s");
		String revSt = "";

		for (int i = 0; i < arr.length; i++) {

			// String word = arr[i];
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				revSt = revSt + arr[i].charAt(j);

			}
			revSt = revSt + " ";
		}
		System.out.println(revSt);
	}

	public static void main(String[] args) {

		String str = "I love India";

		reverseByWord(str);
	}

}
