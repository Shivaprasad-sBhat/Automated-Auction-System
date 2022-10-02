package com.auction.dao;

import java.util.List;

import com.aucion.bean.Products;
import com.aucion.bean.Seller;
import com.auction.exceptions.SellerException;

public interface SellerDao {



		public String regesterSeller(Seller seller);

		public Seller loginFunSeller(String email,String password) throws SellerException;
		
		public  String addProducts(Products product);
		
		public  String updatePrice(Products product);
		
		public String removeProduct(Products product);
		
	//	public List<Products> showSoldProd(Seller seller);

}
