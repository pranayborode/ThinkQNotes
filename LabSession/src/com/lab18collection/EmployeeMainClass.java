package com.lab18collection;

import java.util.ArrayList;
import java.util.Collections;



public class EmployeeMainClass {
	
	//Enter specific dep and show dep
	public static void findDepartmetn(ArrayList<Employee> empList, String dName) {
		
		
		System.out.println(dName);
		for(Employee e : empList) {
			if(e.getEdept().getDepName().endsWith(dName)) {
				System.out.println(e);
			}
		}
	}
	
	public static void findHigestSaleryOfEmp(ArrayList<Employee>empList) {
		
		double maxSalery =0;
		for(Employee e : empList) {
			
			if(e.geteSal()> maxSalery) {
				maxSalery = e.geteSal();
			}
		}
		System.out.println("MaxSalary: "+maxSalery);
		
	}
	
	// search name by given input char ch and also sort it by ascending ordet 
	// for which we use here SearchEmpNameByAscending
	public static void serchNameByChar(ArrayList<Employee>empList, char ch) {
		
		Collections.sort(empList, new SearchEmpNameByAscending());
		for(Employee e : empList) {
			
			if(e.geteName().toLowerCase().charAt(0)== ch) {
				
				System.out.println(e.geteName());
			}
		}
		
	}

	public static void main(String[] args) {

		Department dep1 = new Department(101, "IT", "Pune");
		Department dep2 = new Department(102, "HR", "Pune");
		Department dep3 = new Department(103, "Sales", "Pune");

		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee(6, "Pranay", 45000, dep1));
		empList.add(new Employee(1, "Ravi", 55000, dep3));
		empList.add(new Employee(5, "Swapnil", 45000, dep2));
		empList.add(new Employee(2, "Riya", 30000, dep1));
		empList.add(new Employee(4, "Raju", 42000, dep3));
		empList.add(new Employee(3, "Purva", 45000, dep2));
		empList.add(new Employee(8, "Amar", 60000, dep1));
		empList.add(new Employee(7, "Aditya", 44000, dep2));

		for (Employee e : empList) {
			System.out.println(e);
		}

		System.out.println("***********************************************************\n");

		Collections.sort(empList);
		
		for (Employee e : empList) {
			System.out.println(e);
		}
		
		System.out.println("***********************************************************\n");
		
	//	findDepartmetn(empList, "IT");
//		Collections.sort(empList, new EmployeeIdComparator());

		findHigestSaleryOfEmp(empList);
		
		System.out.println("***********************************************************\n");
		
		char ch = 'r';
		System.out.println("Search by char: "+ch);
		serchNameByChar(empList, ch);
		
	}

}
