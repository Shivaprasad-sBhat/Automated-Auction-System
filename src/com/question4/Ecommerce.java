package com.question4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce extends Product {

	List<Product> productList=new ArrayList<>();
	
public  void addProduct(Product product) {

	int k=1;
	int k1=1;
	boolean flag=true;
	for(int i=0;i<productList.size();i++) {
		 k=productList.get(i).name.compareTo(product.name);
		 k1=productList.get(i).company.compareTo(product.company);
		 if((k+k1)==0) {
			 System.out.println("Count updated Product already exists");
			 productList.get(i).count=productList.get(i).count+product.count;
			 flag=false;
			 break;
			}
	}
	
	if(flag==true) {
		
		System.out.println("Product added successfully");
		productList.add(product);
	}
	
}
	
public List<Product> showAllProduct()
{
	return productList;
}
}
