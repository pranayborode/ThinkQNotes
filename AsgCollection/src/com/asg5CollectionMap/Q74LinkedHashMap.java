package com.asg5CollectionMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

//Create linkedhashmap<String, int> Take 5 values from user.

public class Q74LinkedHashMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(5);

		for (int i = 1; i <= 5; i++) {

			System.out.println("Enter a Key (String): ");
			String key = sc.next();

			System.out.println("Enter a Value (Integer): ");
			int value = sc.nextInt();

			lhm.put(key, value);

		}

		for (Map.Entry<String, Integer> entry : lhm.entrySet()) {

			System.out.println(entry.getKey() + " ==> " + entry.getValue());

		}

//		linkedHashMap.put("Apple", 120);
//		linkedHashMap.put("Mango", 90);
//		linkedHashMap.put("Orange", 60);
//		linkedHashMap.put("Banana", 40);
//		linkedHashMap.put("Pineapple", 40);

	}

}
