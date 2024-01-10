package com.asg5CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

//59. Create hashset of 10 Strings. Remove elements from hashset 
//    of string contains more than one occurances of letter ‘e’.

public class Q59RemoveElementsExample {

	public static void removeElements(HashSet<String> hs) {

		Iterator<String> itr = hs.iterator();

		while (itr.hasNext()) {
			String element = itr.next();

			if (countOccurances(element, 'a') > 1) {

				itr.remove();

			}
		}

	}

	public static int countOccurances(String str, char c) {

		int count = 0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch == c) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();

		hs.add("Apple");
		hs.add("Banana");
		hs.add("Orange");
		hs.add("Grapes");
		hs.add("Cherry");
		hs.add("Mango");
		hs.add("Pineapple");

		System.out.println("Original HashSet: " + hs);

		removeElements(hs);
		
		System.out.println("Modified HashSet: " + hs);

	}

}
