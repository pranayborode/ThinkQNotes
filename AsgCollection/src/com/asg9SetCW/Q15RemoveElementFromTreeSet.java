package com.asg9SetCW;

import java.util.TreeSet;

//15.	WAP to remove a given element from a TreeSet.

public class Q15RemoveElementFromTreeSet {
	
	static void removeElement(TreeSet<String> treeSet, String element) {
		
		if(treeSet.remove(element)) {
			System.out.println("Element "+element+" Removed...");
			System.out.println("TreeSet After Removal: "+treeSet);
		}else {
			System.out.println("Element "+element+" Not Foud...");
		}
		
	}

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Orange");
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Grapes");
		
		
		removeElement(treeSet, "Banana");

		removeElement(treeSet, "Kivi");
	}

}
