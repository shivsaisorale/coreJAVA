package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.emf.util.SingletonEMF;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorDAOImpl implements VendorDAO {

	@Override
	public void save(VendorEntity entity) {
		EntityManager entityManager = null;
		try {
			entityManager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (entityManager != null)
				entityManager.close();
		}

	}

}
