package com.xworkz.laptop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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
	public boolean saveLaptopEntity(Object obj) {
		System.out.println("invoked saveLaptopEntity()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(obj);
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

	@Override
	public LaptopEntity findByName(String name) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			return (LaptopEntity) query.getSingleResult();

		} finally {
			manager.close();

		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LaptopEntity> getAll() {
		System.out.println("Invoked getAll()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("getAll");

			return (List<LaptopEntity>) query.getResultList();

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
	public LaptopEntity upadteByName(LaptopEntity entity) {
		System.out.println("invoked update repository");

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			manager.getTransaction().begin();
			Query query = manager.createNamedQuery("upadteByName");

			query.setParameter("nm", entity.getLaptopName());
			query.setParameter("qty", entity.getLaptopBrand());
			query.setParameter("ps", entity.getLaptopColor());
			query.setParameter("ty", entity.getLaptopPrice());
			query.setParameter("bnd", entity.getLaptopRAM());
			query.setParameter("bnd", entity.getLaptopROM());

			Object obj = query.executeUpdate();
			transaction.commit();

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return LaptopDAO.super.upadteByName(entity);
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