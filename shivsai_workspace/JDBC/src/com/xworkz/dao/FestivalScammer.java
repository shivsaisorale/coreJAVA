package com.xworkz.dao;

import com.xworkz.dto.FestivalDTO;

public class FestivalScammer {

	public static void main(String[] args) {
		FestivalDTO festivalDTO1 = new FestivalDTO(1, "Maha Shivaratri", "1 March 2021", "Karnataka");
		FestivalDTO festivalDTO2 = new FestivalDTO(2, "Maha navami", "05 Oct 2021", "Karnataka");
		FestivalDTO festivalDTO3 = new FestivalDTO(3, "Diwali", "10 November 2021", "Karnataka");
		FestivalDTO festivalDTO4 = new FestivalDTO(4, "Sankranti", "15 January 2021", "Karnataka");

		FestivalDAO festivalDAO = new FestivalDAO();
		festivalDAO.save(festivalDTO1);

		boolean delete = festivalDAO.deleteById(3);
		System.out.println(delete);

	}

}
