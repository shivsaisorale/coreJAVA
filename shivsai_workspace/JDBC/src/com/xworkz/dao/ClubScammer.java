package com.xworkz.dao;

import com.xworkz.dto.ClubDTO;

public class ClubScammer {

	public static void main(String[] args) {


		ClubDTO clubDTO =new ClubDTO(9,'Hsr','Hsr',5,900,true);
		ClubDAO clubDAO =new ClubDAO();
		clubDAO.save(clubDTO);
		System.out.println(clubDTO);
	}

}
