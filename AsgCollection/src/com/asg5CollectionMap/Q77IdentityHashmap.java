package com.asg5CollectionMap;

import java.util.IdentityHashMap;

//77. Show one example of identity hashmap.

public class Q77IdentityHashmap {

	public static void main(String[] args) {

		IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();

		identityHashMap.put("A", 1);
		identityHashMap.put(new String("A"), 2);
		
		System.out.println(identityHashMap.size()); // 2
		System.out.println(identityHashMap.get("A")); // 1

	}

}
