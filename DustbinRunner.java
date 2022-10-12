package com.xworkz.travel.boot;

import com.xworkz.travel.rain.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		
		Dustbin dustbin = new Dustbin();
		
		System.out.println("entered sustbin class");
		
		dustbin.material = "stainless steel";
		dustbin.price = 500;
		dustbin.manufacturedCompany = "amazon";
		dustbin.shape = "long cylinder";
		dustbin.quality = "good";
		dustbin.colour = "silver";
		dustbin.brand = "OPR";
		dustbin.location = "Bangalore";
		dustbin.capacity= 5;
		
		System.out.println("material : "+dustbin.material);
		System.out.println("price : "+dustbin.price);
		System.out.println("company :"+dustbin.manufacturedCompany);
		System.out.println("shape : "+dustbin.shape);
		System.out.println("quality : "+dustbin.quality);
		System.out.println("colour : "+dustbin.colour);
		System.out.println("brand : "+dustbin.brand);
		System.out.println("location : "+dustbin.location);
		System.out.println("capacity : "+dustbin.capacity);
		
		System.out.println("                         ");
	
		System.out.println("size : "+dustbin.size);
		System.out.println("weight : "+dustbin.weight);
		System.out.println("height : "+dustbin.height);
		System.out.println("special feature : "+dustbin.specialFeature);
		System.out.println("opening mechanism : "+dustbin.openingMechanism);
		System.out.println("removable : "+dustbin.removableBin);
		System.out.println("finish type :"+dustbin.finishType);
		System.out.println("country origin : "+dustbin.originCountry);
		System.out.println("width of dustbin : "+dustbin.width);
		System.out.println("item partnumber : "+dustbin.itemPartNumber);
	}

}