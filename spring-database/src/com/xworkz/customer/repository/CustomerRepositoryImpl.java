package com.xworkz.customer.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import com.xworkz.custumer.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	private EntityManagerFactory entityManagerFactory;

	public CustomerRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(CustomerEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();

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
