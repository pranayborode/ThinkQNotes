package com.asg7TreeMap;

import java.util.TreeMap;

//1.	WAP to create a Treemap which contains Integers

public class Q1TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		
		tm.put(1, 2005);
		tm.put(3, 2024);
		tm.put(2, 2015);
		
		System.out.println(tm);

	}

}
