package com.auction.dao;

import java.util.List;

import com.aucion.bean.Bidding;
import com.aucion.bean.Buyer;
import com.aucion.bean.Products;
import com.auction.exceptions.BuyerException;
import com.auction.exceptions.ProductException;

public interface BuyerDao {
	
	
	public String regBuyer(Buyer buyer);
	
	public Buyer loginBuyer(String email, String password) throws BuyerException;
	
	public List<Products> showItemList() throws ProductException;
	
	public List<Products> showItemPrice() throws ProductException;
	
	public String  biddOnProd(int prod_id,int bid_price) ;
	
}
