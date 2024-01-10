package com.asg5CollectionArraylist;

import java.util.Arrays;

//13. Create an array which contains heterogeneous elements.

public class Q13HeterogeneousArrayExample  {

	public static void main(String[] args) {

		Object[] hetroArray = new Object[5];

		hetroArray[0] = "Good";
		hetroArray[1] = true;
		hetroArray[2] = 99;
		hetroArray[3] = 3.5f;
		hetroArray[4] = new int[] { 1, 2, 3 };
		;

		for (Object o : hetroArray) {
			System.out.println(o);
		}

	}

}
