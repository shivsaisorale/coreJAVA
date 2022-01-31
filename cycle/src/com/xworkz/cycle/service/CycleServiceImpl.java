package com.xworkz.cycle.service;

import com.xworkz.cycle.dao.CycleDAO;
import com.xworkz.cycle.dao.CycleDAOImpl;
import com.xworkz.cycle.entity.CycleEntity;

public class CycleServiceImpl implements CycleService {

	private CycleDAO dao;

	public CycleServiceImpl(CycleDAO dao) {

		super();
		this.dao = dao;
	}

	@Override
	public void validAndSave(CycleEntity entity) {
		boolean valid = true;
		if (entity.getName() != null && !(entity.getName().isEmpty()) && !(entity.getName().length() < 5)
				&& !(entity.getName().length() > 30)) {
			valid = true;
		} else {
			System.out.println("invalid name");
			valid = false;

		}
	}

	@Override
	public boolean validcityAndlocation(String city, String location) {
		boolean valid=false;
	
		if (city != null && !(city.isEmpty()) && (location != null && !(location.isEmpty()))) {
			if (city.length() >= 8 && location.length() >= 8) {
				valid = dao.findByCompany(location);
			}
		}
		return valid;

}

}