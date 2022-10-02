package com.auction.usecase;

import java.util.Scanner;

import com.aucion.bean.Admin;
import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoImpl;


public class LoginAdmin {

	
	public static void loginAdmin() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String name = sc.nextLine();
		
		System.out.println("Enter Password:");
		String pass = sc.nextLine();
		
		AdminDao adm=new AdminDaoImpl();
		
		
		try {
		
			
			Admin admin=adm.loginAdmin(name,pass);
		
	 		System.out.println("Welcome Admin :"+admin.getA_name());
	 		
	 		
	 		
	 		
	 	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}



}
