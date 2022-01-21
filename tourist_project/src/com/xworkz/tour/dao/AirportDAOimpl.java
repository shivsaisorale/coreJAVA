package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.AirportEntity;
import com.xworkz.tourscanner.util.EMFUtil;

import antlr.debug.TraceAdapter;

public class AirportDAOimpl implements AirportDAO {
	public void put(AirportEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
	}

	@Override
	public void putAll(List<AirportEntity> airport) {
		// TODO Auto-generated method stub
		
	}

	


		

}
