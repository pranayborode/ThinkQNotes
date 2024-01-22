package com.enumdemo;

public enum MovieSeates {

	STANDARD(300), PREMIUM(450), RECLINER(600);

	int price;

	private MovieSeates(int price) {
		this.price = price;
	}
}
