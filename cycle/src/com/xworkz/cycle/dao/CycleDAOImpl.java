package com.xworkz.cycle.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.cycle.entity.CycleEntity;
import com.xworkz.cycle.entity.SingletonEMF;

public class CycleDAOImpl implements CycleDAO {

	@Override
	public void save(CycleEntity cycleEntity) {
		EntityManager entityManager = null;
		try {
			entityManager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(cycleEntity);
			entityManager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}

	@Override
	public boolean findshop(String product, String city) {
		try {
			EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			Query query = manager.createNamedQuery("mycycle");
			query.setParameter("pr", product);
			query.setParameter("ct", city);
			query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();

		}
		return false;

	}

	@Override
	public boolean findByCompany(String location) {
		try {
			EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			Query query = manager.createNamedQuery("mycycle");
			query.setParameter("loce", location);
			query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();

		}
		return false;

	}

}
