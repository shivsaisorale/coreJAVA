package com.xworkz.adress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HomeAddress extends Abstrct0Address implements Adress {

	public HomeAddress() {
		System.out.println("shotting on homeaddress");
	}



	@Override
	@Value("mejestic")
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	@Value("100")
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	@Override
	@Value("nammabengalore")
	public void setCity(String city) {
		this.city = city;

	}
	@Override
	public void displayDetails() {

		System.out.println("home adress");

		System.out.println(super.getCity());
		System.out.println(super.getDoorNo());
		System.out.println(super.getStreet());

	}

}
