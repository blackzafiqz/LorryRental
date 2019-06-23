package com.blackzafiqz.LorryRental;

import java.util.Scanner;


public class Register
{
	private String username;
	private String password;
	private String name;
	private String permission;
	private Scanner sc;
	public void mainRegister()
	{
		sc = new Scanner(System.in);

		System.out.println("Enter a name");
		name = sc.next();
		System.out.println("Enter a permission Admin/User");
		permission = sc.next();
		System.out.println("Enter a username");
		username = sc.next();
		System.out.println("Enter a password");
		password = sc.next();
		verifyRegister();
	}

	public void verifyRegister()
	{
		RegisterStatus rs = register();
		if (rs == RegisterStatus.SUCCESSFUL)
		{
			System.out.print("Successful");
			return;
		}
		else if (rs == RegisterStatus.EXIST)
		{
			System.out.print("Username exist!");
			mainRegister();
		}

	}
	
	public RegisterStatus register()
	{
		for(int x=0; Data.getUser()!=null && x<Data.getUser().size();x++)
		{
			if(Data.getUser().get(x).getUsername().equals(username))
				return RegisterStatus.EXIST;
		}
		Data.getUser().add(new User(name, permission, username, password));
		
		return RegisterStatus.SUCCESSFUL;
		
	}

}