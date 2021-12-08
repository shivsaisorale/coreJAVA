package com.xwork.saloon.shop;

public class NaturalSaloon extends Saloon {

		public String name="kiran";
		public int noOfHajamas=5;
		
		public NaturalSaloon() {
			this(5);
			
			System.out.println("this is saloonShop");
		}

		public NaturalSaloon(int noOfHajamas) {
			super();
			System.out.println("name is :"+name);
		}
}
