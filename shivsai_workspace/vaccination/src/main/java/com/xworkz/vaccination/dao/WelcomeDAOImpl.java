package com.xworkz.vaccination.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.xworkz.vaccination.entity.WelcomeEntity;
@Component
public class WelcomeDAOImpl implements WelcomeDAO{

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public WelcomeDAOImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
		System.out.println(this.getClass().getSimpleName()+"bean crtated");
	}

	@Override
	public boolean saveWelcomeEntity(WelcomeEntity entity) {
		System.out.println("invoked saveLaptopEntity()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			if (manager != null) {
				System.out.println("Data saved");
				manager.close();
			} else {
				System.out.println("Data not saved");

			}

		}
		return false;

	}

	

}
