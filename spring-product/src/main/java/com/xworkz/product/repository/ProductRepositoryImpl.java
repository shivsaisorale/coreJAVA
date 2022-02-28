package com.xworkz.product.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.product.entity.ProductEntity;
@Component
public class ProductRepositoryImpl implements ProductRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ProductRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(ProductEntity entity) {
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entityManager);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (entityManager != null) {
				entityManager.close();
			}

		}

	}
}
