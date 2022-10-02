package com.auction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aucion.bean.Admin;
import com.aucion.bean.Buyer;
import com.aucion.bean.Seller;
import com.auction.exceptions.AdminException;
import com.auction.exceptions.SellerException;
import com.auction.utility.DBUtil;


public class AdminDaoImpl implements AdminDao {

	@Override
	public String regesterAdmin(Admin admin) {
		
		String message="Regester failed";
		
try (Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into admin(a_name,a_email,password) values(?,?,?)");
			
			ps.setString(1,admin.getA_name());
			ps.setString(2, admin.getA_email());
			ps.setString(3, admin.getPassword());
			
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
	public Admin loginAdmin(String email,String password) throws AdminException {
		String message="login failed..";
		Admin admin=null;
		
			try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from admin where a_email = ? AND password = ?");			
			
			ps.setString(1,email);
			ps.setString(2,password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				int id= rs.getInt("a_id");
				String n= rs.getString("a_name");
				
				String e= rs.getString("a_email");
				String p= rs.getString("password");
				
				
				admin=new Admin(id,n,e,p);
				
				
			}else
				throw new AdminException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new AdminException(e.getMessage());
		}
		
		return admin;
		
	}

	@Override
	public List<Buyer> showBuyer() {
	
		List<Buyer> buyer=new ArrayList<>();
		
		
		try(Connection conn=DBUtil.provideConnection();) {
			
			PreparedStatement ps=conn.prepareStatement("select * from buyer");
			
			ResultSet b=ps.executeQuery();
			
			while(b.next()) {
				int b_id=b.getInt("b_id");
				String name=b.getString("b_name");
				String email=b.getString("b_email");
				String pass=b.getString("password");
			
				Buyer byr=new Buyer();
				byr.setB_id(b_id);
				byr.setB_email(email);
				byr.setB_name(name);
				byr.setPassword(pass);
				buyer.add(byr);
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		
		
		
		return buyer;
		
	}

	@Override
	public List<Seller> showSeller() {
	
		List<Seller> seller=new ArrayList<>();
		
		
		try(Connection conn=DBUtil.provideConnection();) {
			
			PreparedStatement ps=conn.prepareStatement("select * from seller");
			
			ResultSet b=ps.executeQuery();
			
			while(b.next()) {
				int b_id=b.getInt("s_id");
				String name=b.getString("s_name");
				String email=b.getString("s_email");
				String pass=b.getString("password");
			
				Seller s=new Seller();
				s.setS_id(b_id);
				s.setS_email(email);
				s.setS_name(name);
				s.setPassword(pass);
				seller.add(s);
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		
		
		
		return seller;
		
	}

}
