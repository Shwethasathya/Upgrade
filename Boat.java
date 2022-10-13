package com.xworkz.constructor.cons;

public class Boat {
	
	public String name;
	public String colour;
	public String companyName;
	public char type;
	public String owner;
	
	public Boat()
	{
		System.out.println("default constructor");
		
	}
	public Boat(String name)
	{
		this.name = name;
		
	}
	
	public Boat(String name, char type)
	{
		this.name = name;
		this.type = type;
	}
	
	public Boat(String name, String colour, String companyName, char type, String owner)
	{
		this.name = name;
		this.colour = colour;
		this.companyName = companyName;
		this.type = type;
		this.owner = owner;
	}

	public Boat(String name, char type, String colour, String owner)
	{
		this.name = name;
		this.type = type;
		this.colour = colour;
		this.owner = owner;
	}
	
	public Boat(char type, String companyName, String colour)
	{
		this.type = type;
		this.companyName = companyName;
		this.colour = colour;
	}
	
	public Boat(String name, String owner)
	{
		this.name = name;
		this.owner = owner;
	}
	
	public Boat(char type)
	{
		this.type = type;
	}
	
}



