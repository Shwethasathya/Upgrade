package com.xworkz.instance.inst;

public class NewsPaper {

	public String name;
	public int price;
	public int noOfPages;
	public String color;
	public String date;
	public boolean useFull;
	
	
	
	public String[] languagesAvailable;
	public String[] names;
	public String[] publications;
	public String[] fieldCoverdInNewsPaper;
	
	public NewsPaper(String[] languagesAvailable, String[] names, String[] publications, String[] fieldCoveredInNewsPaper) {
		
		this.languagesAvailable = languagesAvailable;
		this.name = name;
		this.publications = publications;
		this.fieldCoverdInNewsPaper = fieldCoveredInNewsPaper;
	}
	
	public NewsPaper(String name, int price, int noOfPages, String color, String date, boolean usefull)
	{
		this.name = name;
		this.price = price;
		this.noOfPages=noOfPages;
		this.color=color;
		this.date=date;
		this.useFull=usefull;
	}
	
	public void display()
	{
		for(int i = 0; i<languagesAvailable.length; i++)
		{
			String ref = languagesAvailable[i];
			System.out.println(ref);
		}
		for(int i=0; i<names.length; i++)
		{
			String ref1=names[i];
			System.out.println(ref1);
			}
		for(int i =0; i<publications.length; i++)
		{
			String ref2 = publications[i];
			System.out.println(ref2);
		}
		for(int i=0; i<fieldCoverdInNewsPaper.length; i++)
		{
			String ref3 = fieldCoverdInNewsPaper[i];
			System.out.println(ref3);
		}
			
	}
	
}
