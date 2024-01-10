package com.asg8MapHW;

import java.util.HashMap;
import java.util.Map.Entry;

//8.	WAP to create a map using Custom class as key and any other JDK provided object as value



public class Q8CustomClassKeyExample {

	public static void main(String[] args) {

		HashMap<Items, Integer> hm = new HashMap<>();
		
		hm.put(new Items(101, "Chocolate"), 25);
		hm.put(new Items(102, "Shugar"), 90);
		hm.put(new Items(103, "Rice"), 50);
		
	
		for(Entry<Items, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+" -- Price:  "+entry.getValue());
			
		}

	}

}
