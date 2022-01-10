package com.xworkz.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.CityEntity;
import com.xworkz.entity.StateEntity;

public class StateEntityDAOimpl implements StateDAO {

	@Override
	public void create(StateEntity entity) {
		System.out.println("invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(StateEntity.class);
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
		public StateEntity getById(int id) {
			StateEntity entity = null;
			System.out.println("invoked getid dao method ");
			System.out.println(id);
			Configuration con = new Configuration();
			con.configure();
			con.addAnnotatedClass(StateEntity.class);
			SessionFactory sessionFactory = con.buildSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				entity = session.get(StateEntity.class, id);
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
		public void update(String newstate, int id) {

			System.out.println("invoked update id dao method ");
			System.out.println(id);
			Configuration con = new Configuration();
			con.configure();
			con.addAnnotatedClass(StateEntity.class);
			SessionFactory sessionFactory = con.buildSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();

				StateEntity entity = session.get(StateEntity.class, id);

				if (entity != null) {
					entity.setName(newstate);
					session.update(entity);
					transaction.commit();
					System.out.println("updated newstate" + id);
					session.close();

				}
				sessionFactory.close();
			}

		}

		@Override
		public void  delete( int id) {
			
			System.out.println("invoked update id dao method ");
			System.out.println(id);
			Configuration con=new Configuration();
			con.configure();
			con.addAnnotatedClass(StateEntity.class);
			SessionFactory sessionFactory=con.buildSessionFactory();
			if(sessionFactory!= null) {
				Session session=sessionFactory.openSession();
				Transaction transaction =session.beginTransaction();
				
				StateEntity entity =session.get(StateEntity.class, id);
				if (entity != null) {
					entity.setId(id);
					session.delete(entity);
					transaction.commit();
					System.out.println("updated state" + id);
					session.close();
				}else {
					System.out.println("not delete");
				}

				
			}
			sessionFactory.close();
			return ;
	}

}
