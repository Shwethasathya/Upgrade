package com.xworkz.constructor.boot;

import com.xworkz.constructor.cons.Chain;

public class ChainRunner {

	public static void main(String[] args) {

		Chain chain = new Chain("dog chain", 500, 30, "stainless steel", 50);
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.weight);

		chain = new Chain("ankel chain", 1500, 8, "silver");
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);

		chain = new Chain("neck chian", 15000, 6);
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);

		chain = new Chain("ankel chain", 2000, true);
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.fresh);

		chain = new Chain("ankel chain");
		System.out.println(chain.type);

		chain = new Chain("neck chain", false);
		System.out.println(chain.type);
		System.out.println(chain.stolen);

		chain = new Chain(false, "dogs", true);
		System.out.println(chain.usedFor);
		System.out.println(chain.stolen);
		System.out.println(chain.fresh);
	}

}
