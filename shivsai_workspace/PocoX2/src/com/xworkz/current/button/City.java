package com.xworkz.current.button;

public class City {

	String name;
	String stateName;
	String countryName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
			
			if(obj instanceof City) {
				
				City city =(City)obj;
				String nameref=city.getName();
				String type=city.getName();
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
