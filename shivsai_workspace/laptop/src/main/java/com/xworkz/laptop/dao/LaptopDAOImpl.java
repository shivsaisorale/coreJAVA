package com.xworkz.laptop.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.laptop.entity.LaptopEntity;

@Component
public class LaptopDAOImpl implements LaptopDAO {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public LaptopDAOImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public boolean LaptopDTO(Object object) {
		
			EntityManager manager = this.entityManagerFactory.createEntityManager();
			try {
			manager.getTransaction().begin();
			manager.persist(object);
			manager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			if (manager != null) {
				manager.close();
			}
		}
			return false;
		}

	@Override
	public void save(LaptopEntity entity) {
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