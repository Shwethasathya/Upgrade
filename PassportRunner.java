package com.xworkz.constructor.boot;

import com.xworkz.constructor.cons.Passport;

public class PassportRunner {

	public static void main(String[] args) {

		Passport passport = new Passport();

		System.out.println("started passport class");

		passport = new Passport(265);
		System.out.println(passport.number);
		
		System.out.println("                                    ");
		passport = new Passport("holo");
		System.out.println(passport.name);
		
		System.out.println("                                    ");
		passport = new Passport(256, "holo");
		System.out.println(passport.number);
		System.out.println(passport.name);

		System.out.println("                                    ");
		passport = new Passport("name", 265);
		System.out.println(passport.number);
		System.out.println(passport.name);

		System.out.println("                                    ");
		passport = new Passport(265, "halo", "26-03", "India", 27, 10);
		System.out.println(passport.number);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		System.out.println(passport.noOfLeafs);

		System.out.println("                                    ");
		passport = new Passport(256, 10, "India");
		System.out.println(passport.number);
		System.out.println(passport.country);
		System.out.println(passport.noOfLeafs);

		System.out.println("                                    ");
		passport = new Passport("India", "holo", 26);
		System.out.println(passport.number);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		System.out.println("                                    ");
		passport = new Passport(325, "India", 5);
		System.out.println(passport.number);
		System.out.println(passport.country);
		System.out.println(passport.noOfLeafs);

	}

}
