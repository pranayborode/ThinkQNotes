package com.string2;

//3. Duplicate characters(Print and count) 
public class Q3DuplicateCharacters {

	public static void findDuplicateChar(String str) {

		char ch[] = str.toCharArray();

		int count;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[j] == ' ') {
					continue;
				}

				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
				}
			}
			if (ch[i] != '0' && count > 1) {
				System.out.println(ch[i] + " --> " + count);
			}

		}

	}

	public static void main(String[] args) {

		String str = "Good Morning";
		findDuplicateChar(str);

	}

}
