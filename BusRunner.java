package com.xworkz.travel.boot;

import com.xworkz.travel.rain.Bus;
import com.xworkz.travel.rain.Chacolate;
import com.xworkz.travel.rain.Developer;
import com.xworkz.travel.rain.DistrictCollector;
import com.xworkz.travel.rain.Song;



public class BusRunner {

	public static void main(String[] args) {
		
		System.out.println("started");
		
		Bus travel = new Bus();
		System.out.println("bus number "+travel.number);
		
		travel.number=1234;
		System.out.println("bus number "+travel.number);
		
		Bus source = new Bus();
		System.out.println("source is "+source.starting);
		
		source.starting="Bangalore";
		System.out.println("source is "+source.starting);

		Bus end = new Bus();
		System.out.println("end is "+end.destination);
		
		end.destination="Mysore";
		System.out.println("ending poiont is "+end.destination);
		
		
		
		System.out.println("entered District Collector class");
		
		DistrictCollector collector = new DistrictCollector();
		System.out.println("DC name is "+collector.name);
		
		DistrictCollector ref = new DistrictCollector();
		System.out.println("Dc age is "+ref.age);
		
		DistrictCollector ref1 = new DistrictCollector();
		System.out.println(" District is "+ref1.district);
		
		DistrictCollector ref2 = new DistrictCollector();
		System.out.println("Batch number is "+ref2.batch);
		
		collector.name = "shwetha";
		ref.age = 28;
		ref1.district = "Bangalore";
		ref2.batch = 89;
		
		System.out.println("DC name is "+collector.name);
		System.out.println("Dc age is "+ref.age);
		System.out.println(" District is "+ref1.district);
		System.out.println("Batch number is "+ref2.batch);
		
		System.out.println("*************");
		System.out.println("Entered Chacolate class");
		
		Chacolate chaco = new Chacolate();
		System.out.println("name of chacolate : "+chaco.name);
		
		Chacolate sweet = new Chacolate();
		System.out.println("chacolate brand : "+chaco.brand);
		
		Chacolate  brand1 = new Chacolate();
		System.out.println("chacolate price : "+chaco.price);
		
		Chacolate flavoured = new Chacolate();
		System.out.println("chacolate flavour : "+chaco.flavour);
		
		chaco.name = "Cone";
		sweet.brand = "nandhini";
		brand1.price = 45;
		flavoured.flavour = "venilla";
		
		System.out.println("name of chacolate : "+chaco.name);
		System.out.println("chacolate brand : "+sweet.brand);
		System.out.println("chacolate price : "+brand1.price);
		System.out.println("chacolate flavour : "+flavoured.flavour);
		
		System.out.println("******************");
		System.out.println("Entered Music");
		
		Song sing = new Song();
		System.out.println("Song name : "+sing.name);
		
		Song ref11 = new Song();
		System.out.println("song language : "+ref11.language);
		
		Song sung = new Song();
		System.out.println("singer is : "+sung.singer);
		
		Song lyrics = new Song();
		System.out.println("lyricist is : "+lyrics.lyricist );
		
		Song janour = new Song();
		System.out.println("type of song is : "+janour.type);
		
		sing.name = "Neenade naa";
		ref11.language = "Kannada";
		sung.singer = "Arnam mallik, Shreya ghoshal";
		lyrics.lyricist = "Ghouse peer";
		janour.type = "melody";
		
		System.out.println("Song name : "+sing.name);
		System.out.println("song language : "+ref11.language);
		System.out.println("singer is : "+sung.singer);
		System.out.println("lyricist is : "+lyrics.lyricist);
		System.out.println("type of song is : "+janour.type);
		
		System.out.println("*************");
		System.out.println("Entered Developer class");
		
		Developer develop = new Developer();
		System.out.println("name :"+develop.name);
		
		Developer edu = new Developer();
		System.out.println("education :"+edu.education);
		
		Developer exp = new Developer();
		System.out.println("eexperiance :"+exp.experiance);
		
		Developer sal = new Developer();
		System.out.println("salary :"+sal.salary);
		
		Developer comp = new Developer();
		System.out.println("company :"+comp.company);
		
		develop.name = "Shwetha";
		edu.education = "Engineering";
		exp.experiance = 2;
		sal.salary = 6;
		comp.company = "capgemimi";
		
		System.out.println("name :"+develop.name);
		System.out.println("education :"+edu.education);
		System.out.println("eexperiance :"+exp.experiance);
		System.out.println("salary :"+sal.salary);
		System.out.println("company :"+comp.company);
		
	}

}

