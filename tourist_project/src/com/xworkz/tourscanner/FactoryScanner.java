package com.xworkz.tourscanner;

import com.xworkz.tour.dao.FactoryDAO;
import com.xworkz.tour.dao.FactoryDAOimpl;

import com.xworkz.tour.entity.FactoryEntity;

public class FactoryScanner {

	public static void main(String[] args) {
		FactoryEntity entity = new FactoryEntity(22, "Med+", "HSR", "tablet", "Shiva",87);

		FactoryDAO dao = new FactoryDAOimpl();
		dao.put(entity);

	}

}
