package day42_custom_classes_03;

import java.util.*;


public class Starbucks {

	public static void main(String[] args) {

		Coffee[] coffeeArray = new Coffee[2];

		coffeeArray[0] = new Coffee();
		coffeeArray[0].setCoffeeInfo("ESPRESSO", "TALL", 2.55, 7);
		coffeeArray[0].getCoffeInfo();

		Coffee latte = new Coffee();
		latte.setCoffeeInfo("CAFE LATTE", "VENTI", 3.85, 190);
		coffeeArray[1] = latte;
		coffeeArray[1].getCoffeInfo();
		
		
		

	}
}
