package com.string2;

//11. Duplicate words
public class Q11DuplicateWords {

	public static void findDuplicateWords(String str) {

		str = str.toLowerCase();

		int count;

		String st[] = str.split("\\s");

		for (int i = 0; i < st.length; i++) {
			count = 1;

			if (st[i].equals("Visited")) {
				continue;
			}

			for (int j = i + 1; j < st.length; j++) {

				if (st[i].equals(st[j])) {
					count++;
					st[j] = "Visited";
				}

			}

			if (count >= 2) {
				System.out.println(st[i]);
			}

		}
	}

	public static void main(String[] args) {

		String str = "Jingle bells jingle bells jingle all the way";
		findDuplicateWords(str);

	}

}
