package com.blackzafiqz.LorryRental;

import java.util.Queue;
import java.util.Scanner;

public class UserInterface
{
	private User user;
	private double distance;
	private double weight;
	private String date;
	private Queue<Booking> booking;
	private Scanner sc;
	public UserInterface(User user)
	{
		this.user = user;
		sc = new Scanner(System.in);
		mainUserInterface();
		sc.close();
	}

	public void mainUserInterface()
	{
		int option = 0;
		while (option != 3)
		{
			System.out.println("Welcome " + user.getName());
			System.out.println("Choose an option ");
			System.out.println("1.Make a booking");
			System.out.println("2.Check booking");
			System.out.println("3.Logout");
			option = sc.nextInt();

			switch (option)
			{
			case 1:
				makeBooking();
				break;
			case 2:
				checkBooking();
				break;
			default:
				System.out.println("Wrong option!");

				break;
			}
		}
	}

	public void makeBooking()
	{

		System.out.println("Enter distance : ");
		distance = sc.nextDouble();
		System.out.println("Enter weight   : ");
		weight = sc.nextDouble();
		booking = Data.getBooking();
		booking.add(new Booking(user.getUsername(), distance, weight, date));
		Data.setBooking(booking);
		System.out.println("Please wait for admin to update your booking");
	}
	
	public void checkBooking()
	{
		boolean available = false;
		for(int x=0;x<Data.getBooked().size();x++)
		{
			available = Data.getBooked().get(x).getUsername().equals(user.getUsername()) ? true : false;
		}
		
		if(available)
		{
			for(int x=0;x<Data.getBooked().size();x++)
			{
				Booking booked = Data.getBooked().get(x);
				System.out.println("Available booking :");
				if(booked.getUsername().equals(user.getUsername()))
				{
					System.out.print(	"\nDistance 	: " + booked.getDistance() + 
										"\nWeight       : " + booked.getWeight() +
										"\nDate         : " + booked.getDate() +
										"\nPlate        : " + booked.getPlate() +
										"\nPrice        : " + booked.getPrice());
				}
			}
		}
		else
			System.out.println("No booking available!");
	}
}