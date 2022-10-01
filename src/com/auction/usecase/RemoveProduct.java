package com.auction.usecase;

import java.util.Scanner;

import com.aucion.bean.Products;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoImpl;

public class RemoveProduct {

	public static void romoveProduct() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of product to be removed ");
		String name=sc.nextLine();
		
		Products prod=new Products();
		
		prod.setP_name(name);
		prod.setS_idFK(LoginSeller.sellerid);
		
		
		SellerDao sd=new SellerDaoImpl();
		
		String res=sd.removeProduct(prod);
		
		System.out.println(res);
	}
	
	
	
}
