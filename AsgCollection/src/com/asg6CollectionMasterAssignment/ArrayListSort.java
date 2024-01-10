package com.asg6CollectionMasterAssignment;

import java.util.ArrayList;
import java.util.Collections;

//1 Write the necessary code to sort employee objects by empId.
//2 Complete following code to sort above employee object by name. Employee object is from same earlier program
public class ArrayListSort {

	public static void main(String[] args) {

		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4, "Suman");
		Employee e3 = new Employee(2, "Radhika");
		Employee e4 = new Employee(1, "Sameer");
		alEmp.add(e1);
		alEmp.add(e2);
		alEmp.add(e3);
		alEmp.add(e4);

		for (Employee e : alEmp) {
			System.out.println(e);
		}
		System.out.println("______________________________________");

		Collections.sort(alEmp);

		for (Employee e : alEmp) {
			System.out.println(e);
		}
		
		System.out.println("______________________________________");

		Collections.sort(alEmp, new EmpNameComparator());

		for (Employee e : alEmp) {
			System.out.println(e);
		}

	}

}
