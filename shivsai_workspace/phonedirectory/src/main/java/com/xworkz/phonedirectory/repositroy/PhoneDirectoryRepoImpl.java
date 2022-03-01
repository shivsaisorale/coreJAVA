package com.xworkz.phonedirectory.repositroy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.phonedirectory.entity.PhoneDirectoryEntity;
@Component
public class PhoneDirectoryRepoImpl implements PhoneDirectoryRepositry {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public PhoneDirectoryRepoImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(PhoneDirectoryEntity directoryEntity) {
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		try {
			manager.getTransaction().begin();
			manager.persist(directoryEntity);
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (manager != null) {
				manager.close();
			}

		}
	}
}