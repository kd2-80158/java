package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable{

	
	private Connection con;
	
	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		
		try{
		if(con!=null)
		{
			con.close();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//1. Add new Candidate
	public int addCandidate(Candidate c) throws SQLException
	{
		String sql = "INSERT INTO candidates VALUES(?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setInt(1, c.getId());
			stmt.setString(2, c.getName());
			stmt.setString(3, c.getParty());
			stmt.setInt(4, c.getVotes());
			int count = stmt.executeUpdate();
			return count;
			}
	}
	
	//2. Delete given candidate
	
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} 
	}
	
	//3. Update candidate
	
	public int updateById(Candidate c) throws SQLException
	{
		String sql = "UPDATE candidates SET name=?,party=? WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, c.getName());
		stmt.setString(2, c.getParty());	
		stmt.setInt(3, c.getId());
		int count = stmt.executeUpdate();
		return count;
		
	}
	
	// 4. get all candidates
		public List<Candidate> findAll() throws SQLException {
			List<Candidate> list = new ArrayList<>();
			String sql = "SELECT * FROM candidates";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						Candidate c = new Candidate(id, name, party, votes);
						list.add(c);
					}
				} // rs.close();
			} // stmt.close();
			return list;
		}
	 // 5. increment candidate vote
		public int incrementVote(int id) throws SQLException
		{
			String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
		
		// 6. get all candidates of given party
		
		public List<Candidate> findByParty(String givenParty) throws SQLException {
			List<Candidate> list = new ArrayList<>();
			String sql = "SELECT * FROM candidates WHERE party=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, givenParty);
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						Candidate c = new Candidate(id, name, party, votes);
						list.add(c);
					}
				} 
			} // 
			return list;
		}
		
	
	
}
