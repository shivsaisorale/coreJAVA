package com.xworkz.dao;

import com.xworkz.dto.ClubDTO;

public class ClubScammer {

	public static void main(String[] args) {

		ClubDTO clubDTO = new ClubDTO("hsr", 233, 2345, "hsrBANK", "HSRLAYOUT", "TRUE");
		ClubDAO clubDAO = new ClubDAO();
		clubDAO.save(clubDTO);
		System.out.println(clubDTO);
	}

}
