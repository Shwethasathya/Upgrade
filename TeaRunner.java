package com.xworkz.travel.boot;

import com.xworkz.travel.rain.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		
		System.out.println("Started");
		
		Tea tea = new Tea();
		
		
		tea.companyName = "lipton";
		System.out.println(tea.companyName);
		
		tea.companyFounder = "Sir Thomas Lipton";
		System.out.println(tea.companyFounder);
		
		tea.establishedDate = 1890;
		System.out.println(tea.establishedDate);
		
		tea.compOwner = "Ekaterra";
		System.out.println(tea.compOwner);
		
		tea.location = "India";
		System.out.println(tea.location);
		
		System.out.println("**********************************");
		System.out.println("product details");
		
		tea.ingredients = "High Fructose Corn Syrup, Citric Acid, Natural Flavor";
		System.out.println(tea.ingredients);
		
		tea.manufactureDate = "12-05-2022";
		System.out.println(tea.manufactureDate);
		
		tea.expireDate = "12-05-2023";
		System.out.println(tea.expireDate);
		
		
		System.out.println(tea.color);
		System.out.println(tea.price);
		System.out.println(tea.quantity);
		System.out.println(tea.taste);
		System.out.println(tea.type);
		System.out.println(tea.packing);
		System.out.println(tea.grownIn);
		System.out.println(tea.origin);
		System.out.println(tea.flavour);
		
	}

}

