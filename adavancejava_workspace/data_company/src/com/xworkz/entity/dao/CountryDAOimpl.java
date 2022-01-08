package com.xworkz.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.CountryEntity;

public class CountryDAOimpl implements CountryDAO {

	@Override
	public void create(CountryEntity entity) {
		System.out.println("invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CountryEntity.class);
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();

			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			session.close();

		}
		sessionfactory.close();
	}

}
