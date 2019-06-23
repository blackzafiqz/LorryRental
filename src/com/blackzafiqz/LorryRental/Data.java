package com.blackzafiqz.LorryRental;

import java.util.*;

public class Data
{
	private static Queue<Booking> booking;
	private static Stack<Lorry> lorry;
	private static ArrayList<User> user;
	private static ArrayList<Booking> booked;
	
	public static void initializeData()
	{
		booking = new PriorityQueue<Booking>();
		lorry  	= new Stack<Lorry>();
		user	= new ArrayList<User>();
		booked	= new ArrayList<Booking>();
		
	}

	public static Queue<Booking> getBooking()
	{
		return booking;
	}

	public static void setBooking(Queue<Booking> booking)
	{
		Data.booking = booking;
	}

	public static Stack<Lorry> getLorry()
	{
		return lorry;
	}

	public static void setLorry(Stack<Lorry> lorry)
	{
		Data.lorry = lorry;
	}

	public static ArrayList<User> getUser()
	{
		return user;
	}

	public static void setUser(ArrayList<User> user)
	{
		Data.user = user;
	}

	public static ArrayList<Booking> getBooked()
	{
		return booked;
	}

	public static void setBooked(ArrayList<Booking> booked)
	{
		Data.booked = booked;
	}

}
