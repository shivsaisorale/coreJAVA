package com.xworkz.productdao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.emfutil.SingletonEMF;
import com.xworkz.productentity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void save(ProductEntity entity) {
		EntityManager entityManager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();// write op
		entityTransaction.begin();//
		entityManager.persist(entity);
		entityTransaction.commit();
	}

	@Override
	public List<ProductEntity> saveAll(List<ProductEntity> entities) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		for (ProductEntity productEntity : entities) {
			manager.persist(productEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 10; i++) {
					if (flushcount == 5) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}

			transaction.commit();

		}
		return entities;

	}

	@Override
	public ProductEntity getByMaxPrice() {

		EntityManager manager = null;
		try {
			manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			Query query = manager.createNamedQuery("getMaxPrice");
			return (ProductEntity) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;

	}

	@Override
	public List<ProductEntity> getAll(List<ProductEntity> entities) {

		{
			EntityManager manager = null;
			try {
				manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
				Query query = manager.createNamedQuery("getAll");
				return (List<ProductEntity>) query.getResultList();
			} catch (PersistenceException e) {
				e.printStackTrace();
			} finally {
				if (manager != null) {
					manager.close();
				}
			}
			return null;
		}
	}

	@Override
	public ProductEntity getByBrand(String brand) {

		{
			EntityManager manager = null;
			try {
				manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
				Query query = manager.createNamedQuery("getByBrand");
				query.setParameter("bybrand", brand);
				return (ProductEntity) query.getSingleResult();

			} catch (PersistenceException e) {
				e.printStackTrace();
			} finally {
				if (manager != null) {
					manager.close();
				}
			}
			return null;
		}

	}

	@Override
	public String getBrandByName(String name) {

		{
			EntityManager manager = null;
			try {
				manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
				Query query = manager.createNamedQuery("getBrandByName");
				query.setParameter("name", name);
				return (String) query.getSingleResult();
			} catch (PersistenceException e) {
				e.printStackTrace();
			} finally {
				if (manager != null) {
					manager.close();
				}
			}
			return null;

		}

	}

	@Override
	public ProductEntity getTotalPrice() {

		EntityManager manager = null;
		try {
			manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
			Query query = manager.createNamedQuery("getMaxPrice");
			return (ProductEntity) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

}
