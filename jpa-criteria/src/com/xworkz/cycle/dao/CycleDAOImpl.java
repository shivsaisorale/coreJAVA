package com.xworkz.cycle.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import java.util.List;

import com.xworkz.cycle.CycleEntity;
import com.xworkz.cycle.util.SingletonEMF;

public class CycleDAOImpl implements CycleDAO {

	@Override
	public void fetchById(int id) {

		try {
			EntityManager entityManagerFactory = SingletonEMF.getEntityManagerFactory().createEntityManager();

			EntityTransaction transaction = entityManagerFactory.getTransaction();

			CriteriaBuilder builder = entityManagerFactory.getCriteriaBuilder();//used to  constrct criteri queries
			CriteriaQuery<CycleEntity> criteriaQuery = builder.createQuery(CycleEntity.class);//it is the type -safe in terms of reff attributs
			Root<CycleEntity> root = criteriaQuery.from(CycleEntity.class);// root=root are define the basic from which 
			criteriaQuery.select(root);
			criteriaQuery.where(builder.equal(root.get("id"),id));
			

			TypedQuery<CycleEntity> query = entityManagerFactory.createQuery(criteriaQuery);
			List<CycleEntity> list = query.getResultList();
			list.forEach(System.out::println);
				for(CycleEntity entity:list) {
					System.out.println(entity.getName());
					System.out.println(entity.getTypes());
					System.out.println(entity.getPrice());
					System.out.println(entity.getCompany());
							
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void fetchByName(String name) {
		try {
			EntityManager entityManagerFactory = SingletonEMF.getEntityManagerFactory().createEntityManager();

			EntityTransaction transaction = entityManagerFactory.getTransaction();

			CriteriaBuilder builder = entityManagerFactory.getCriteriaBuilder();//used to  constrct criteri queries
			CriteriaQuery<CycleEntity> criteriaQuery = builder.createQuery(CycleEntity.class);//it is the type -safe in terms of reff attributs
			Root<CycleEntity> root = criteriaQuery.from(CycleEntity.class);// root=root are define the basic from which 
			criteriaQuery.select(root);
			criteriaQuery.where(builder.equal(root.get("name"),name));
			

			TypedQuery<CycleEntity> query = entityManagerFactory.createQuery(criteriaQuery);
			List<CycleEntity> list = query.getResultList();
			list.forEach(System.out::println);
				for(CycleEntity entity:list) {
					System.out.println(entity.getName());
					System.out.println(entity.getTypes());
					System.out.println(entity.getPrice());
					System.out.println(entity.getCompany());
							
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void fetchByCompany(String company) {
		try {
			EntityManager entityManagerFactory = SingletonEMF.getEntityManagerFactory().createEntityManager();

			EntityTransaction transaction = entityManagerFactory.getTransaction();

			CriteriaBuilder builder = entityManagerFactory.getCriteriaBuilder();//used to  constrct criteri queries
			CriteriaQuery<CycleEntity> criteriaQuery = builder.createQuery(CycleEntity.class);//it is the type -safe in terms of reff attributs
			Root<CycleEntity> root = criteriaQuery.from(CycleEntity.class);// root=root are define the basic from which 
			criteriaQuery.select(root);
			criteriaQuery.where(builder.equal(root.get("company"),company));
			

			TypedQuery<CycleEntity> query = entityManagerFactory.createQuery(criteriaQuery);
			List<CycleEntity> list = query.getResultList();
			list.forEach(System.out::println);
				for(CycleEntity entity:list) {
					System.out.println(entity.getName());
					System.out.println(entity.getTypes());
					System.out.println(entity.getPrice());
					System.out.println(entity.getCompany());
							
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
		
	}

	
}
