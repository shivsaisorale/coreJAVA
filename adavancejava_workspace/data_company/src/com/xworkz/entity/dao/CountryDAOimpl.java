package com.xworkz.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.CityEntity;
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

	@Override
	public CountryEntity getById(int Id) {
		CountryEntity entity = null;
		System.out.println("invoked getid dao method ");
		System.out.println(Id);
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(CityEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			entity = session.get(CountryEntity.class, Id);
			if (entity != null) {
				System.out.println(Id);
			} else {
				System.out.println("entity is not found as id:" + Id);
				

			}
			session.close();

		}
		sessionFactory.close();
		return entity;
	}

	@Override
	public void update(String newcountry, int id) {

		System.out.println("invoked update id dao method ");
		System.out.println(id);
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(CountryEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			CountryEntity entity = session.get(CountryEntity.class, id);

			if (entity != null) {
				entity.setName(newcountry);
				session.update(entity);
				transaction.commit();
				System.out.println("updated city" + id);
				session.close();

			}
			sessionFactory.close();
		}

	}

	@Override
	public void delete(int id) {

		System.out.println("invoked update id dao method ");
		System.out.println(id);
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(CountryEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			CountryEntity entity = session.get(CountryEntity.class, id);
			if (entity != null) {
				entity.setId(id);
				session.delete(entity);
				transaction.commit();
				System.out.println("updated country" + id);
				session.close();
			} else {
				System.out.println("not delete");
			}

		}
		sessionFactory.close();
		return;
	}

}
