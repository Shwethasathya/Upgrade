package com.xworkz.instance.boot;

import com.xworkz.instance.inst.Watch;

public class WatchRunner {

	public static void main(String[] args) {
		
		String[] feature = {"calling","bluetooth","music"};
		String[] colors = {"black","silver"};
		String[] typeOfWatchs = {"band", "cahin", "belt"};
		boolean[] quality = {true, false};
		String[] watchMovement = {"fixed", "rotatable"};
		boolean[] fresh = {true, false};
		
		Watch watch = new Watch(feature,colors,typeOfWatchs,quality,watchMovement,fresh);
		System.out.println(watch);
		System.out.println(watch.name);
		System.out.println(watch.brand);
		System.out.println(watch.price);
		
		watch.display();
		
		
	}

}
