package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class PartyVotesDao implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		try
		{
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
	
	private Connection con;
	
	public PartyVotesDao() throws SQLException
	{
		con= DbUtil.getConnection();
	}
	
	List<PartyVotes> getPartywiseVotes() throws SQLException
	{
		List<PartyVotes> list = new ArrayList<>();
		
		String sql = "SELECT party, sum(votes) FROM candidates GROUP BY party";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			try(ResultSet rs=stmt.executeQuery())
			{
				while(rs.next())
				{
					String party = rs.getString("party");
					int votes = rs.getInt("sum(votes)");
					PartyVotes pv = new PartyVotes(party,votes);
					list.add(pv);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}

}
