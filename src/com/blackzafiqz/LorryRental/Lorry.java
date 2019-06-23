package com.blackzafiqz.LorryRental;

public class Lorry
{
	private String plate;
	private String manufacturer;
	private String model;
	public Lorry(String a, String b, String c)
	{
		plate = a;
		manufacturer = b;
		model = c;
	}

	public String getPlate()
	{
		return plate;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public String getModel()
	{
		return model;
	}


}
