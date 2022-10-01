package com.aucion.bean;

public class Buyer {

	private int b_id;
	private String b_name;
	private String b_email;
	private String password;
	
	public Buyer() {
		
	}

	
	public Buyer(int b_id, String b_name, String b_email, String password) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_email = b_email;
		this.password = password;
	}


	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_email() {
		return b_email;
	}

	public void setB_email(String b_email) {
		this.b_email = b_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Buyer [b_id=" + b_id + ", b_name=" + b_name + ", b_email=" + b_email + ", password=" + password + "]";
	}

	

	
	
	
}
