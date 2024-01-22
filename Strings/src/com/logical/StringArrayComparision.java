package com.logical;

public class StringArrayComparision {

	public static void uniqueString(String s1[], String s2[]) {

		boolean found;
		for (String s : s2) {
			found = false;
			for (String st : s1) {

				if (s.equals(st)) {
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println(s);
			}
		}

	}

	public static void main(String[] args) {

		String str1[] = { "Jyoti", "Reetu", "Prachi", "Pranay" };
		String str2[] = { "Nisha", "Reetu", "Prachi", "Pooja", "Vikas" };
		uniqueString(str1, str2);

	}

}
