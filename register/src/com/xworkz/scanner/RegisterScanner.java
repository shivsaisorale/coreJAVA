package com.xworkz.scanner;

import register.dao.RegisterDAO;
import register.dao.RegisterDAOImpl;
import register.entity.RegisterEntity;
import service.RegisterService;
import service.RegisterServiceDAOIMpl;

public class RegisterScanner {

	public static void main(String[] args) {

		RegisterEntity entity = new RegisterEntity("Shivas", " shivsai@gmali", "kiran123", "bidar", "India", 8139966651l,
				"true");

		RegisterDAO dao = new RegisterDAOImpl();

		RegisterService service = new RegisterServiceDAOIMpl(dao);
		service.validateAndSave(entity);
	}

}