package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Collections;

//14. Sort arraylist of employees on department names using comparator interface.

class Department {

	private int dId;
	private String dName;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}

}

public class Q14Employee {

	private int id;
	private String name;
	private Department dep;

	public Q14Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q14Employee(int id, String name, Department dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
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

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Q14Employee [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}

	public static void main(String[] args) {

		ArrayList<Q14Employee> stringList = new ArrayList<>();

		stringList.add(new Q14Employee(2, "Ron", new Department(2, "Sales")));
		stringList.add(new Q14Employee(1, "Priya", new Department(3, "HR")));
		stringList.add(new Q14Employee(4, "Rohit", new Department(1, "IT")));
		stringList.add(new Q14Employee(3, "Amit", new Department(3, "HR")));
		stringList.add(new Q14Employee(5, "Shital", new Department(1, "IT")));

		System.out.println("ArrayList before sorting: ");
		for (Q14Employee e : stringList) {
			System.out.println(e);
		}

		Collections.sort(stringList, new DepartmentComparator());

		System.out.println("ArrayList after sorting: ");
		for (Q14Employee e : stringList) {
			System.out.println(e);
		}

	}

}
