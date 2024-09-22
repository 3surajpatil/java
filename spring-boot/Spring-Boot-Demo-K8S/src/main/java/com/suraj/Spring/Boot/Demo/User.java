package com.suraj.Spring.Boot.Demo;

public class User {

	int id;
	String fname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public User(int id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
			
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + "]";
	}	
	
	
	
}
