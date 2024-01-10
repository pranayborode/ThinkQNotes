package com.asg5CollectionSet;


import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//57. How to sort hashset of 10 integers.
public class Q57SortHashSet {

	
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(87);
		hs.add(35);
		hs.add(46);
		hs.add(12);
		hs.add(86);
		hs.add(56);
		hs.add(77);
		hs.add(34);
		hs.add(26);
		hs.add(11);

		
		
		System.out.println("---------------------");
//		
//		List<Integer> list = new ArrayList<Integer>(hs);
//		Collections.sort(list);
//		
//		System.out.println(list);
		
		//-----------------------------------------------------------
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(hs);
		
		System.out.println(treeSet);
	}

}
