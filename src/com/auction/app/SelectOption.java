package com.auction.app;

import java.util.Scanner;

import com.aucion.bean.Admin;
import com.aucion.bean.Buyer;
import com.aucion.bean.Seller;
import com.auction.exceptions.ProductException;
import com.auction.usecase.AddProduct;
import com.auction.usecase.BiddOnProduct;
import com.auction.usecase.DispBuyer;
import com.auction.usecase.DispItemCatagory;
import com.auction.usecase.DispItemPrice;
import com.auction.usecase.DispSeller;
import com.auction.usecase.LoginAdmin;
import com.auction.usecase.LoginBuyer;
import com.auction.usecase.LoginSeller;
import com.auction.usecase.RegisterAdmin;
import com.auction.usecase.RegisterBuyer;
import com.auction.usecase.RegisterSeller;
import com.auction.usecase.RemoveProduct;
import com.auction.usecase.UpdatePrice;

public class SelectOption {

	
	Admin admin;
	Seller seller;
	Buyer buyer;
	public static Scanner sc=new Scanner(System.in);
	
	public static void selectionchoice() {
		System.out.println("Select the User"+"\n"+"1.Admin"+"\n"+"2.Seller"+"\n"+"3.Buyer"+"\n"+"4.Exit");
	
		SelectOption so=new SelectOption();
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
		
		so.selectAdmin();
			break;
		case 2:
			
			so.selectSeller();
			break;
		case 3:
			
			so.selectBuyer();
			break;
		case 4:
			System.out.println("Thank you");
			sc.close();
			break;
		}
	}
	
		public void selectAdmin() {
		
		System.out.println("Select the option"+"\n"+"1.Register Admin"+"\n"+"2.Admin Login"
							+"\n"+"3.Exit");
	
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			new RegisterAdmin().regesterAdmin();
			selectAdmin();
			break;
			
		case 2:
			new LoginAdmin().loginAdmin();
			adminChoises();
			break;
			
		case 3:
			selectionchoice();
			break;
			
		default:selectionchoice();
			
		}
	}
		
		public void adminChoises() {
			System.out.println("Select the option"+"\n"+"1.Show Sellers"+"\n"+"2.Show Buyers"+"\n"+"3.Exit");

			int n=sc.nextInt();
			switch(n) {
			
			case 1:
				new DispSeller().dispSeller();
				adminChoises();
				break;
				
			case 2:
				new DispBuyer().dispBuyer();
				adminChoises();
				break;
				
			case 3:selectionchoice();
			default:selectAdmin();;	
			}	
		}


		public void selectSeller() {
			System.out.println("Select the option"+"\n"+"1.Register Seller"+"\n"+"2.Seller Login"
					+"\n"+"3.Exit");

				int n=sc.nextInt();

					switch(n) {
	
						case 1:
							new RegisterSeller().regesterSeller();
							selectSeller();
							break;
	
						case 2:
							new LoginSeller().loginSeller();
							sellerOptions();
							break;
						case 3:
							selectionchoice();
							break;
	
						default:selectionchoice();
	
					}
			
		}
		
		
		public void sellerOptions() {
			System.out.println("Select the option"+"\n"+"1.Sell Product"+"\n"+"2.Update Price"
								+"\n"+"3.Remove Product"+"\n"+"4.Exit");

			int n=sc.nextInt();
			switch(n) {
			
			case 1:
				new AddProduct().addPorduct();
				sellerOptions();
				break;
				
			case 2:
				new UpdatePrice().updatePrice();
				sellerOptions();
				break;
				
			case 3:
				new RemoveProduct().romoveProduct();
				sellerOptions();
				break;
			case 4:
				selectionchoice();
				break;

			default:selectSeller();	
			}	
			
		}
		
		
		
		public void selectBuyer() {
			System.out.println("Select the option"+"\n"+"1.Register Buyer"+"\n"+"2.Buyer Login"
					+"\n"+"3.Exit");

				int n=sc.nextInt();

					switch(n) {
	
						case 1:
							new RegisterBuyer().regesterBuyer();
							selectBuyer();
							break;
	
						case 2:
						try {
								new LoginBuyer().loginBuyer();
								buyerOption();
								} catch (ProductException e) {
									System.out.println("Wrong username or password");
									selectBuyer();
								
								}
							
							break;
						case 3:
							selectionchoice();
							break;
	
						default:selectionchoice();
	
					}
			
		}
		
		
		public void buyerOption() {
			System.out.println("Select the option"+"\n"+"1.Show Products by Category"+"\n"+"2.Show Products by Price"
					+"\n"+"3.Bidd on Product"+"\n"+"4.Exit");

			int n=sc.nextInt();
			switch(n) {

			case 1:
				new DispItemCatagory().dispItemCatagory();
				buyerOption();
				break;
	
			case 2:
				new DispItemPrice().dispItemPrice();
				buyerOption();
				break;
	
			case 3:
				new BiddOnProduct().bidOnProduct();
				buyerOption();
				break;
				
			case 4:
				
				selectionchoice();
				break;

			default:selectBuyer();	
			}	
			
		}
		
}
