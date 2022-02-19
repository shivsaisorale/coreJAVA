package com.xworkz.adress;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class HomeAddress extends Abstrct0Address implements Adress {

	public void setValues() {
		List<String> values;
		this.setValues();
	}

	@Autowired
	private Adress address;

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public HomeAddress() {
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
