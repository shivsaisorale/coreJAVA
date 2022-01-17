package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.RailwayStationEntity;
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

	@Override
	public void putAll(List<TouristEntity> railwayStationEntities) {
		EntityManagerFactory entityManagaerFactory = EMFUtil.getEntityManagerFactory();

		EntityManager manager = entityManagaerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount = 0;
			for (int i = 0; i < 10; i++) {
				if (flushcount == 10) {
					for (TouristEntity railwayStationEntity : railwayStationEntities) {
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

	@Override
	public void put(List<TouristEntity> touristEntity) {
		// TODO Auto-generated method stub
		
	}

}
