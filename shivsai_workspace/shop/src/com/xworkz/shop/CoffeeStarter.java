package com.xworkz.shop;

import com.xworkz.shop.curdopartion.Coffee;
import com.xworkz.shop.curdopartion.Labour;

public class CoffeeStarter {

	public static void main(String[] args) {

		
		Coffee coffee=new Coffee();
		coffee.addcoffeeNames("latte");
		coffee.addcoffeeNames("mocha");
		coffee.addcoffeeNames("espresso");
		coffee.addcoffeeNames("american");
		coffee.addcoffeeNames("flat white");
		coffee.addcoffeeNames("affogato");
		coffee.addcoffeeNames("yodiroppa");
		coffee.addcoffeeNames("iced coffee");
		coffee.addcoffeeNames("ristretto");
			
			coffee.delete(2);
		
			String[] array = coffee.getcoffeeNames();
			for(int i=0; i<array.length; i++) {
				System.out.println(array[i]);
			}
			
	}

}
