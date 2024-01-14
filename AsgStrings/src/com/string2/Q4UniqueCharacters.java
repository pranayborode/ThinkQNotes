package com.string2;

//4. Unique characters
public class Q4UniqueCharacters {

	public static void findUniqueChar(String str) {

		char ch[] = str.toCharArray();

		int count;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
				}
			}
			if (ch[i] != '0' && count == 1) {
				System.out.println(ch[i]);
			}

		}

	}

	public static void main(String[] args) {

		String str = "abbacdkjkl";
		findUniqueChar(str);

	}


}
