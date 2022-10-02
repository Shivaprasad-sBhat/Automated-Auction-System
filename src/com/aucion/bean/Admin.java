package com.aucion.bean;

public class Admin {
	private int a_id;
	private String a_name;
	private String a_email;
	private String password;
	
	
	public Admin() {
		
	}


	public Admin(int a_id, String a_name, String a_email, String password) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_email = a_email;
		this.password = password;
	}


	public int getA_id() {
		return a_id;
	}


	public void setA_id(int a_id) {
		this.a_id = a_id;
	}


	public String getA_name() {
		return a_name;
	}


	public void setA_name(String a_name) {
		this.a_name = a_name;
	}


	public String getA_email() {
		return a_email;
	}


	public void setA_email(String a_email) {
		this.a_email = a_email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
