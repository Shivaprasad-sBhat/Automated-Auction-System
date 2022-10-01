package com.auction.usecase;

import java.util.Scanner;

import com.aucion.bean.Products;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoImpl;

public class UpdatePrice {

	
	public static void updatePrice() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter item name");
		String name=sc.nextLine();
		
		System.out.println("Enter new price");
		int pr=sc.nextInt();
		
		Products prod=new Products();
		
		prod.setP_name(name);
		prod.setPrice(pr);
		prod.setS_idFK(LoginSeller.sellerid);
		
		
		SellerDao sd=new SellerDaoImpl();
		
		String res=sd.updatePrice(prod);
		
		System.out.println(res);
	}
	
	
}
