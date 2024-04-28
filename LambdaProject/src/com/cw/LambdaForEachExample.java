package com.cw;

import java.util.ArrayList;

public class LambdaForEachExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1993);
		list.add(2023);
		list.add(1998);
		
		list.forEach(l->System.out.println(l));
		
	}

}
