package com.wordslogical;

public class FrequencyWords {

	public static void findFreq(String st) {

		String str[] = st.split("\\s");
		int count;

		for (int i = 0; i < str.length; i++) {
			count = 1;

			if (str[i].equals("Visited")) {
				continue;
			}

			for (int j = i + 1; j < str.length; j++) {

				if (str[i].equalsIgnoreCase(str[j])) {
					count++;
					str[j] = "Visited";
				}
			}
			System.out.println(str[i] + " : " + count);
		}
	}

	public static void main(String[] args) {

		String s = "A big cat is rolling on a big mat where there is a small cat";

		System.out.println(s);

		findFreq(s);

	}

}
