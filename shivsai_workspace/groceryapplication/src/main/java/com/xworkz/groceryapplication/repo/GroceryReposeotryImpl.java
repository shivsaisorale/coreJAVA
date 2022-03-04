package com.xworkz.groceryapplication.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.groceryapplication.entity.GroceryEntity;
@Component
public class GroceryReposeotryImpl implements GroceryReposetory {
@Autowired
	private EntityManagerFactory entityManagerFactory;

	public GroceryReposeotryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(GroceryEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();

		try {
			manager.getTransaction().begin();

			manager.persist(entity);
			manager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

}
