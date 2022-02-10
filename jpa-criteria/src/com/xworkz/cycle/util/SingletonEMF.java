package com.xworkz.cycle.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;


public class SingletonEMF {

	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	static {

		entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	}
	

}
