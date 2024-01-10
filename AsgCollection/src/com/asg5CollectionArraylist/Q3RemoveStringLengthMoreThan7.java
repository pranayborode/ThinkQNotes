package com.asg5CollectionArraylist;

import java.util.ArrayList;

//3. Create a arraylist of string. Add 7 days to list ( Monday , Sunday etc) 
//   Remove elements from list for which string length is more than 7 
public class Q3RemoveStringLengthMoreThan7 {

	public static void main(String[] args) {
		ArrayList<String> dayList = new ArrayList<>();

		dayList.add("Monday");
		dayList.add("Tuesday");
		dayList.add("Wednesday");
		dayList.add("Thursday");
		dayList.add("Fridya");
		dayList.add("Saturday");
		dayList.add("Sunday");

		System.out.println(dayList);
		
		ArrayList<String> newList = new ArrayList<>();
		
		for(int i =0; i<dayList.size();i++) {
			
			if(dayList.get(i).length()<7) {
				newList.add(dayList.get(i));
			}
		}
		
		System.out.println(newList);

	}

}
