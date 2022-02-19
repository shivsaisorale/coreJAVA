package com.xworkz.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.adress.Adress;

@Component
public class AmazonECommerce implements ECommerce {

	private String registeredOffice;
	private int noOfEmployees;
	
	@Autowired
	private Adress adress1;

	public AmazonECommerce(Adress adress1) {
		this.adress1 = adress1;
	}

	@Override
	public void orderitem(String item) {
		System.out.println("order item conform");
	}

	@Override
	public void cancelItem(String item) {
		System.out.println("cancel conform");
	}

}
