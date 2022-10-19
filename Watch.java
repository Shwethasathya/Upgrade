package com.xworkz.instance.inst;

public class Watch {

	public String name = "mustard rock";
	public String brand = "mustard";
	public double price = 2300;
	public String type = "smart";
	public int quanity = 2;

	public String[] features;
	public String[] colors;
	public String[] typeOfWatches;
	public boolean[] quality;
	public String[] watchMovement;
	public boolean[] fresh;

	public Watch(String[] features, String[] colors, String[] typeOfWatches, boolean[] quality, String[] watchMovement,
			boolean[] fresh) {
		this.features = features;
		this.colors = colors;
		this.typeOfWatches = typeOfWatches;
		this.quality = quality;
		this.watchMovement = watchMovement;
		this.fresh = fresh;
	}

	public  void display() {
		System.out.println("name " + name);
		System.out.println("brand " + brand);
		System.out.println("price " + price);
		System.out.println("type " + type);
		System.out.println("quality " + quality);
		
		for(int i = 0; i<features.length; i++)
		{
			String ref = features[i];
			System.out.println("features "+ref);
		}
		
		for(int i = 0; i<colors.length; i++)
		{
			String ref1 = colors[i];
			System.out.println("colors "+ref1);
		}
		
		for(int i = 0; i<typeOfWatches.length; i++)
		{
			String ref2 = typeOfWatches[i];
			System.out.println("type "+ref2);
		}
		for(int i =0; i<quality.length; i++)
		{
			boolean ref3 = quality[i];
			System.out.println(ref3);
		}
		for(int i= 0; i<watchMovement.length; i++)
		{
			String ref4 = watchMovement[i];
			System.out.println(ref4);
		}
		for(int i =0; i<fresh.length; i++)
		{
			boolean ref5 = fresh[i];
			System.out.println(ref5);
		}
	}
}
