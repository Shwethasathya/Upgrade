package com.xworkz.instance.boot;

import com.xworkz.instance.inst.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		
		 String[] colorsAvailable = {"black","white","blue","red"};
		 String[] department= {"t-shirt","hoodie"};
		 String[] style= {"abc","bhs"};
		 String[] material= {"cotton","silk"};
		 String[] neckline= {"round","collar"};
		 String[] sleeves= {"full sleeves","half"};
		 
		 Shirt shirt = new Shirt("cotton",1500,true,"raymond","white",36,colorsAvailable,department,style,material,neckline,sleeves);
		 
		 shirt.display();
				 
				 
	}

}
