package com.blackzafiqz.LorryRental;

import java.util.Scanner;

public class MainApp
{

	public static void main(String[] args)
	{
		User user;
		Login login = new Login();
		Register register = new Register();
		Scanner sc = new Scanner(System.in);
		Data.initializeData();
		int option = 0;
		while (option != 3)
		{
			System.out.println("Choose an option");
			System.out.println("1.Login");
			System.out.println("2.Register");
			System.out.println("3.Exit");
				option = sc.nextInt();

			switch (option)
			{
			case 1:
				user = login.mainLogin();
				if(user==null)
					continue;
				else if (user.getPermission().equals("User"))
					new UserInterface(user);
				else 
					new AdminInterface(user);
				break;
			case 2:
				register.mainRegister();
				break;
			case 3:
				return;
			default:
				System.out.println("Wrong option!");
				break;
			}
		}
	}

}
