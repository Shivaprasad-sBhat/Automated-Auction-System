package com.auction.dao;

import java.util.List;

import com.aucion.bean.Admin;
import com.aucion.bean.Buyer;
import com.aucion.bean.Seller;
import com.auction.exceptions.AdminException;

public interface AdminDao {
	
	
	public String regesterAdmin(Admin admin);
	
	public Admin loginAdmin(String email,String password) throws AdminException;
	
	public  List<Buyer> showBuyer();
	
	public  List<Seller> showSeller();
	
}
