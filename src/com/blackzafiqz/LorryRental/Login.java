package com.blackzafiqz.LorryRental;

import java.util.Scanner;

public class Login
{
	private String username;
	private String password;
	private User user;
	private Scanner sc;
	public Login()
	{
		sc = new Scanner(System.in);
	}

	public User mainLogin()
	{
		if(Data.getUser().size()==0)
		{
			System.out.println("Please create an account first");
			return null;
		}
		getLogin();
		return user;
	}

	private void getLogin()
	{

		System.out.println("Enter a username : ");
		username = sc.next();
		System.out.println("Enter a password : ");
		password = sc.next();
		verifyLogin();

	}

	private void verifyLogin()
	{
		boolean correctUsername = false;
		boolean correctPassword = false;
		for (int x = 0; x < Data.getUser().size(); x++)
		{
			correctUsername = Data.getUser().get(x).getUsername().equals(username) ? true : false;
			correctPassword = Data.getUser().get(x).getPassword().equals(password) ? true : false;
			user = Data.getUser().get(x);
			if (correctUsername && correctPassword)
				break;
		}

		if (!correctUsername || !correctPassword)
		{
			System.out.println("Wrong login!");
			getLogin();
		}
		
	}

}