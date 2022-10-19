package com.xworkz.instance.boot;

import com.xworkz.instance.inst.Furniture;

public class FurnitureRunner {

	public static void main(String[] args) {
		
		 String[] availableBrands = {"ikea", "flipkart"};
		 String[] colors = {"white", "black"};
		 String[] styles = {"cushon", "wood"};
		 String[] furnitureType = {"sofa", "chair"};
		 String[] size = {"small", "medium", "large"};
	
		
		
	Furniture furniture = new Furniture(availableBrands, colors, styles, furnitureType, size);
	
	furniture.display();



	
	}

}
