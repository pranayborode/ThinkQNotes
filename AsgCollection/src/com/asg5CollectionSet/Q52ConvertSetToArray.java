package com.asg5CollectionSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//52. Convert set to array.
public class Q52ConvertSetToArray {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		
		String arr[] = new String[set.size()];
		
		set.toArray(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
