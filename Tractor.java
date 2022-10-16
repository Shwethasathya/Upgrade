package com.xworkz.constructor.cons;

public class Tractor {
	
	public String name;
	public String brand;
	public int price;
	public String color;
	public int hp;
	public String model;
	
	public Tractor(String name, String brand, int price, String color, int hp, String model)
	{
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.hp = hp;
		this.model = model;
		System.out.println("constructor having six parameter");
	}
	
	public Tractor(String name, String brand)
	{
		this.name = name;
		this.brand = brand;
		System.out.println("constructor having String and string");
	}
	
	public Tractor(String name, String brand, int price)
	{
		this(name, brand);
		this.price = price;
	}
	
	public Tractor(String name, String brand, int price, String color)
	{
		this(name, brand, price);
		this.color = color;
	}
	
	public Tractor(String name, String brand, int price, String color, int hp)
	{
		this(name, brand, price, color);
		this.hp = hp;
	}
	
	public Tractor(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	
	public Tractor(int price, String color)
	{
		this.price = price;
		this.color = color;
	}
	

}
