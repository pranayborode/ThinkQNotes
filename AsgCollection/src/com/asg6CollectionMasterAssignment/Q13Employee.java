package com.asg6CollectionMasterAssignment;

import java.util.HashMap;
import java.util.Objects;

public class Q13Employee {

	private int id;
	private String name;
	private double salary;

	public Q13Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q13Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Q13Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q13Employee other = (Q13Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	public static void main(String[] args) {
		
		Q13Employee e1 = new Q13Employee (104 , "Sachin", 1011 );
		Q13Employee e2 = new Q13Employee (104 , "Sachin", 1011 );
		
		HashMap<Q13Employee, String> map = new HashMap();
		
		map.put(e1, "first");
		map.put(e2, "second");
		
		System.out.println(map);
		
	}

}
