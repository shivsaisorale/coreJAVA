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

	public void put(AirportDAOimpl entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		int flushCount = 0;
		try {
			for (int i = 0; i < 20; i++) {
				if (flushCount == 5) {
					entityManager.flush();
					flushCount = 0;
					entityManager.clear();
				}
				entityManager.flush();
				flushCount++;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
			tx.rollback();
		}

		tx.commit();
	}

	public void putAll(List<AirportEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (AirportEntity tourEntity : entities) {
			manager.persist(tourEntity);

			EntityTransaction tx = manager.getTransaction();

			tx.begin();

			int flushCount = 0;
			try {
				for (int i = 0; i < 20; i++) {
					if (flushCount == 5) {
						manager.flush();
						flushCount = 0;
						manager.clear();
					}
					manager.flush();
					flushCount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				tx.rollback();
			}

			tx.commit();
		}
	}

}
