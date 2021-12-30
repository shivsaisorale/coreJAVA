package com.xworkz.dao;

import com.xworkz.dto.StateDTO;

public class StateScammer {

	public static void main(String[] args) {

		StateDTO stateDTO1 = new StateDTO(1, "Karnataka", 29, "Bangalore");
		StateDTO stateDTO2 = new StateDTO(2, "Andhara Pradesh", 39, "Amaravti");
		StateDTO stateDTO3 = new StateDTO(3, "Goa", 21, "goa");
		StateDTO stateDTO4 = new StateDTO(4, "Haryana", 24, "Chandigarh");

		StateDAO stateDAO = new StateDAO();
		stateDAO.save(stateDTO1);

		boolean delete = stateDAO.deleteById(3);
		System.out.println(delete);

	}

}
