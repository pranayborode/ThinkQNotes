package com.asg8MapCW;

import java.util.HashMap;
import java.util.Map;

//3.	WAP to add elements to a HashMap using generics with Integer as Key and String as value. And 4 key-value Map.Entry
public class Q3HashMapGenerics {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");
		
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			
			System.out.println(e.getKey()+" ==> "+e.getValue());
		}

	}

}
