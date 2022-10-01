package com.auction.usecase;

import java.util.Scanner;

import com.aucion.bean.Buyer;
import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoImpl;

public class RegisterBuyer {
	
	
public static void regesterBuyer() {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Buyer Name");
		String b_name=sc.nextLine();
		
		System.out.println("Enter Email address");
		String email=sc.nextLine();
		
		System.out.println("Enter password");
		String password=sc.nextLine();
		
		BuyerDao bd=new BuyerDaoImpl();
		
		
		
		Buyer buyer=new Buyer();
		buyer.setB_name(b_name);
		buyer.setB_email(email);
		buyer.setPassword(password);
		
		String result=  bd.regBuyer(buyer);
		
		System.out.println(result);
		
		}


	
	
	

}
