package com.xworkz.constructor.cons;

public class Chain {

	public String type;
	public int price;
	public int length;
	public String material;
	public double weight;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;

	public Chain(String type, int price, int length, String material, double weight, boolean stolen, String usedFor,
			boolean fresh) {
		this.type = type;
		this.price = price;
		this.length = length;
		this.material = material;
		this.weight = weight;
		this.stolen = stolen;
		this.usedFor = usedFor;
		this.fresh = fresh;

	}

	public Chain(String type, int price, int length, String material, double weight, boolean stolen, String usedFor) {
		this.type = type;
		this.price = price;
		this.length = length;
		this.material = material;
		this.weight = weight;
		this.stolen = stolen;
		this.usedFor = usedFor;
	}

	public Chain(String type, int price, int length, String material, double weight, boolean stolen) {
		this.type = type;
		this.price = price;
		this.length = length;
		this.material = material;
		this.weight = weight;
		this.stolen = stolen;
	}

	public Chain(String type, int price, int length, String material, double weight) {
		this.type = type;
		this.price = price;
		this.length = length;
		this.material = material;
		this.weight = weight;
	}

	public Chain(String type, int price, int length, String material) {
		this.type = type;
		this.price = price;
		this.length = length;
		this.material = material;
	}
	
	public Chain(String type, int price, int length)
	{
		this.type = type;
		this.price = price;
		this.length = length;
	}
	
	public Chain(String type, int price, boolean fresh)
	{
		this.type = type;
		this.price = price;
		this.fresh = fresh;
		
	}
	
	public Chain(String type, boolean stolen)
	{
		this.type = type;
		this.stolen = stolen;
	}
	
	public Chain(String type)
	{
		this.type = type;
		
	}
	
	public Chain(boolean stoelen, String usedFor, boolean fresh) {
		this.stolen = stolen;
		this.usedFor = usedFor;
		this.fresh = fresh;
	}
}
