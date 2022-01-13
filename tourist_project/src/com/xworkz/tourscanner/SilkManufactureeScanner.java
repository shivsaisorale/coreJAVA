package com.xworkz.tourscanner;

import com.xworkz.tour.dao.SilkManufactureeDAO;
import com.xworkz.tour.dao.SilkManufactureeDAOimpl;

import com.xworkz.tour.entity.SilkManufactureEntity;

public class SilkManufactureeScanner {

	public static void main(String[] args) {

		SilkManufactureEntity entity = new SilkManufactureEntity(22, "SAI", "Shivanagar", 19, "winter","red","30m");

		SilkManufactureeDAO silkManufactureeDAO = new SilkManufactureeDAOimpl();
		silkManufactureeDAO.put(entity);

	}

}
