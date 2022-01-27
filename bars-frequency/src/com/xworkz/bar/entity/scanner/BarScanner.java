package com.xworkz.bar.entity.scanner;

import java.time.LocalDateTime;

import com.xworkz.bar.entity.BarEntity;
import com.xworkz.dao.BarDAO;
import com.xworkz.dao.BarDAOImpl;
import com.xworkz.dao.BarService;
import com.xworkz.dao.BarServiceImpl;

public class BarScanner {

	public static void main(String[] args) {

		BarEntity barEntity1 = new BarEntity(null, "omsir@gmail.com", 9875433321l, "jp nagar ", "nagappa", 5, 10, 10,
				"shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity2 = new BarEntity("Communiti", "sai@gmail.com", 9874561236l, "Brigade Road", "kaagappa", 3,
				20, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity3 = new BarEntity("Vishwas Bar", "shiva@gmail.com", 81345567894l, "Krishna murti Layout",
				"nagappa", 5, 25, 8, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity4 = new BarEntity("Tipsy Bull the Bar", "kiran@gmail.com", 7894561234l, "Ring road Btm",
				"nagappa", 2, 35, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity5 = new BarEntity("Swarnaloka Bar", "umesh@gmail.com", 8794561231l, "BTM complex", "nagappa",
				3, 40, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());

		BarDAO barDAO = new BarDAOImpl();
//		barDAO.save(barEntity5);
//		barDAO.save(barEntity4);
//		barDAO.save(barEntity3);
//		barDAO.save(barEntity2);
//
		BarService barDAO2 = new BarServiceImpl();
//		barDAO2.validateAndSave(barEntity5);
//		barDAO2.validateAndSave(barEntity2);
//		barDAO2.validateAndSave(barEntity3);
//		barDAO2.validateAndSave(barEntity4);
		barDAO2.validateAndSave(barEntity1);

	}
}