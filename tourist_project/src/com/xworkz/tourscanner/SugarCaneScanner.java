package com.xworkz.tourscanner;

import com.xworkz.tour.dao.SugarCaneDAO;
import com.xworkz.tour.dao.SugarCaneDAOimpl;

import com.xworkz.tour.entity.SugarCaneEntity;

public class SugarCaneScanner {

	public static void main(String[] args) {
		SugarCaneEntity entity = new SugarCaneEntity(23, "sukkar", "DharaniSugar", 10, "Bidar","2km",50.33f);

		SugarCaneDAO dao = new SugarCaneDAOimpl();
		dao.put(entity);

	}

}
