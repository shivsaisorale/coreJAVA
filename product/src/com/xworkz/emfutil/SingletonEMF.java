package com.xworkz.emfutil;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonEMF {

	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	static {

		entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	}

}
