package com.xworkz.bar.scanner;

import java.time.LocalDateTime;

import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.entity.BarEntity;

public class BarScanner {

	public static void main(String[] args) {

		BarEntity barEntity1 = new BarEntity("CoastalBar", "omsir@gmail.com", true, "jp nagar ", "nagappa", 0,
				10, true, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity2 = new BarEntity("Communiti", "sai@gmail.com", true, "Brigade Road", "nagappa", 0,
				20, false, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity3 = new BarEntity("Vishwas Bar", "shiva@gmail.com", true, "Krishna murti Layout",
				"nagappa", 5, 30, true, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity4 = new BarEntity("Tipsy Bull the Bar", "kiran@gmail.com", true, "Ring road Btm",
				"nagappa", 2, 35, false, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());
		BarEntity barEntity5 = new BarEntity("Swarnaloka Bar", "umesh@gmail.com", true, "BTM complex", "nagappa",
				3, 40, true, 2, "shisai", LocalDateTime.now(), "kiran", LocalDateTime.now());

		BarDAO bar = new BarDAOImpl();
		bar.save(barEntity2);
		bar.save(barEntity1);
		bar.save(barEntity3);
		bar.save(barEntity4);
		bar.save(barEntity5);

	}
}
