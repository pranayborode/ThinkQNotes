package com.asg8MapHW;

import java.util.HashMap;
import java.util.Map.Entry;

public class Q9CustomClassValue {

	public static void main(String[] args) {
		

		HashMap<Integer, Items> hm = new HashMap<>();
		
		hm.put(71, new Items(101, "Shugar"));
		hm.put(40, new Items(102, "Tea"));
		hm.put(50, new Items(103, "Rice"));
		
		for(Entry<Integer, Items> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+" -- :"+entry.getValue());
			
		}

		
	}

}
