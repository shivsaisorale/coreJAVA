package com.xworkz.dao;

import com.xworkz.dto.CityDTO;

public class CityScammer {

	public static void main(String[] args) {

		CityDTO cityDTO1 = new CityDTO(1, "Bidar", "23456", "Guru nanak");
		CityDTO cityDTO2 = new CityDTO(2, "Bhalki", "45667", "Mataji");
		CityDTO cityDTO3 = new CityDTO(3, "Gadag", "34566", "Doddabasappa Temple");
		CityDTO cityDTO4 = new CityDTO(4, "Kalburgi", "898", "Ganesh");

		CityDAO cityDAO = new CityDAO();
		cityDAO.save(cityDTO1);

		boolean delete = cityDAO.deleteById(3);
		System.out.println(delete);

	}

}
