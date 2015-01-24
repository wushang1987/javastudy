package com.wgh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class Batch {
	public Batch(){
		
	}
	
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
	
	/*
	 * 批量添加数据
	 * @return 影响的行数
	 */
	public int saveBatch(){
		int row = 0;
		Connection conn = getConnection();
		try{
			String sql = "insert into tb_student_batch(id,name,sex,age) values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			Random random = new Random();
			for(int i=0; i<10; i++){
				ps.setInt(1, i+1);
				ps.setString(2, "学生"+i);
				ps.setBoolean(3, i%2==0 ? true:false);
				ps.setInt(4, random.nextInt(5)+10);
				ps.addBatch();
			}
			int[] rows = ps.executeBatch();
			row = rows.length;
			ps.close();
			conn.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		return row;
	}
}


