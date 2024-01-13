package com.asg14containment;

public class Department {

	private int did;
	private String dname;

	public Department() {

	}

	public Department(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	
	public String toString() {
		return "Department [id=" + did + ", name=" + dname + "]";
	}
	
	

}
