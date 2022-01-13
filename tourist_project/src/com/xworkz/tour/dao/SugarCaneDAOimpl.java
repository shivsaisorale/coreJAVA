package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.SugarCaneEntity;
import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tourscanner.util.EMFUtil;

public class SugarCaneDAOimpl implements SugarCaneDAO {
	public void put(SugarCaneEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();

	}

}
