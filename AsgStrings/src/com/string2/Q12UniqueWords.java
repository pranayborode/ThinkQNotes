package com.string2;

//12. Unique words
public class Q12UniqueWords {

	public static void findUniqueWords(String str) {

		int count;
		String st[] = str.split("\\s");

		for (int i = 0; i < st.length; i++) {

			count = 1;
			if (st[i].equals("Visited")) {
				continue;
			}

			for (int j = i + 1; j < st.length; j++) {

				if (st[i].equalsIgnoreCase(st[j])) {
					count++;
					st[j] = "Visited";
				}

			}
			if (count == 1) {
				System.out.println(st[i]);
			}
		}
	}

	public static void main(String[] args) {

		String str = "Jingle bells jingle bells jingle all the way";
		findUniqueWords(str);
	}

}
