package com.auction.usecase;

import java.util.List;

import com.aucion.bean.Buyer;
import com.auction.dao.AdminDaoImpl;

public class DispBuyer {

	public static void dispBuyer() {
		
		
		List<Buyer> buyer=null;
		
		try {
			buyer=new AdminDaoImpl().showBuyer();
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		if(buyer.size()>0) {
			
		
		System.out.println("|-------------------------------------------------|");
		System.out.println("| Buyer ID |      Name      |      Email          |");
		System.out.println("|-------------------------------------------------|");
		buyer.forEach(b ->{
			
			System.out.print("| "+ b.getB_id() +"              ");
			System.out.print(b.getB_name()+"         ");
			System.out.println(b.getB_email()+"    ");
		
			
		System.out.println("|-------------------------------------------------|");
		});
		
		System.out.println("");
		}
		
		else {
			System.out.println("No buyer exists...");
		}
	}
	
}
