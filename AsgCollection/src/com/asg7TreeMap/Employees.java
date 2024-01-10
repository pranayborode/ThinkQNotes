package com.asg7TreeMap;

public class Employees implements Comparable<Employees> {

	private int eId;
	private String eName;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employees [eId=" + eId + ", eName=" + eName + "]";
	}

	@Override
	public int compareTo(Employees o) {

		return o.eId - this.eId;
	}

}
