package com.wordslogical;

public class ReverseMiddleWords {

	public static void reverseMidWords(String st) {

		String arr[] = st.split("\\s");
		String revSt = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length() - 1; j >= 0; j--) {
				
				if (i == 0 || i == arr.length - 1) {

					revSt = revSt + arr[i].charAt(j);
				}

			}
			revSt = revSt + " ";

		}
		System.out.println(revSt);
	}

	public static void main(String[] args) {

		String str = "I like to learn Java";
		reverseMidWords(str);

	}

}
