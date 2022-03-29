package com.xworkz.groceryapplication.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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
			
		} finally {
			if (manager != null) {
				manager.close();
			}
			
		}
	}
	@Override
		public GroceryEntity findByName(String name) {
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		Query query=entityManager.createNamedQuery("findByname");
				query.setParameter("nm", name);
		return (GroceryEntity)query.getSingleResult();
		}

	@SuppressWarnings("unchecked")
	@Override
	public List<GroceryEntity> getAll() {
		System.out.println("Invoked getAll()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("getAll");

			return (List<GroceryEntity>) query.getResultList();

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
	public boolean deleteByName(String name) {
		System.out.println("Invoked deleteGroceryByName()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		try {
			manager.getTransaction().begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nm", name);

			query.executeUpdate();
			transaction.commit();

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}

		}
		return false;
	}
}
