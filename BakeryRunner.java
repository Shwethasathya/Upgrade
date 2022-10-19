package com.xworkz.instance.boot;

import com.xworkz.instance.inst.Bakery;

public class BakeryRunner {

	public static void main(String[] args) {
		
		 String[] availableItems= {"coffee","tea","biscuits","icecreams"};
		 String[] typeOfPuffs= {"veg","egg","paneer"};
		 String[] typeOfCakes= {"chacolate","pastery"};
		 String[] icecreamFlavours= {"vennila","strawberry","buuterScotch"};
		 String[] biscuits= {"good day","oreo","tea biscuit"};
		 boolean[] chacolatesAvailable= {true,false};
		
		
		Bakery bakery =new Bakery("iyengar",7511344062L,"magadi road",2,4,availableItems,typeOfPuffs,typeOfCakes,icecreamFlavours,biscuits,chacolatesAvailable);

		bakery.display();

	}

}
