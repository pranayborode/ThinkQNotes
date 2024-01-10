package com.asg5CollectionSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//60. How to get synchronized set.

public class Q60SynchronizedSet {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();

		hs.add("Java");
		hs.add("Python");
		hs.add("C++");
		hs.add("JSP");

		Set<String> synchronizedSet = Collections.synchronizedSet(hs);

		synchronized (synchronizedSet) {
			Iterator<String> itr = synchronizedSet.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

}
