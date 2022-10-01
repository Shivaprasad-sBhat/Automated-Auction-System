package com.aucion.bean;

import java.sql.Date;


public class Products {



	private int p_id;
	private String p_name;
	private int price;
	private String category;
	private java.util.Date s_date;
	private java.util.Date e_date;
	private int s_idFK;

	
	
	
	
	
	public Products(int p_id, String p_name, int price, String category, java.util.Date s_date, java.util.Date e_date,
			int s_idFK) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.price = price;
		this.category = category;
		this.s_date = s_date;
		this.e_date = e_date;
		this.s_idFK = s_idFK;
	}

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public java.util.Date getS_date() {
		return s_date;
	}

	public void setS_date(java.util.Date s_date) {
		this.s_date = s_date;
	}

	public java.util.Date getE_date() {
		return e_date;
	}

	public void setE_date(java.util.Date e_date) {
		this.e_date = e_date;
	}

	public int getS_idFK() {
		return s_idFK;
	}

	public void setS_idFK(int s_idFK) {
		this.s_idFK = s_idFK;
	}

	
	
	
	
	
}
