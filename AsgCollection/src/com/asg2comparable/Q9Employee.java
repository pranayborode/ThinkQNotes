package com.asg2comparable;

import java.util.ArrayList;
import java.util.Collections;

//Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis.

class Profile {

	private String state;
	private String country;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Profile [state=" + state + ", country=" + country + "]";
	}

}

public class Q9Employee implements Comparable<Q9Employee> {
	private int id;
	private String name;
	private String designation;
	private int age;
	private Profile profile;

	public Q9Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q9Employee(int id, String name, String designation, int age, Profile profile) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.profile = profile;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	
	@Override
	public String toString() {
		return "Q9Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age
				+ ", profile=" + profile + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q9Employee> empList = new ArrayList<>();
		
		
		empList.add(new Q9Employee(102, "Raju", "Manager", 38,new Profile("MH", "India")));
		empList.add(new Q9Employee(101, "Purva", "HR", 29, new Profile("CA", "USA")));
		empList.add(new Q9Employee(103, "Amit", "TeamLead", 31, new Profile("Parice", "France")));

		for (Q9Employee e : empList) {
			System.out.println(e);
		}

		Collections.sort(empList);
		System.out.println("______________After sorting______________");
		for (Q9Employee e : empList) {
			System.out.println(e);
		}

	}

	@Override
	public int compareTo(Q9Employee e) {
		if (this.getProfile().getCountry() == e.getProfile().getCountry()) {
			return 0;
		} else if (this.getProfile().getCountry().compareTo( e.getProfile().getCountry())>0) {
			return 1;
		}
		return -1;
	}

}
