package com.lambda2;

import java.util.ArrayList;

public class CollectionLambda {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Reetu");
		names.add("Prachi");
		names.add("Vikas");
		names.add("Nisha");
		
		names.forEach(n->System.out.println(n+" : "+n.length()));
		
		System.out.println("-----------------------------------------");
		
		names.forEach(n->System.out.println(n.toUpperCase()));
	}

}
