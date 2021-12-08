package com.xworkz.crud;

public class RestaurantStarter {

	private String Udapi ;
	private String[] hotelNames = new String[8];
	private int count = 0;

	public RestaurantStarter() {
		this("Indian");
		System.out.println("Invoked crudopertion no-arg const");
	}

	public RestaurantStarter(String Udapi) {
		this.Udapi = Udapi;
		System.out.println("Invoked BeachOpertor string const");
	}

	public String getwhisky() {
		return Udapi;
	}

	public void addhotelName(String name) {
		System.out.println("invoked addhotelName");
		System.out.println("Name of arg passed is :".concat(name));
		if (this.count < 8) {
			this.hotelNames[this.count] = name;
			this.count++;
		} else {
			System.err.println("array is full,cannot add ");
		}
	}

	public void displayhotelName() {
		System.out.println("invoked displaywhiskyName");
		for (int rice = 0; rice < this.hotelNames.length; rice++) {
			String name = this.hotelNames[rice];
			System.out.println(name);
		}
	
	

}
	
}
