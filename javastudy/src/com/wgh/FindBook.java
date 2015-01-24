package com.wgh;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;



public class FindBook {
	public Connection getConnection(){
		Connection conn=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password = "12345";
			conn = DriverManager.getConnection(url,username,password);
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public List<Book> findAll(){
		List<Book> list = new ArrayList<Book>();
		Connection conn = getConnection();
		
		try{
			//CallableStatement cs = conn.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability)("{call findAllBook()}");
			CallableStatement cs = conn.prepareCall("{call findAllBook()}");
			
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setPrice(rs.getDouble("price"));
				book.setBookCount(rs.getInt("bookCount"));
				book.setAuthor(rs.getString("author"));
				list.add(book);
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
		return list;
	}
}
