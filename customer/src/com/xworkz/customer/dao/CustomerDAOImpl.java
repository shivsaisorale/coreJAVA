package com.xworkz.customer.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.customer.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {

	private EntityManagerFactory entityManagerfactory;

	public CustomerDAOImpl(EntityManagerFactory entityManagerfactory) {
		this.entityManagerfactory = entityManagerfactory;
	}

	@Override
	public void save(CustomerDTO entity) {
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		try {

			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
	}

	@Override
	public boolean findBy(int age) {
		EntityManager manager = this.entityManagerfactory.createEntityManager();
		try {

			Query query = manager.createNamedQuery("age");
			query.setParameter("ln", age);

			query.getSingleResult();
			return true;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null)
				manager.close();
		}

		return false;

	}

	@Override
	public void updateroomNum(String roomnum) {
		EntityManager manager = this.entityManagerfactory.createEntityManager();	
		try {
			
			manager.getTransaction().begin();
			Query query = manager.createNamedQuery("roomnum");
			query.setParameter("rm", roomnum);
	
			Object obj = query.executeUpdate();
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (manager != null)
				manager.close();
		}
	
	}
}
		
	


