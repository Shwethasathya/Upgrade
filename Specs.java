package com.xworkz.instance.inst;

public class Specs {

	public int price;
	public boolean quality;
	public int quantity;
	public boolean powered;
	public String brand;
	
	public String[] lensTypes;
	public String[] seller;
	public String[] type;
	public String[] shapes;
	public String[] colors;
	public String[] brands;
	
	public Specs(int price, boolean quality, int quantity, boolean powered, String brand, String[] lensTypes, String[] seller, String[] type, String[] shapes, String[] colors, String[] brands)
	{
		this.price=price;
		this.quality=quality;
		this.quantity=quantity;
		this.powered=powered;
		this.brand=brand;
		this.lensTypes=lensTypes;
		this.seller=seller;
		this.type=type;
		this.shapes=shapes;
		this.colors=colors;
		this.brands=brands;
	}
	
	public void display()
	{
		System.out.println(this.price);
		System.out.println(this.quality);
		System.out.println(this.quantity);
		System.out.println(this.powered);
		System.out.println(this.brand);
		
		
		for(int i=0; i<lensTypes.length; i++)
		{
			String ref=lensTypes[i];
			System.out.println(ref);
		}
		for(int i=0; i<seller.length;i++)
		{
			String ref1 = seller[i];
			System.out.println(ref1);
		}
		
		for(int i= 0; i<type.length; i++)
		{
			String ref2 = type[i];
			System.out.println(ref2);
		}
		
		for(int i=0; i<shapes.length; i++)
		{
			String ref3=shapes[i];
			System.out.println(ref3);
		}
		
		for(int i=0; i<colors.length; i++)
		{
			String ref4=colors[i];
			System.out.println(ref4);
		}
		for(int i=0; i<brands.length; i++)
		{
			String ref5=brands[i];
			System.out.println(ref5);
		}
	}
}
