package com.xworkz.tourscanner;

import com.xworkz.tour.dao.AirportDAO;
import com.xworkz.tour.dao.AirportDAOimpl;

import com.xworkz.tour.entity.AirportEntity;

public class AirportScanner {

	public static void main(String[] args) {
		AirportEntity entity = new AirportEntity(33,"Bidarairport","SHivu","Bidar",1,6);

		AirportDAO dao = new AirportDAOimpl();
		dao.put(entity);

	}

}
