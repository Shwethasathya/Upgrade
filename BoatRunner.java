package com.xworkz.constructor.boot;

import com.xworkz.constructor.cons.Boat;

public class BoatRunner {

	public static void main(String[] args) {

		Boat boat = new Boat();

		System.out.println(boat.name);
		System.out.println(boat.colour);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);

		boat = new Boat("Serendipity");

		System.out.println(boat.name);
		System.out.println(boat.colour);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);

		boat = new Boat("Gale", 'M');

		System.out.println(boat.name);
		System.out.println(boat.colour);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);

		boat = new Boat("Gale", "blue", "Aquatic Voyagers", 's', "voyages");

		System.out.println(boat.name);
		System.out.println(boat.colour);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		boat = new Boat("liberty", 'L', "red", "Aquatic voyagers");
		
		System.out.println(boat.name);
		System.out.println(boat.colour);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		
		boat = new Boat('s', "aquatic voyagers", "navy blue");
		System.out.println(boat.type);
		System.out.println(boat.companyName);
		System.out.println(boat.colour);

		boat = new Boat("liberty", "aquatic voyagers");
		System.out.println(boat.name);
		System.out.println(boat.owner);
		
		boat = new Boat('m');
		System.out.println(boat.type);
	}

}
