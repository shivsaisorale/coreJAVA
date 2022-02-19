package com.xworkz.adress;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OfficeAdress extends Abstrct0Address implements Adress {

	
		
	@Autowired
	private Adress address;

	public OfficeAdress(Adress address) {
		this.address = address;
	}

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public OfficeAdress(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	

	@Override
	public void displayDetails() {
		
		System.out.println("home adress");
		 
			System.out.println(super.getCity());
			System.out.println(super.getDoorNo());
			System.out.println(super.getStreet());
		
	}

}
