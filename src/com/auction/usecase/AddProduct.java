package com.auction.usecase;


import java.util.*;

import com.aucion.bean.Products;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoImpl;


public class AddProduct {

	public static void addPorduct() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product name");
		String p_name=sc.nextLine();
		
		
		System.out.println("Enter Product price");
		int price=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter product category");
		String cat=sc.nextLine();
		
		
		//System.out.println("Enter selling end date yyyy-mm-dd");
		//String e_date=sc.nextLine();
		
	//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		//java.sql.Timestamp e_date=new java.sql.Timestamp(price);
		
			
		    
		    Products product=new Products();
		    
		    product.setP_name(p_name);
		    product.setPrice(price);
		    product.setCategory(cat);
		    product.setS_idFK(LoginSeller.sellerid);
//		    product.setEnd_date(date2);
		   
		   
		   SellerDao sd=new SellerDaoImpl();
		    
		    String res=sd.addProducts(product);
		    
		    System.out.println(res);
		
	

	}
	
	
	
	
}
