package com.xworkz.internet;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JioInternet implements Internet {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public JioInternet(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;

	}

	@Override
	public void connect() {
		
		System.out.println("conncting using airtel");
	}
}
