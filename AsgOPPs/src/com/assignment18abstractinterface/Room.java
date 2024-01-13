package com.assignment18abstractinterface;

class Closet {
	void open() {
		System.out.println("Closet opened.");
	}
}

public class Room extends Closet{
	
	void accessCloset() {
		open();
	}

	public static void main(String[] args) {
		
		Room r = new Room();
		r.accessCloset();

	}

}
