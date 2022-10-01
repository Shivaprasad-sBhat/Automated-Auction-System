package com.auction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aucion.bean.Bidding;
import com.aucion.bean.Buyer;
import com.aucion.bean.Products;
import com.aucion.bean.Seller;
import com.auction.exceptions.BuyerException;
import com.auction.exceptions.ProductException;
import com.auction.usecase.LoginBuyer;
import com.auction.utility.DBUtil;


public class BuyerDaoImpl implements BuyerDao {
	
	Buyer buyer = null;

	@Override
	public String regBuyer(Buyer buyer) {
		
		String massage ="Not regesterd !";
		
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			
			PreparedStatement ps=conn.prepareStatement("insert into buyer(b_name,b_email,password) values(?,?,?)");
			
			ps.setString(1, buyer.getB_name());
			ps.setString(2,buyer.getB_email());
			ps.setString(3, buyer.getPassword());
			
			int res= ps.executeUpdate();
			
			if(res>0) {
				massage=" Registration succesfull";
			}
			
			
		}  catch (SQLException e1) {
			
			massage=e1.getMessage();
		}
		
		
		
		return massage;
	}

	//Login Buyer
	
	@Override
	public Buyer loginBuyer(String email, String password) throws BuyerException {
	
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from buyer where b_email = ? AND password = ?");			
			
			ps.setString(1,email);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				int id= rs.getInt("b_id");
				String n= rs.getString("b_name");
				
				String e= rs.getString("b_email");
				String p= rs.getString("password");
				
				
				buyer=new Buyer(id,n,e,p);	
				
				
			}else
				throw new BuyerException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new BuyerException(e.getMessage());
		}
		
		
		
		return buyer;
	}
	
	
	
	

	
	//  Search and view Items by category.
	@Override
	public List<Products> showItemList() throws ProductException {
		
		
		List<Products> product=new ArrayList<>();
		
		
		try(Connection conn=DBUtil.provideConnection()) {
			//,e_date as 'Auction end time'
			
			PreparedStatement ps=conn.prepareStatement("select p_id , p_name,price,category from products order by category;");
			
			
			ResultSet res= ps.executeQuery();
			
			while(res.next()) {
				String name=res.getString("p_name");
				int price=res.getInt("price");
				int pid=res.getInt("p_id");
				String cat=res.getString("category");
//				Timestamp s_date=res.getTimestamp("s_date");
//				Date date1 = s_date;
//				Timestamp e_date=res.getTimestamp("e_date");
//				Date date2 = e_date;
//				int s_idFK=res.getInt("s_idFK");
//,date1,date2,s_idFK				
				Products prod=new Products();
				prod.setP_name(name);
				prod.setPrice(price);
				prod.setP_id(pid);
				prod.setCategory(cat);
				
				product.add(prod);
				
			}
			
			
		}  catch (SQLException e) {
			
		throw new ProductException(e.getMessage());
		}
		
		if(product.size()<=0) 
			System.out.println("Items not found!");
		
		
		
		return product ;	
	}

	@Override
	public List<Products> showItemPrice() throws ProductException {
		
		List<Products> product=new ArrayList<>();
		
		
		try(Connection conn=DBUtil.provideConnection()) {
			//,e_date as 'Auction end time'
			
			PreparedStatement ps=conn.prepareStatement("select p_id , p_name,price,category from products order by price");
			
			
			ResultSet res= ps.executeQuery();
			
			while(res.next()) {
				String name=res.getString("p_name");
				int price=res.getInt("price");
				int pid=res.getInt("p_id");
				String cat=res.getString("category");
//				Timestamp s_date=res.getTimestamp("s_date");
//				Date date1 = s_date;
//				Timestamp e_date=res.getTimestamp("e_date");
//				Date date2 = e_date;
//				int s_idFK=res.getInt("s_idFK");
//,date1,date2,s_idFK				
				Products prod=new Products();
				prod.setP_name(name);
				prod.setPrice(price);
				prod.setP_id(pid);
				prod.setCategory(cat);
				
				product.add(prod);
				
			}
			
			
		}  catch (SQLException e) {
			
		throw new ProductException(e.getMessage());
		}
		
		if(product.size()<=0) 
			System.out.println("Items not found!");
		
		
		
		return product ;
		
		
	}

	
	//bidding on item
	@Override
	public String  biddOnProd(int prod_id,int bid_price) {
		
		String message="unsuccesfull bid...";
		
		
		
		
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			
			PreparedStatement ps1=conn.prepareStatement("select * from products where p_id=?");
			ps1.setInt(1,prod_id);
			
			
			
			ResultSet rs=ps1.executeQuery();
			
			
			int s_idFK = 0;
			String pname=null;
			if(rs.next()) {
				s_idFK=rs.getInt("s_idFK");
				pname=rs.getString("p_name");
			}
			
			System.out.println();
			PreparedStatement ps=conn.prepareStatement("insert into bidding(prod_id,bid_price,buyer_id,seller_id) values(?,?,?,?)");
			
			ps.setInt(1,prod_id);
			ps.setInt(2,bid_price);
			
			ps.setInt(3,new LoginBuyer().buyerid);
			ps.setInt(4,s_idFK);
			
			
			
			int res=ps.executeUpdate();
			
			if(res>0) {
				message="You have made a bid on "+pname+" succesfully..";
			}

			
		} catch (Exception e) {
			e.getMessage();
		}
		
		return message;
	}



	
	
	
	
	
	
	
	

}
