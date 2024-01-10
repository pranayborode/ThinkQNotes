package com.arraylist1additional;

import java.util.ArrayList;
import java.util.Collections;

//8.	Sort arraylist of Strings.
public class Q8SortArrayListStrings {

	public static void sortArrayList(ArrayList<String> strList) {

		for (int i = 0; i < strList.size(); i++) {
			for (int j = i + 1; j < strList.size(); j++) {
				if (strList.get(i).compareTo(strList.get(j)) > 0) {

					String temp = strList.get(i);
					strList.set(i, strList.get(j));
					strList.set(j, temp);
				}
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<>();

		strList.add("Apple");
		strList.add("Banana");
		strList.add("Orange");
		strList.add("Pineapple");
		strList.add("Grapes");

		System.out.println(strList);
		//Collections.sort(strList);
		sortArrayList(strList);
		
		System.out.println(strList);

	}

}
