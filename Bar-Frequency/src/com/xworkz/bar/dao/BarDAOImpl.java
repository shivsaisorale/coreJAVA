package com.xworkz.bar.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.bar.entity.BarEntity;
import com.xworkz.emf.util.SingletonEMF;

public class BarDAOImpl implements BarDAO {

	@Override
	public void save(BarEntity barEntity) {

		EntityManager manager = null;

		try {
			manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(barEntity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();

			}

		}
	
	}
}
