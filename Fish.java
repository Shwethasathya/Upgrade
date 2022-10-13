package com.xworkz.constructor.cons;

public class Fish {

	public String name;
	public String type;
	public int price;
	public double weight;
	public double length;
	
	
	public Fish()
	{
		
		System.out.println("created Fish using default constructor");
	}
	
	public Fish(String name)
	{
		
		this.name = name;
		System.out.println("created using parameter constructor");
		
		
	}
	
	public Fish(String name, int price)
	{
		this.name = name;
		this.price = price;
		
		System.out.println("para constructore");
	}

	public Fish(String type, double weight, double length)
	{
		this.type = type;
		this.weight = weight;
		this.length = length;
		
	}

	public Fish(String name, int price, double length, double weight)
	{
		this.name = name;
		this.price = price;
		this.length = length;
		this.weight = weight;
		
	}
	
	public Fish(int price, String name, String type, double weight, double length)
	{
		
		this.price = price;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.length = length;
	}

	public Fish(double length, String type)
	{
		this.length = length;
		this.type = type;
	}
}






