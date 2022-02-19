package com.xworkz.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.adress.Adress;

import com.xworkz.ecommerce.ECommerce;

@Component
public class Customer {
	@Value("shivsai")
	private String name;
	Adress adress;
	ECommerce ecommerce;

	@Autowired
	@Qualifier("abstrctAddress")
	private Adress address;

	public Customer(Adress address) {
		this.address = address;
	}
	

	
	public void order(String item) {
		this.address.displayDetails();
		this.ecommerce.orderitem(item);

	}
}
