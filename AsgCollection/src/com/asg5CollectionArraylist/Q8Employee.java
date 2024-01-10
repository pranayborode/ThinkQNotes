package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.ListIterator;

//8. Let employee class has a department object. Iterate through a 
//   arraylist of employees. Show all details including department name.

class Departmetn {

	private int dId;
	private String dName;

	public Departmetn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departmetn(int dId, String dName) {
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
		return "Departmetn [dId=" + dId + ", dName=" + dName + "]";
	}

}

public class Q8Employee {

	private int eid;
	private String eName;
	private Departmetn dep;

	public Q8Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q8Employee(int eid, String eName, Departmetn dep) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.dep = dep;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Departmetn getDep() {
		return dep;
	}

	public void setDep(Departmetn dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Q8Employee [eid=" + eid + ", eName=" + eName + ", dep=" + dep + "]";
	}

	
	
	public static void main(String[] args) {

		ArrayList<Q8Employee> empList = new ArrayList<>();
		
		empList.add(new Q8Employee(101, "Pravin", new Departmetn(1, "IT")));
		empList.add(new Q8Employee(102, "Swati", new Departmetn(2, "HR")));
		empList.add(new Q8Employee(103, "Amit", new Departmetn(3, "Sales")));
		
		
		ListIterator<Q8Employee> litr = empList.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
	}

}
