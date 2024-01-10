package com.asg6CollectionMasterAssignment;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(this.getEmpId()==e.getEmpId()) {
			return 0;
		}else if (this.getEmpId()>e.getEmpId()) {
			return 1;
		}
		return -1;
	}

}
