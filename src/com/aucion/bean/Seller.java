package com.aucion.bean;

public class Seller {


	
	private int s_id;
	private String s_name;
	private String s_email;
	private String password;
	
	
	public Seller() {
		
	}
 

	public Seller(int s_id, String s_name, String s_email, String password) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_email = s_email;
		this.password = password;
	}


	public int getS_id() {
		return s_id;
	}


	public void setS_id(int s_id) {
		this.s_id = s_id;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public String getS_email() {
		return s_email;
	}


	public void setS_email(String s_email) {
		this.s_email = s_email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Seller [s_id=" + s_id + ", s_name=" + s_name + ", s_email=" + s_email + ", password=" + password + "]";
	}
	
	

	
}
