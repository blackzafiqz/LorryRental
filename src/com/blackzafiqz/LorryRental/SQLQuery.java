package com.blackzafiqz.LorryRental;

import java.sql.*;
import java.util.ArrayList;

public class SQLQuery
{
	private Connection connect()
	{
		// SQLite connection string
		String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\LorryRental.db";
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection(url);
		} catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public ArrayList<User> getUser()
	{
		String sql = "SELECT * FROM USER";
		ArrayList<User> al = new ArrayList<User>();
		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql))
		{

			while (rs.next())
			{
				String name = rs.getString("name");
				String permission = rs.getString("permission");
				String username = rs.getString("username");
				String password = rs.getString("password");
				al.add(new User(name, permission, username, password));

			}
			return al;
		} catch (SQLException e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}


}
