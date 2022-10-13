package com.xworkz.constructor.boot;

import com.xworkz.constructor.cons.Fish;

public class FishRunner {

	public static void main(String[] args) {

		System.out.println("Started");

		Fish fish = new Fish();

		System.out.println(fish);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);

		fish = new Fish("floater");
		System.out.println("                      ");
		System.out.println(fish);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);

		fish = new Fish("floater", 250);
		System.out.println("                      ");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);

		fish = new Fish("ocean fish", 25, 1.8);
		System.out.println("                      ");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.length);
		System.out.println(fish.weight);
		
		fish =new Fish("ocean fish", 650, 1.85, 50);
		System.out.println("                      ");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.length);
		System.out.println(fish.weight);
		
		fish =new Fish(250, "star", "bolb", 65, 2.65);
		System.out.println("                      ");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.length);
		System.out.println(fish.weight);
		
		
		fish = new Fish(3.6, "bolb");
		System.out.println(fish.length);
		System.out.println(fish.type);
			}

}
