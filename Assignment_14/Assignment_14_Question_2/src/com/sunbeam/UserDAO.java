package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements AutoCloseable {

private Connection con;
	
	public UserDAO() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close() throws Exception {
		
		try
		{if(con!=null)
		{
			con.close();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//add new user
	public int addUser(User u) throws Exception
	{
		String sql = "INSERT INTO users VALUES(default, ?,?,?,?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
	         stmt.setString(1, u.getFname());
	         stmt.setString(2, u.getLname());
	         stmt.setString(3, u.getEmail());
	         stmt.setString(4, u.getPassword());
	         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	         java.util.Date date =sdf.parse(u.getDob());
	         java.sql.Date sDate = new java.sql.Date(date.getTime());
	         stmt.setDate(5, sDate);
	         stmt.setBoolean(6, u.getStatus());
	         stmt.setString(7, u.getRole());
	         int cnt = stmt.executeUpdate();
	         
	         return cnt;
			
		}
		
	}
	//delete existing user
	public int deleteUser(int id) throws SQLException
	{
		String sql = "DELETE FROM users where id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			
	        return cnt;
		}
	}
	//update existing user
	public int updateUser(User u) throws Exception
	{
		String sql = "UPDATE users SET first_name=?,last_name=?,email=?,password=?,dob=?,status=?,role=? WHERE id=?";
		
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setString(1,u.getFname());
			stmt.setString(2, u.getLname());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date date = sdf.parse(u.getDob());
			java.sql.Date sDate = new java.sql.Date(date.getTime());
			stmt.setDate(5,sDate);
			stmt.setBoolean(6, u.getStatus());
			stmt.setString(7, u.getRole());
			stmt.setInt(8, u.getId());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
		
	}
	//display user
	public List<User> displayUser() throws Exception
	{
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			try(ResultSet rs=stmt.executeQuery())
			{
				while(rs.next())
				{
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String pass = rs.getString("password");
					Date dob = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String date = sdf.format(dob);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id,fname,lname,email,pass,date,status,role);
					list.add(u);
				}
				
				
			}
		}
		return list;
	}
	
	
			

}
