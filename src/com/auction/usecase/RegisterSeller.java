package com.auction.usecase;

import java.util.Scanner;

import com.aucion.bean.Seller;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoImpl;

public class RegisterSeller {

	
	public static void regesterSeller() {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter seller Name");
		String s_name=sc.nextLine();
		
		System.out.println("Enter Email address");
		String email=sc.nextLine();
		
		System.out.println("Enter password");
		String password=sc.nextLine();
		
		
		
		
		Seller seller=new Seller();
		seller.setS_name(s_name);
		seller.setS_email(email);
		seller.setPassword(password);
		
		
		SellerDao sd=new SellerDaoImpl();
		
		String res=sd.regesterSeller(seller);
		
		System.out.println(res);
		}
	
	
	public static void main(String[] arg) {
		
		regesterSeller();
	}

	
}
