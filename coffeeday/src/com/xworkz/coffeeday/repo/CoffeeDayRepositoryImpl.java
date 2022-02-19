package com.xworkz.coffeeday.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;

@Component
public class CoffeeDayRepositoryImpl implements CoffeeDayRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public CoffeeDayRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;

	}

	@Override
	public void save(CoffeeDayEntity entity) {
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
