package com.arraylist1additional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//6.	Let employee class have a department object. Iterate through aarraylist of employees.

//7.  Use copy method of collections class to make a copy of given arraylist of employees. 
//  Check if it creates shallow copy or deep copy. Check if department objects are also copied.

//9.	Sort arraylist of employees on employee names using comparable interface.
//10.	Sort arraylist of employees on department names using comparator interface

public class Employee implements Comparable<Employee>
{

	private int eId;
	private String eName;
	private double salary;
	private Department dep;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, double salary, Department dep) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.dep = dep;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", dep=" + dep + "]";
	}

	public int compareTo(Employee e) {

		return this.eName.compareTo(e.eName);

	}

	public static void main(String[] args) {

		Department dep1 = new Department(1, "IT");
		Department dep2 = new Department(2, "HR");
		Department dep3 = new Department(3, "Sales");

		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Ravi", 45000, dep3));
		empList.add(new Employee(102, "Pooja", 55000, dep1));
		empList.add(new Employee(103, "Amar", 30000, dep2));
		empList.add(new Employee(105, "Radha", 45000, dep1));
		empList.add(new Employee(104, "Sahil", 56000, dep2));
		empList.add(new Employee(106, "Umesh", 30000, dep2));

		Iterator<Employee> iterator = empList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("**************************************************************");

		ArrayList<Employee> copyList = new ArrayList<>(empList);

		Collections.copy(copyList, empList);
		
		for (Employee e : copyList) {
			System.out.println(e);
		}
		System.out.println("**********************Q9Ans**************************");
		
		Collections.sort(empList);
		
		for (Employee e : empList) {  
			System.out.println(e);
		}
		
		System.out.println("**********************Q10Ans**************************");
		Collections.sort(empList, new DepartmentComparator());
		
		for (Employee e : empList) {  
			System.out.println(e);
		}

	}

}
