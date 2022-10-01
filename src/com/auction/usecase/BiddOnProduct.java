package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoImpl;

public class BiddOnProduct {

	public static void bidOnProduct() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product ID of Bid...");
		int pid=sc.nextInt();
		
		System.out.println("Enter Bidding Price");
		int bidPrice=sc.nextInt();
		
		
		BuyerDao bd=new BuyerDaoImpl();
		
		String res=bd.biddOnProd(pid, bidPrice);
		
	    System.out.println(res);
		
		
	}
	
}
