package com.xworkz.tourscanner.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	static {
		System.out.println("invoked the persistence file");

		entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.tourist_project");

		System.out.println("adding data");
	}

}
