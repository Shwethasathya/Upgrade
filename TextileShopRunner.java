package com.xworkz.constructor.boot;

import com.xworkz.constructor.cons.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {

		TextileShop shop = new TextileShop("Ramesh");
		System.out.println(shop.ownerName);

		shop = new TextileShop("Ramesh", "lakshmi");
		System.out.println(shop.ownerName);
		System.out.println(shop.ownerWifeName);

		shop = new TextileShop("Ramesh", "Lakshmi", "leela", 9807126790L);
		System.out.println(shop.ownerName);
		System.out.println(shop.ownerWifeName);
		System.out.println(shop.ownerDaughterName);
		System.out.println(shop.ownerDaughterNumber);

		shop = new TextileShop("Ramesh", "Lakshmi", "leela", 9807126790L, 1);
		System.out.println(shop.ownerName);
		System.out.println(shop.ownerWifeName);
		System.out.println(shop.ownerDaughterName);
		System.out.println(shop.ownerDaughterNumber);
		System.out.println(shop.ownersNoOfWifes);

		shop = new TextileShop("Ramesh", "Lakshmi", "leela", 9807126790L, 1, 255);
		System.out.println(shop.ownerName);
		System.out.println(shop.ownerWifeName);
		System.out.println(shop.ownerDaughterName);
		System.out.println(shop.ownerDaughterNumber);
		System.out.println(shop.ownersNoOfWifes);
		System.out.println(shop.shopNo);

		shop = new TextileShop("Ramesh", "Lakshmi", 7654090121L);
		System.out.println(shop.ownerName);
		System.out.println(shop.ownerWifeName);
		System.out.println(shop.contactNo);

		shop = new TextileShop("Ramesh", "Lakshmi", "leela", 7654090121L, 87900423012L);
		System.out.println(shop.ownerName);
		System.out.println(shop.ownerWifeName);
		System.out.println(shop.ownerDaughterNumber);
		System.out.println(shop.contactNo);

		shop = new TextileShop(7688099092L, 9006532190L);
		System.out.println(shop.ownerDaughterNumber);
		System.out.println(shop.contactNo);
	}

}
