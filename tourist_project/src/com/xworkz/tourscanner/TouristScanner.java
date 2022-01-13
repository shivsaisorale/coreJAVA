package com.xworkz.tourscanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristScanner {

	public static void main(String[] args) {

		TouristEntity touristEntity = new TouristEntity(1, "Nandi Hills", 545, "Bengaluru", 100, "winter");

		TouristDAO dao = new TouristDAOImpl();

		dao.put(touristEntity);
	}

}
