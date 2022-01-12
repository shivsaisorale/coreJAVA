package com.xworkz.tourscanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TouristScanner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("com.xworkz.tourist_project");
		System.out.println(entityManagerFactory);

	}

}
