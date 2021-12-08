package com.xworkz.dp;

import com.xworkz.dp.dao.ClubDAO;
import com.xworkz.dp.dto.ClubDTO;

public class ClubStarter {

	public static void main(String[] args) {
		
		ClubDTO ClubDTO1 =new ClubDTO("yashica","sony","6",1000.f,123.0f);
		ClubDTO ClubDTO2 =new ClubDTO("c34","ganesh","4",3000.0f,34.0f);
		ClubDTO ClubDTO3 =new ClubDTO("canon","hanuman","3",2000.0f,67.0f);
		ClubDTO ClubDTO4 =new ClubDTO("DSLR","devi","3",6000.0f,23.0f);
		ClubDTO ClubDTO5 =new ClubDTO("canon","shiva","6",300008.0f,4000.5f);
		ClubDTO ClubDTO6 =new ClubDTO("Digital","ganesh","2",3876.0f,9999.5f);
	    
		ClubDAO camaraDAO=new ClubDAO();
		ClubDAO.creat(ClubDTO6);
		ClubDAO.creat(ClubDTO6);
		ClubDAO.creat(ClubDTO6);
		ClubDAO.creat(ClubDTO6);
	
		
		ClubDTO[] clubArray = ClubDAO.getClubDTO();
	    {

	for(int no =0; no < clubArray.length;no++) {
		ubDTO ref = clubArray[no];
		 if (ref!=null) {
			 System.out.println("type : "+ref.getName());
			 System.out.println("comapany"+ref.getNoOfPeople());
			 System.out.println("pixel : " +ref.getNoOfBottle());
			 System.out.println("cost : " +ref.getRating());
			 System.out.println("weight :"+ref.getEntryPrice());
			 System.out.println("----------------");
			 
		 }
	}


	}


	}

}
