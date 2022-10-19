package com.xworkz.instance.boot;

import com.xworkz.instance.inst.Hotel;

public class HotelRunner {

	

	public static void main(String[] args) {
		
		 String[] menu= {"dosa","idli","pongal"};
		 String[] branches= {"vijaynagr","jaynagar"};
		 String[] employeeNames= {"ramesh","suresh"};
		 String[] mainIngredients= {"salt","rice","sambar powder","water"};

		 Hotel hotel = new Hotel("krishna", "yes", 10, 15,"1989",menu,branches,employeeNames,mainIngredients);
				 
				 hotel.display();
	}

}
