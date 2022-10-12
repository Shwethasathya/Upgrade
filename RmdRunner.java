package com.xworkz.travel.boot;

import com.xworkz.travel.rain.Rmd;

public class RmdRunner {

	public static void main(String[] args) {
		
		Rmd rmd = new Rmd();
		
		System.out.println("entered RMD class");
		
		rmd.factoryLocation = "pune";
		rmd.foundedYear = 1991;
		rmd.goodForHealth = false;
		rmd.brandAmbassador = "Moiz Miya";
	
		System.out.println(rmd.factoryLocation);
		System.out.println(rmd.foundedYear);
		System.out.println(rmd.goodForHealth);
		System.out.println(rmd.brandAmbassador);
		
		System.out.println("________________////________________");
		
		System.out.println(rmd.brand);
		System.out.println(rmd.ingredient);
		System.out.println(rmd.price);
		System.out.println(rmd.weight);
		System.out.println(rmd.quantity);
		System.out.println(rmd.manufacturedDate);
		System.out.println(rmd.expiryDate);
		System.out.println(rmd.ownerName);
	}

}
