package com.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class FastFailIterator {

	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<>();
		
		al.add(36);
		al.add(78);
		al.add(18);
		al.add(82);
		
		Iterator<Integer>itr = al.iterator();
		while(itr.hasNext()) {
			itr.next().equals(36); //java.util.ConcurrentModificationException
			al.add(44);
		}

	}

}
