package com.collectiondemo;

public class Employees {

	private int eid;
	private String ename;
	private float salary;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int eid, String ename, float salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
}
