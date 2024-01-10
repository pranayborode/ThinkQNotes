package com.arraylist1additional;

import java.util.ArrayList;

//13.	Does ArrayList allow Null values

public class Q13ArrayListNullValues {

	public static void main(String[] args) {

		ArrayList<String> placeList = new ArrayList<>();

		placeList.add("Pune");
		placeList.add("Mumbai");
		placeList.add(null);
		placeList.add("Amravati");
		
		for(String s : placeList) {
			System.out.println(s);
		}
		
	}

}
