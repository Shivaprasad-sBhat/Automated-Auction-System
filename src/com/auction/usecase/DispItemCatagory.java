package com.auction.usecase;


import java.util.List;

import com.aucion.bean.Products;
import com.auction.dao.BuyerDaoImpl;
import com.auction.exceptions.ProductException;

public class DispItemCatagory {

	public static void dispItemCatagory()  {
		
		
		List<Products> products =null;
		try {
			products = new BuyerDaoImpl().showItemList();
		} catch (ProductException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("|----------------------------------------------|");
		System.out.println("| Product ID |   Item    |  Price  | Category  |");
		System.out.println("|----------------------------------------------|");
		products.forEach(s ->{
			
			System.out.print("| "+s.getP_id()+"          ");
			System.out.print(s.getP_name()+"      ");
			System.out.print(s.getPrice()+"    ");
			System.out.println(s.getCategory());
			
			
		System.out.println("|----------------------------------------------|");
		});
		
		System.out.println("");
		
	}
	
	
	
public static void dispItemPrice()  {
		
		
		List<Products> products=null;
		try {
			products = new BuyerDaoImpl().showItemPrice();
		} catch (ProductException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("|----------------------------------------------|");
		System.out.println("| Product ID |   Item    |  Price  | Category  |");
		System.out.println("|----------------------------------------------|");
		products.forEach(s ->{
			
			System.out.print("| "+s.getP_id()+"          ");
			System.out.print(s.getP_name()+"      ");
			System.out.print(s.getPrice()+"    ");
			System.out.println(s.getCategory());
			
			
		System.out.println("|----------------------------------------------|");
		});
		
	}
	
}
