package com.arraylist1additional;

import java.util.ArrayList;


//12.	Iterate through arraylist using foreach.
public class Q12IterateArrayListForEach {

	public static void main(String[] args) {
		
		ArrayList<String> placeList = new ArrayList<>();
		
		placeList.add("Pune");
		placeList.add("Mumbai");
		placeList.add("Amravati");
		placeList.add("Delhi");
		placeList.add("Goa");
		
		
		
		for(String s : placeList) {
			System.out.println(s);
		}

	}

}
