package com.xworkz.product.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.product.entity.ProductEntity;

@Component
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ProductRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
		System.out.println("invoked on manager");
	}

	@Override
	public void save(ProductEntity entity) {

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