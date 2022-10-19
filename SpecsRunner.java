package com.xworkz.instance.boot;

import com.xworkz.instance.inst.Specs;

public class SpecsRunner {

	public static void main(String[] args) {
		
		
		 String[] lensTypes= {"progressive lens","bifocals"};
		 String[] seller= {"specsmakers","lenskart"};
		 String[] type= {"singal vision","trifocals","toric"};
		 String[] shapes= {"rectangal","oval","square"};
		 String[] colors= {"black","blue","brown"};
		 String[] brands= {"specsmakers","titan","ray ban"};

		 Specs spec = new Specs(1500,true,2,false,"titan",lensTypes,seller,type,shapes,colors,brands);
		 spec.display();
	}

}
