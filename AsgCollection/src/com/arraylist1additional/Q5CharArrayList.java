package com.arraylist1additional;

import java.util.ArrayList;
import java.util.Arrays;

//5. Create arraylist of characters. Remove duplicate characters from the list.
//   E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}
public class Q5CharArrayList {

	public static void removeDuplicates(ArrayList<Character> charList) {
		ArrayList<Character> result = new ArrayList<>();

		for (int i = 0; i < charList.size(); i++) {
			int count = 1;
			boolean status = false;

			for (int j = i - 1; j >= 0; j--) {
				if (charList.get(i) == charList.get(j)) {
					status = true;
					break;
				}
			}

			if (!status) {
				for (int k = i + 1; k < charList.size(); k++) {
					if (charList.get(i).equals(charList.get(k))) {
						count++;
					}
				}

				if (count > 1) {
					result.add(charList.get(i));
				}
			}
		}

		charList.clear();
		charList.addAll(result);
	}


	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>(Arrays.asList('d', 'g', 'h', 'd', 'd', 'h', 'g'));

		System.out.println("Original List: " + list);

		removeDuplicates(list);

		System.out.println(list);


	}

}
