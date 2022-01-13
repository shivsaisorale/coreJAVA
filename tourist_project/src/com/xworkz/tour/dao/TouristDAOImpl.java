package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tourscanner.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO {

	public void put(TouristEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction tran = entityManager.getTransaction();
		tran.begin();
		entityManager.persist(entity);
		tran.commit();

	}

}
