package com.asg8MapHW;

public class Items {

	private int id;
	private String name;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + "]";
	}

}
