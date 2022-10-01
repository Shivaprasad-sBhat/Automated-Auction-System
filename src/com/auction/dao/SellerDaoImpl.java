package com.auction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aucion.bean.Products;
import com.aucion.bean.Seller;
import com.auction.exceptions.SellerException;
import com.auction.utility.DBUtil;
import com.mysql.cj.protocol.Resultset;


public class SellerDaoImpl implements SellerDao{

	@Override
	public String regesterSeller(Seller seller) {
		
		String message="Not Regesterd";
		
		
		try (Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into seller(s_name,s_email,password) values(?,?,?)");
			
			ps.setString(1,seller.getS_name());
			ps.setString(2, seller.getS_email());
			ps.setString(3, seller.getPassword());
			
			int res=ps.executeUpdate();
			
			if(res>0) {
				message="Regestration Succesfull...";
			}
			
		} catch (SQLException e) {
			e.getMessage();
		}
		
		
		return message;
		
	}

	
	
	
	@Override
	public Seller loginFunSeller(String email, String password) throws SellerException {
		

		Seller seller = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from seller where s_email = ? AND password = ?");			
			
			ps.setString(1,email);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				int id= rs.getInt("s_id");
				String n= rs.getString("s_name");
				
				String e= rs.getString("s_email");
				String p= rs.getString("password");
				
				
				seller=new Seller(id,n,e,p);	
				
				
			}else
				throw new SellerException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new SellerException(e.getMessage());
		}
		
		
		
		return seller;
	}




	
		@Override
		public  String addProducts(Products product) {
			
			String message="Item Not added";
			
			
			
			try (Connection conn=DBUtil.provideConnection()){
				
				PreparedStatement ps=conn.prepareStatement("insert into products(p_name,price,category,s_idFK) values(?,?,?,?)");
				
				ps.setString(1,product.getP_name());
				ps.setInt(2,product.getPrice());
				ps.setString(3, product.getCategory());
				ps.setInt(4, product.getS_idFK());
			
				int res=ps.executeUpdate();
				
				if(res>0) {
					message="Item added";
				}
				
				
				
				
			} catch (SQLException e) {
				e.getMessage();
			}
			
			
			return message;
		}




		@Override
		public String updatePrice(Products product) {
		
				String message="Item price not updated";
			
			
			
			try (Connection conn=DBUtil.provideConnection()){
				
				PreparedStatement ps=conn.prepareStatement("update products set price=? where p_name=? and s_idFK=?");
				
				ps.setInt(1,product.getPrice());
				ps.setString(2,product.getP_name());
			
				ps.setInt(3, product.getS_idFK());
			
				int res=ps.executeUpdate();
				
				if(res>0) {
					message="Item price updated";
				}
				
				
				
				
			} catch (SQLException e) {
				e.getMessage();
			}
			
			
			return message;
		}




		@Override
		public String removeProduct(Products product) {
			

			String message="Item not removed";
		
		
		
		try (Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("delete from products where p_name=? and s_idFK=?");
			
		
			ps.setString(1,product.getP_name());
			ps.setInt(2, product.getS_idFK());
		
			int res=ps.executeUpdate();
			
			if(res>0) {
				message="Item removed";
			}
			
			
			
			
		} catch (SQLException e) {
			e.getMessage();
		}
		
		
		return message;
	}
		
}
			
		
	


