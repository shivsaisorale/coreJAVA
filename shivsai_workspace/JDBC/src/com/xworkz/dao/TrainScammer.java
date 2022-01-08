package com.xworkz.dao;

import com.xworkz.dto.TrainDTO;

public class TrainScammer {

	public static void main(String[] args) {

		
				TrainDTO trainDTO1 = new TrainDTO(1,16535, "IRCTC", "Bagalkot",3,250, "sleeper", "Golgumbaz Express");
				TrainDTO trainDTO2 = new TrainDTO(2,18006, "RAC", "Koppal", 12, 125, "Non-sleeper", "Hampi Express");
				TrainDTO trainDTO3 = new TrainDTO(3,10863, "PNR", "Hubli",6, 100, "General", "Solapur Express");
				TrainDTO trainDTO4 = new TrainDTO(4,99026, "IRC", "Gadag", 7, 80, "AC", "Mysore Express");
				
				TrainDAO trainDAO = new TrainDAO();
				 //trainDAO.save(trainDTO1);
				 //trainDAO.save(trainDTO2);
				 //trainDAO.save(trainDTO3);
				 //trainDAO.save(trainDTO4);
				
				 boolean delete=trainDAO.deleteById(3);
				 System.out.println(delete);

	}

}
