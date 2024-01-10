package com.asg9SetAdditional;

import java.util.TreeSet;

public class Train implements Comparable<Train> {

	private int id;
	private String name;
	private int totalSeats;

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int id, String name, int totalSeats) {
		super();
		this.id = id;
		this.name = name;
		this.totalSeats = totalSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "TrainExample [id=" + id + ", name=" + name + ", totalSeats=" + totalSeats + "]";
	}

	public static void main(String[] args) {

		TreeSet<Train> trainSet = new TreeSet<>();

		trainSet.add(new Train(1, "Express", 300));
		trainSet.add(new Train(2, "Local", 200));
		trainSet.add(new Train(3, "Superfast", 400));

		for (Train train : trainSet) {
			System.out.println(train);
		}
	}

	@Override
	public int compareTo(Train o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.totalSeats, o.totalSeats);
	}

}
