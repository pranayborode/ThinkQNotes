package com.assignment2;

public class DemoOnOperators2 {

	public static void main(String[] args) {

		int i, j, k, l = 0;
		k = l++;
		//   0
		
		j = ++k;
		//  1
		
		i = j++;
		//   1
		
		System.out.println(i); //1

		// i = 0
		// j = 0 / 2
		// k = 0 / 1
		// l = 0 / 1
		
	}

}
