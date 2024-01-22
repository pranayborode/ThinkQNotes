package com.wordslogical;

public class MostRepeatedWord {

	public static void findMostRepeated(String st) {

		String str[] = st.split("\\s");
		int count;
		int maxLength = 0;
		String nword = "";

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

			if (count > maxLength) {

				maxLength = count;
				nword = str[i];

			}

		}
		System.out.println("Most repeated word : " + nword);
	}

	public static void main(String[] args) {

		String s = "Jingle bells jingle bells jingle all the way";

		System.out.println(s);

		findMostRepeated(s);

	}

}
