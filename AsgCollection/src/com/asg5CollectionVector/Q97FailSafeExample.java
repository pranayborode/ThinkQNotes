package com.asg5CollectionVector;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//97. Show in example that enumerator is fail safe
public class Q97FailSafeExample {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 2, 8, 10, 12 });
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.println(i);
			if (i == 8)
				list.add(16);
		}
	}

}
