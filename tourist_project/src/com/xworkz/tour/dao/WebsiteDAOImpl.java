package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

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

}
