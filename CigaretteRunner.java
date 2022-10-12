package com.xworkz.travel.boot;

import com.xworkz.travel.rain.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {
		
		System.out.println("entterd cigarette");
		
		Cigarette cigaratte = new Cigarette();
		
		System.out.println(cigaratte.chemical);
		System.out.println(cigaratte.companyName);
		System.out.println(cigaratte.foundedOn);
		System.out.println(cigaratte.headQuarter);
		System.out.println(cigaratte.chairman);
		System.out.println(cigaratte.noOfEmployees);
		System.out.println(cigaratte.salesGrowth);
		System.out.println(cigaratte.productProduced);
		
		System.out.println("-------------///////////////------------------");
		System.out.println("product details");
		System.out.println("             ");
		
		cigaratte.name = "Gold flake";
		cigaratte.price = 25;
		cigaratte.colour = "white";
		cigaratte.shape = "Narrow Cylinder";
		cigaratte.size = 7.5f;
		cigaratte.isManufacturedInIndia = true;
		cigaratte.sideEffects = "lung disease";
		cigaratte.brand = "Marlboro";
		cigaratte.ingredients = "arsenic, nicotine,..";
		
			
		System.out.println(cigaratte.name);
		System.out.println(cigaratte.price);
		System.out.println(cigaratte.colour);
		System.out.println(cigaratte.shape);
		System.out.println(cigaratte.size);
		System.out.println(cigaratte.isManufacturedInIndia);
		System.out.println(cigaratte.sideEffects);
		System.out.println(cigaratte.brand);
		System.out.println(cigaratte.ingredients);
	}

}
