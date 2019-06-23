package com.blackzafiqz.LorryRental;

public class Booking
{
	private String username;
	private double distance;
	private double weight;
	private String plate;
	private String date;
	private boolean ready;
	private double price;

	public Booking(String username, double distance, double weight, String date)
	{
		setUsername(username);
		setDistance(distance);
		setWeight(weight);
		setDate(date);
		setReady(false);
	}

	public void setLorry(String a)
	{
		setPlate(a);
		setReady(true);
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public double getDistance()
	{
		return distance;
	}

	public void setDistance(double distance)
	{
		this.distance = distance;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public String getPlate()
	{
		return plate;
	}

	public void setPlate(String plate)
	{
		this.plate = plate;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public boolean isReady()
	{
		return ready;
	}

	public void setReady(boolean ready)
	{
		this.ready = ready;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

}
