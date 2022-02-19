package com.xworkz.coffeday.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffeday.entity.CoffeDayEntity;
@Component
public class CoffeDayRepoImpl implements CoffeDayRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public CoffeDayRepoImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;

	}

	@Override
	public void save(CoffeDayEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null)
				manager.close();
		}
	}

}
