package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.bar.entity.BarEntity;
import com.xworkz.emf.util.SingletonEMF;

public class BarDAOImpl implements BarDAO {

	@Override
	public void save(BarEntity entity) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			
			transaction.begin();

			manager.persist(entity);

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}

			transaction.commit();
		}
	}
}
