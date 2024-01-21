package com.serializabledemo;

import java.io.Serializable;

public class User implements Serializable {

	private int uid;
	private String name;
	private transient String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String name, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", password=" + password + "]";
	}

}

//public record User(int uid, String name, String password) implements Serializable{
//
//
//	};