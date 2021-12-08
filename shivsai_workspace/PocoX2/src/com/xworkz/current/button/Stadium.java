package com.xworkz.current.button;

public class Stadium {

	String name;
	String city;
	int seats;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Stadium");
		return "SSM";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Stadium");
		return 654;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Stadium");
		if(obj!=null) {
			
			if(obj instanceof Stadium) {
				
				Stadium stadium =(Stadium)obj;
				String nameref=stadium.getName();
				String type=stadium.getName();
				System.out.println(nameref+"=====");
				System.out.println(type+"=====");
				
				if(type.equals(nameref) && type.equals(type))

		{
			System.out.println("matched");
			return true;
		}
				
			}
		}
		return false;

	}

	
	

}
