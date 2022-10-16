package com.xworkz.constructor.boot;

import com.xworkz.constructor.cons.Tractor;

public class TractoeRunner {

	public static void main(String[] args) {
		
		Tractor tractor = new Tractor("Mahinra", "mahindra", 15000, "Red", 15,"new");
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		System.out.println(tractor.color);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
		
		System.out.println(System.lineSeparator());
		tractor = new Tractor("Mahindra", "new");
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		
		System.out.println(System.lineSeparator());
		tractor = new Tractor("mahindra", "mahindra",15000);
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		
		System.out.println(System.lineSeparator());
		tractor = new Tractor("John deer", "John deer", 150000, "Red");
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		System.out.println(tractor.color);
		
		System.out.println(System.lineSeparator());
		tractor = new Tractor("John deer", "John deer", 150000, "Red", 15);
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		System.out.println(tractor.color);
		System.out.println(tractor.hp);
		
		System.out.println(System.lineSeparator());
		tractor = new Tractor("Powertrac", 330000);
		System.out.println(tractor.name);
		System.out.println(tractor.price);

		System.out.println(System.lineSeparator());
		tractor = new Tractor(330000, "Blue");
		System.out.println(tractor.color);
		System.out.println(tractor.price);
	}

}
