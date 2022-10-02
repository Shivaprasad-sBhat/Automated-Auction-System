package com.auction.usecase;

import java.util.List;


import com.aucion.bean.Seller;
import com.auction.dao.AdminDaoImpl;

public class DispSeller {

	
public static void dispSeller() {
		
		
		List<Seller> seller=null;
		
		try {
			seller=new AdminDaoImpl().showSeller();
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		if(seller.size()>0) {
			
		
		System.out.println("|-------------------------------------------------|");
		System.out.println("| Seller ID |      Name      |      Email         |");
		System.out.println("|-------------------------------------------------|");
		seller.forEach(s ->{
			
			System.out.print("| "+ s.getS_id() +"              ");
			System.out.print(s.getS_name()+"         ");
			System.out.println(s.getS_email()+"    ");
		
			
		System.out.println("|-------------------------------------------------|");
		});
		
		System.out.println("");
		}
		
		else {
			System.out.println("No Seller exists...");
		}
	}
}
