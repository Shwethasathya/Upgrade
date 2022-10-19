package com.xworkz.instance.boot;

import com.xworkz.instance.inst.Fan;

public class FanRunner {

	public static void main(String[] args) {
		
		 String[] category = {"cieling fan","table fan"};
		 String[] brands= {"crompton","usha","orient"};
		 String[] seller={"amazon","fli[pkart"};
		 boolean[] energySaving= {true,false};

		 Fan fan = new Fan(2000, 6, "stainless steel", "orient", 4,category,brands,seller,energySaving);
		 
		 fan.display();
	}

}
