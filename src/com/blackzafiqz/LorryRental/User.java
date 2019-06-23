package com.blackzafiqz.LorryRental;

public class User
{
	private String name;
	private String permission;
	private String username;
	private String password;
	
	public User(String a,String b,String c,String d)
	{
		name 		= a;
		permission	= b;
		username	= c;
		password	= d;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPermission()
	{
		return permission;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
}
