package com.xworkz.instance.boot;

import com.xworkz.instance.inst.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {

		 String[] languagesAvailable = {"kannada","english","hindi"};
		 String[] names = {"prajavani","bangalore mirror","deccan hearald"};
		 String[] publications = {"gannett","new media"};
		 String[] fieldCoverdInNewsPaper= {"sports","advertisments","films"};
		
		NewsPaper news = new NewsPaper("prajavani",6,10,"white","19-10-2022",true);
		
		news.display();
		

	}

}
