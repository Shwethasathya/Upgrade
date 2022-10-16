package com.xworkz.constructor.cons;

public class TextileShop {

	
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber; 
	public int ownersNoOfWifes;
	public int shopNo;
	public long contactNo;
	

	public TextileShop(String ownerName)
	{
		this.ownerName = ownerName;
	}
	
	public TextileShop(String ownerName, String ownerWifeName)
	{
		this.ownerName = ownerName;
		this.ownerWifeName = ownerWifeName;
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNymber)
	{
		this(ownerName, ownerWifeName);
		this.ownerDaughterName = ownerDaughterName;
		this.ownerDaughterNumber = ownerDaughterNumber;
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber, int ownersNoOfWifes)
	{
		this(ownerName, ownerWifeName, ownerDaughterName, ownerDaughterNumber);	
		this.ownersNoOfWifes = ownersNoOfWifes;
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber, int ownersNoOfWifes, int shopNo)
	{
		this(ownerName, ownerWifeName, ownerDaughterName, ownerDaughterNumber, ownersNoOfWifes);
		this.shopNo = shopNo;
		
	}
	
	public TextileShop(String ownerName, String ownerWifeName, long contactNo)
	{
		this(ownerWifeName, ownerWifeName);
		this.contactNo = contactNo;	
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber, long contactNo)
	{
		this(ownerName, ownerWifeName, ownerDaughterName, ownerDaughterNumber);
		this.contactNo = contactNo;
		
	}
	public TextileShop(long ownerDaughterNumber, long contactNo)
	{
		this.ownerDaughterNumber = ownerDaughterNumber;
		this.contactNo = contactNo;
	}
}
