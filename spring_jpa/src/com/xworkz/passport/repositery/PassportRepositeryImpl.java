package com.xworkz.passport.repositery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.passport.constant.SingletonEMF;
import com.xworkz.passport.entity.PassportEntity;

public class PassportRepositeryImpl implements PassportRepositery {
	
	
	
	@Override
	public void save(PassportEntity entity) {

		EntityManager manager = null;

		try {
			manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (manager != null) {
				manager.close();
			}

		}
	}

}
