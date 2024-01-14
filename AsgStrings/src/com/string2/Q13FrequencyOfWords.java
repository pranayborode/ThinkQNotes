package com.string2;

//13. Frequency of words
public class Q13FrequencyOfWords {

	public static void findFreqOfWords(String str) {

		int count;
		String st[] = str.split("\\s");
		int len = st.length;

		for (int i = 0; i < len; i++) {

			count = 1;
			if (st[i].equals("Visited")) {
				continue;
			}

			for (int j = i + 1; j < len; j++) {

				if (st[i].equalsIgnoreCase(st[j])) {
					count++;
					st[j] = "Visited";
				}
			}
			System.out.println(st[i] + "-->" + count);
		}

	}

	public static void main(String[] args) {

		String str = "Jingle bells jingle bells jingle all the way";
		findFreqOfWords(str);
	}

}
