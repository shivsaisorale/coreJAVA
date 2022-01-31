package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.emf.util.SingletonEMF;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorDAOImpl implements VendorDAO {

	@Override
	public void save(VendorEntity entity) {
		EntityManager entityManager = null;
		try {
			entityManager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (entityManager != null)
				entityManager.close();
		}

	}

	@Override
	public boolean findLogin(String loginname, String password) {
		EntityManager entityManager = null;
		try {
			entityManager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			Query query = entityManager.createNamedQuery("getLoginnameAndPassword");
			query.setParameter("ln", loginname);
			query.setParameter("pd", password);
			query.getSingleResult();
			return true;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}

		return false;
	}

	@Override
	public boolean findByEmail(String email) {
		EntityManager entityManager = null;
		try {
			entityManager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			Query query = entityManager.createNamedQuery("findByEmail");
			query.setParameter("ml", email);
			query.getSingleResult();
			return true;

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (entityManager != null)
				entityManager.close();
		}
		return false;
	}

	@Override
	public void updatePasswordByEmail(String email, String pwd) {
		EntityManager entityManager = null;
		try {
			entityManager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("updatePasswordByEmail");
			query.setParameter("em", email);
			query.setParameter("pass", pwd);
			Object obj = query.executeUpdate();
			entityManager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}

}
