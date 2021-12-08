package com.xworkz.current.button;

public class Headset {

	private String brand;
	private String battery;
	private String warranty;
	private Object Headset;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Ipod");
		return"its two string";
		}
	@Override
	public int hashCode() {
		System.out.println("Invoked tostring from watch");
		return 300;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("good u r not paasing null");

			if (obj instanceof Headset) {
				System.out.println("thats right you passed watch type ref only");
				Headset casted = (Headset) obj;
				String checkWith = casted.getBattery();
				if (this.Headset.equals(checkWith)) {
					System.out.println("the model no.is found both Headset are same");
					return true;
				} else {
					System.out.println("just miss model no.is not matching ");
				}
			} else {

				System.err.println("the value that you passed is not a instance of Headset");
			}

		}
		return false;
	}

}

	

