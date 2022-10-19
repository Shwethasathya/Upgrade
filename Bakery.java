package com.xworkz.instance.inst;

public class Bakery {

	public String name;
	public long contactNo;
	public String location;
	public int noOfDoors;
	public int rating;

	public String[] availableItems;
	public String[] typeOfPuffs;
	public String[] typeOfCakes;
	public String[] icecreamFlavours;
	public String[] biscuits;
	public boolean[] chacolatesAvailable;

	public Bakery(String name, long contactNo, String location, int noOfDoors, int rating, String[] availableItems,
			String[] typeOfPuffs, String[] typeOfCakes, String[] icecreamFlavours, String[] biscuits,
			boolean[] chacolatesAvailabel) {
		this.name = name;
		this.contactNo = contactNo;
		this.location = location;
		this.noOfDoors = noOfDoors;
		this.rating = rating;
		this.availableItems = availableItems;
		this.typeOfPuffs = typeOfPuffs;
		this.typeOfCakes = typeOfCakes;
		this.icecreamFlavours = icecreamFlavours;
		this.biscuits = biscuits;
		this.chacolatesAvailable = chacolatesAvailabel;
	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.contactNo);
		System.out.println(this.location);
		System.out.println(this.noOfDoors);
		System.out.println(this.rating);

		System.out.println(System.lineSeparator());
		for (int i = 0; i < availableItems.length; i++) {
			String ref = availableItems[i];
			System.out.println(ref);

		}

		for (int i = 0; i < typeOfPuffs.length; i++) {
			String ref1 = typeOfPuffs[i];
			System.out.println(ref1);

		}

		for (int i = 0; i < typeOfCakes.length; i++) {
			String ref2 = typeOfCakes[i];
			System.out.println(ref2);
		}

		for (int i = 0; i < icecreamFlavours.length; i++) {
			String ref3 = icecreamFlavours[i];
			System.out.println(ref3);
		}

		for (int i = 0; i < biscuits.length; i++) {
			String ref4 = biscuits[i];
			System.out.println(ref4);
		}

	}

}
