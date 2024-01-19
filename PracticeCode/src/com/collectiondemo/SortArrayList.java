package com.collectiondemo;

import java.util.ArrayList;

public class SortArrayList {

	static void sortArrayList(ArrayList<Integer>al) {
		
		for(int i=0; i<al.size();i++) {
			
			for(int j =i+1; j<al.size(); j++) {
				
				int temp = al.get(i);
				al.set(i, al.get(j));
				al.set(j, temp);
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer>al = new ArrayList<>();
		al.add(36);
		al.add(78);
		al.add(18);
		al.add(82);
		al.add(77);
		al.add(11);
		al.add(77);
		
		System.out.println("Befor: "+al);
		
		sortArrayList(al);
		System.out.println("After: "+al);

	}

}
