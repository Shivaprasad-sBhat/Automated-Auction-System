package com.aucion.bean;

public class Bidding {

	
	private int bidd_id;
	private int prod_id;
	private int bidd_price;
	private int buyer_id;
	private int seller_id;
	
	public Bidding() {
		// TODO Auto-generated constructor stub
	}

	public Bidding(int bidd_id, int prod_id, int bidd_price, int buyer_id, int seller_id) {
		super();
		this.bidd_id = bidd_id;
		this.prod_id = prod_id;
		this.bidd_price = bidd_price;
		this.buyer_id = buyer_id;
		this.seller_id = seller_id;
	}

	public int getBidd_id() {
		return bidd_id;
	}

	public void setBidd_id(int bidd_id) {
		this.bidd_id = bidd_id;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public int getBidd_price() {
		return bidd_price;
	}

	public void setBidd_price(int bidd_price) {
		this.bidd_price = bidd_price;
	}

	public int getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}

	public int getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}

	@Override
	public String toString() {
		return "Bidding [bidd_id=" + bidd_id + ", prod_id=" + prod_id + ", bidd_price=" + bidd_price + ", buyer_id="
				+ buyer_id + ", seller_id=" + seller_id + "]";
	}
	
	
	
}
