package com.asg8MapHW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

//11.	WAP to iterate the elements in the arraylist stored in the above Map.

public class Q11ArrayListIterate {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();

		al1.add("PHY");
		al1.add("CHM");
		al1.add("MTH");

		ArrayList<String> al2 = new ArrayList<>();

		al2.add("PHY");
		al2.add("ETC");
		al2.add("CS");

		HashMap<String, ArrayList<String>> hm = new HashMap<>();

		hm.put("Student1", al1);
		hm.put("Student2", al2);

		for (Entry<String, ArrayList<String>> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " -- :" + entry.getValue());

		}

	}

}
