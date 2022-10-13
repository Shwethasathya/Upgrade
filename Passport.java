package com.xworkz.constructor.cons;

public class Passport {
	
	public int number;
	public String name;
	public String expiryDate;
	public String country;
	public int issuedDate;
	public int noOfLeafs;
	
	public Passport()
	{
		System.out.println("default constructor");
	}
	
	public Passport(int number)
	{
		this.number = number;
	}
	
	public Passport(String name)
	{
		this.name = name;
		
	}
	
	public Passport(int number, String name)
	{
		this.number= number;
		this.name = name;
		
	}
	
	public Passport(String name, int number)
	{
		this.name =name;
		this.number=number;
	}
	
	public Passport(int number, String name, String expiryDate, String country, int issuedDate, int noOfLeafs)
	{
		this.number = number;
		this.name = name;
		this.expiryDate = expiryDate;
		this.country = country;
		this.issuedDate = issuedDate;
		this.noOfLeafs = noOfLeafs;
	}
	
	public Passport(int number, int noOfLeafs, String country)
	{
		this.number = number;
		this.noOfLeafs = noOfLeafs;
		this.country = country;
	}

	public Passport(String country, String name, int issuedDate)
	{
		this.country = country;
		this.name = name;
		this.issuedDate = issuedDate;
	}
	
	public Passport(int number, String country, int noOfLeafs)
	{
		this.number = number;
		this.country = country;
		this.noOfLeafs = noOfLeafs;
	}
}
