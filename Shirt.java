package com.xworkz.instance.inst;

public class Shirt {

	public String materialType;
	public int price;
	public boolean available;
	public String brand;
	public String color;
	public int size;
	
	public String[] colorsAvailable;
	public String[] department;
	public String[] style;
	public String[] material;
	public String[] neckline;
	public String[] sleeves;
	
	public Shirt(String materialType, int price, boolean available, String brand, String color, int size, String[] colorsAvailable, String[] department, String[] style, String[] material, String[] neckline, String[] sleeves)
	{
		this.material=material;
		this.price=price;
		this.available=available;
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.colorsAvailable=colorsAvailable;
		this.department=department;
		this.style=style;
		this.material=material;
		this.neckline=neckline;
		this.sleeves=sleeves;
		
	}
	
	public void display()
	{
		System.out.println(this.materialType);
		System.out.println(this.price);
		System.out.println(this.available);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.size);
		
		for (int i = 0; i < colorsAvailable.length; i++) {
			String ref = colorsAvailable[i];
			System.out.println(ref);
		}
		
		for (int i = 0; i < department.length; i++) {
			String ref1=department[i];
			System.out.println(ref1);
		}
		
		for(int i=0; i<style.length; i++)
		{
			
			String ref2=style[i];
			System.out.println(ref2);
		}
		for(int i =0; i<material.length; i++)
		{
			String ref3=material[i];
			System.out.println(ref3);
		}
		for(int i=0; i<neckline.length; i++)
		{
			String ref4=neckline[i];
			System.out.println(ref4);
		}
		
		for(int i =0; i<sleeves.length; i++)
		{
			String ref5=sleeves[i];
			System.out.println(ref5);
		}
	}
}
