package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.RailwayStationEntity;
import com.xworkz.tourscanner.util.EMFUtil;

public class RailwayStationDAOImpl implements RailwayStationDAO {

	public void put(RailwayStationEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
	}

	@Override
	public void saveAll(List<RailwayStationEntity> railwayStationEntities) {
		EntityManagerFactory entityManagaerFactory = EMFUtil.getEntityManagerFactory();

		EntityManager manager = entityManagaerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount = 0;
			for (int i = 0; i < 10; i++) {
				if (flushcount == 10) {
					for (RailwayStationEntity railwayStationEntity : railwayStationEntities) {
						manager.persist(railwayStationEntity);
						manager.flush();
						manager.clear();

					}
				}
			}
		} catch (PersistenceException e) {
			transaction.commit();
		}

	}

}
