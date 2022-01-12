package com.xworkz.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.CityEntity;

public class CityDAOimpl implements CityDAO {

	@Override
	public void create(CityEntity entity) {
		System.out.println("invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CityEntity.class);
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
	public CityEntity getById(int id) {
		CityEntity entity = null;
		System.out.println("invoked getid dao method ");
		System.out.println(id);
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(CityEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			entity = session.get(CityEntity.class, id);
			if (entity != null) {
				System.out.println(id);
			} else {
				System.out.println("entity is not found as id:" + id);
				;

			}
			session.close();

		}
		sessionFactory.close();
		return entity;
	}

	@Override
	public void update(String newCity, int id) {

		System.out.println("invoked update id dao method ");
		System.out.println(id);
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(CityEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			CityEntity entity = session.get(CityEntity.class, id);

			if (entity != null) {
				entity.setName(newCity);
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
		con.addAnnotatedClass(CityEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			CityEntity entity = session.get(CityEntity.class, id);
			if (entity != null) {
				entity.setId(id);
				session.delete(entity);
				transaction.commit();
				System.out.println("delete city" + id);
				session.close();
			} else {
				System.out.println("not delete");
			}

		}
		sessionFactory.close();
		return;
	}
}
