package com.assignment22arrayofobject;

class Department4 {

	private int did;
	private String dname;

	public Department4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department4(int did, String dname) {
		super();
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

	@Override
	public String toString() {
		return "Department : did=" + did + ", dname=" + dname;
	}

}

class Employee4 {

	private int eid;
	private String name;
	private Department4 department;

	public Employee4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee4(int eid, String name, Department4 department) {
		super();
		this.eid = eid;
		this.name = name;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department4 getDepartment() {
		return department;
	}

	public void setDepartment(Department4 department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee : eid=" + eid + ", name=" + name + ", " + department;
	}

}

public class Q7EmployeeDepartment {

	public static void main(String[] args) {

		Department4 dep[] = new Department4[3];
		dep[0] = new Department4(1, "IT");
		dep[1] = new Department4(2, "Sales");
		dep[2] = new Department4(3, "HR");

		Employee4 emp[] = new Employee4[3];

		emp[0] = new Employee4(101, "Sahil", dep[0]);
		emp[1] = new Employee4(102, "Riya", dep[1]);
		emp[2] = new Employee4(103, "Anup", dep[2]);

		for (Employee4 e : emp) {
			System.out.println(e);
		}

	}

}
