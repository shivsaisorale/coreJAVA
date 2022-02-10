
package com.xworkz.scanner;

import com.xworkz.cycle.CycleEntity;
import com.xworkz.cycle.dao.CycleDAO;
import com.xworkz.cycle.dao.CycleDAOImpl;

public class CycleDirector {

	public static void main(String[] args) {
		
		CycleEntity cycleEntity =new CycleEntity(10,"gearcycle", "kidcycle", 10000.2f, "herocycle");
		CycleEntity cycleEntity1 =new CycleEntity(20,"cycles", "boycycle", 12000.2f, "BMWcycle");
		
		CycleDAO cycleDAO=new CycleDAOImpl();
		cycleDAO.fetchById(1);
		cycleDAO.fetchByName("kidcycyle");
		cycleDAO.fetchByCompany("bmw");
	}

}
