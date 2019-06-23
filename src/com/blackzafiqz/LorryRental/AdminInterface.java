package com.blackzafiqz.LorryRental;


import java.util.Scanner;

public class AdminInterface
{
	private User admin;
	private Scanner sc;
	
	public AdminInterface(User admin)
	{
		this.admin = admin;
		sc = new Scanner(System.in);
		mainAdminInterface();
	}

	public void mainAdminInterface()
	{
		int option = 0;
		while (option != 3)
		{
			System.out.println("Welcome " + admin.getName());
			System.out.println("Choose an option ");
			System.out.println("1.Check booking");
			System.out.println("2.Add lorry");
			System.out.println("3.Logout");
			option = sc.nextInt();

			switch (option)
			{
			case 1:
				assignBooking();
				break;
			case 2:
				addLorry();
				break;
			default:
				System.out.println("Wrong option!");

				break;
			}
		}
	}

	public void assignBooking()
	{
		Booking book;
		Lorry lorry = Data.getLorry().pop();
	
		book = Data.getBooking().poll();
		if (book == null)
			System.out.print("No booking available!");
		else
		{
			System.out.println("Username : " + book.getUsername());
			System.out.println("Distance : " + book.getDistance());
			System.out.println("Weight 	 : " + book.getWeight());
			System.out.println("Date     : " + book.getDate());
			System.out.println("Assigned lorry : " + lorry.getPlate());
			System.out.println("Enter a price : RM ");
			book.setPrice(sc.nextDouble());
			book.setPlate(lorry.getPlate());
			Data.getBooked().add(book);
		}

	}

	public void addLorry()
	{
		String model, manufacturer, plate;
		System.out.println("Enter model 		: ");
		model = sc.next();
		System.out.println("Enter manufacturer  : ");
		manufacturer = sc.next();
		System.out.println("Enter plate			: ");
		plate = sc.next();
		Data.getLorry().add(new Lorry(model, manufacturer, plate));
	}

}
