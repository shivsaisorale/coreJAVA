package com.xworkz.passport.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import com.xworkz.passport.entity.PassportEntity;

public class PassportRepositeryImpl implements PassportRepositery {

	private EntityManagerFactory entitymangerfactory;

	public PassportRepositeryImpl(EntityManagerFactory entitymangerfactory) {
		this.entitymangerfactory = entitymangerfactory;
	}

	@Override
	public void save(PassportEntity entity) {

		EntityManager manager = this.entitymangerfactory.createEntityManager();

		try {

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
