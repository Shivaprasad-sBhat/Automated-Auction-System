package com.auction.usecase;


import java.util.List;
import java.util.Scanner;

import com.aucion.bean.Buyer;
import com.aucion.bean.Products;
import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoImpl;
import com.auction.exceptions.BuyerException;
import com.auction.exceptions.ProductException;


public class LoginBuyer {

	
public static int  buyerid;
	
	
	public static void loginBuyer() throws ProductException {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Email address:");
		String uname = sc.nextLine();
		
		System.out.println("Enter Password:");
		String pass = sc.nextLine();
		
		BuyerDao bd=new BuyerDaoImpl();
		
		Buyer buyer=null;
	
			try {
				buyer = bd.loginBuyer(uname, pass);
				
			} catch (BuyerException e) {
				System.out.println(e.getMessage());
			}
		
	 		System.out.println("Welcome Buyer :"+buyer.getB_name());
	 		buyerid=buyer.getB_id();
	 		
	 		
	 	
		}
	
	
	public static void main(String[] args) throws ProductException {
		loginBuyer();
		new DispItemCatagory().dispItemCatagory();
		new DispItemCatagory().dispItemPrice();
		new BiddOnProduct().bidOnProduct();
		
	}
		

}
