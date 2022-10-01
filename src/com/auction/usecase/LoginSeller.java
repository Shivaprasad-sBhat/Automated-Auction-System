package com.auction.usecase;


import java.util.Scanner;

import com.aucion.bean.Seller;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoImpl;
import com.auction.exceptions.SellerException;



public class LoginSeller {

	  static int  sellerid;
	
	
	public static void loginSeller() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.nextLine();
		
		System.out.println("Enter Password:");
		String pass = sc.nextLine();
		
		SellerDao dao = new SellerDaoImpl();
		
		try {
			Seller seller= dao.loginFunSeller(uname, pass);
		
	 		System.out.println("Welcome Seller :"+seller.getS_name());
	 		sellerid=seller.getS_id();
	 		
	 		
	 		
	 	
		}catch (SellerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
