package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tourscanner.util.EMFUtil;
import com.xworkz.website.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO {

	@Override
	public void save(WebsiteEntity websiteEntities) {

		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(websiteEntities);
		transaction.commit();
		
	}

	@Override

	public WebsiteEntity getByNameGoogle(WebsiteEntity entity) {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query=manager.createNamedQuery("getByNameGoogle");
			Object obj=query.getSingleResult();
			WebsiteEntity entity2=(WebsiteEntity) obj;
			return entity;
		
	}
		catch (PersistenceException e) {
			{
				e.getStackTrace();
			}
			return null;
		}
	@Override
	public WebsiteEntity getByLinkUrlx() {
		EntityManager manager2=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getByLikeUrlx");
			Object obj =query.getSingleResult();
			WebsiteEntity entity2=(WebsiteEntity) obj;
		}catch(PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public WebsiteEntity getByMinSince() {
		EntityManager manager2=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getByMinSince");
			Object obj =query.getSingleResult();
			WebsiteEntity entity2=(WebsiteEntity) obj;
		}catch(PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	
	
	}
	@Override
	public WebsiteEntity getByMaxSince() {
		EntityManager manager2=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getByMaxSince");
			Object obj =query.getSingleResult();
			WebsiteEntity entity2=(WebsiteEntity) obj;
		}catch(PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	
	
	}
}
	
}
