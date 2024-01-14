package com.string1;

//27.	Write a Java program to find lowest frequency character in a string.
public class Q27LowestFreqCharacter {

	public static void findLowestFreqCharacter(String st) {

		st = st.toLowerCase();

		char lowestFreqChar = '0';
		int lowestFreq = Integer.MAX_VALUE;

		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) == ' ') {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < st.length(); j++) {

				if (st.charAt(i) == st.charAt(j)) {
					count++;
				}
			}

			if (count < lowestFreq) {
				lowestFreq = count;
				lowestFreqChar = st.charAt(i);
			}
		}
		System.out.println("lowest frequency character : " + lowestFreqChar);

	}

	public static void main(String[] args) {

		String str = "I love java programming";
		System.out.println(str);

		findLowestFreqCharacter(str);
	}

}
