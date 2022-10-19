package com.xworkz.instance.inst;

public class Furniture {

	public double price = 2500;
	public String brand = "Ikea";
	public boolean goodQuality = true;
	public String material = "wood";
	public String finishing = "good";

	public String[] availableBrands;
	public String[] colors;
	public String[] styles;
	public String[] furnitureType;
	public String[] size;

	public Furniture(String[] availableBrands, String[] colors, String[] styles, String[] furnitureTypes,
			String[] size) {
		this.availableBrands = availableBrands;
		this.colors = colors;
		this.styles = styles;
		this.furnitureType = furnitureType;
		this.size = size;

		System.out.println("constructors using array type");
	}

	public void display() {
		for (int index = 0; index < availableBrands.length; index++) {
			String str = availableBrands[index];
			System.out.println("available brands " + str);
		}

		for (int index = 0; index < colors.length; index++) {
			String color = colors[index];
			System.out.println("available colors are " + color);
		}

		for (int index = 0; index < styles.length; index++) {
			String style = styles[index];
			System.out.println("available styles are " + styles);
		}

		for (int index = 0; index < furnitureType.length; index++) {
			String furniture = furnitureType[index];
			System.out.println("type " + furnitureType);

		}
		for (int index = 0; index < size.length; index++) {
			String ref = size[index];
			System.out.println("available sizes " + ref);
		}

		System.out.println("price" + price);
		System.out.println("brand" + brand);
		System.out.println("quality" + goodQuality);
		System.out.println("material" + material);
		System.out.println("finishing" + finishing);
	}

}
