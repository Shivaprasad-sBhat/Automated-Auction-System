package com.auction.usecase;

import java.util.Scanner;

import com.aucion.bean.Admin;
import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoImpl;


public class RegisterAdmin {

	
public static void regesterAdmin() {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Admin Name");
		String a_name=sc.nextLine();
		
		System.out.println("Enter Email address");
		String email=sc.nextLine();
		
		System.out.println("Enter password");
		String password=sc.nextLine();
		
		AdminDao admn=new AdminDaoImpl();
		
		
		Admin ad=new Admin();
		
		ad.setA_name(a_name);
		ad.setA_email(email);
		ad.setPassword(password);
		
		String result= admn.regesterAdmin(ad);
		
		System.out.println(result);
		
		}

}
