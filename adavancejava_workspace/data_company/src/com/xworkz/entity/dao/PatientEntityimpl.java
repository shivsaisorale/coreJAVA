package com.xworkz.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.CityEntity;
import com.xworkz.entity.ComapanyEntity;
import com.xworkz.entity.PatientEntity;

public class PatientEntityimpl implements PatitentEntityDAO {

	@Override
	public void create(PatientEntity entity) {
		System.out.println("invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(PatientEntity.class);
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
	public PatientEntity getById(int Id) {
		PatientEntity entity = null;
		System.out.println("invoked getid dao method ");
		System.out.println(Id);
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(CityEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			entity = session.get(PatientEntity.class, Id);
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
	public void update(String newpet, int id) {

		System.out.println("invoked update id dao method ");
		System.out.println(id);
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(PatientEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			PatientEntity entity = session.get(PatientEntity.class, id);

			if (entity != null) {
				entity.setName(newpet);
				session.update(entity);
				transaction.commit();
				System.out.println("updated newpet" + id);
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
		con.addAnnotatedClass(PatientEntity.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			PatientEntity entity = session.get(PatientEntity.class, id);
			if (entity != null) {
				entity.setId(id);
				session.delete(entity);
				transaction.commit();
				System.out.println("updated Patient" + id);
				session.close();
			} else {
				System.out.println("not delete");
			}

		}
		sessionFactory.close();
		return;
	}
}
