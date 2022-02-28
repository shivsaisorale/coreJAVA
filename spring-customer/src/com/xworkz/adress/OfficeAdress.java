package com.xworkz.adress;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OfficeAdress extends Abstrct0Address implements Adress {

	public OfficeAdress() {
		System.out.println("shotting on officeadress");
	}

		@Override
	public void displayDetails() {

		System.out.println("home adress");

		System.out.println(super.getCity());
		System.out.println(super.getDoorNo());
		System.out.println(super.getStreet());

	}

	@Override
	@Value("${office.street}")
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	@Value("${office.doorNo}")
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	@Override
	@Value("${office.city}")
	public void setCity(String city) {
		this.city = city;

	}

}
