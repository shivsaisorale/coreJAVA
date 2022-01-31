package com.xworkz.cycle.service;

import com.xworkz.cycle.dao.CycleDAO;
import com.xworkz.cycle.dao.CycleDAOImpl;
import com.xworkz.cycle.entity.CycleEntity;

public class CycleScanner {

	public static void main(String[] args) {
		CycleEntity cycleEntity=new CycleEntity("Atlas","kid cycle",10000, "parts", "Bidar", "bazar");
	
		CycleDAO cycleDAO=new CycleDAOImpl();
		
		CycleService cycleService =new CycleServiceImpl(cycleDAO);
		cycleService.validAndSave(cycleEntity);
	}
}
