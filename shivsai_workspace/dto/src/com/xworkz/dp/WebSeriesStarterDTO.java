package com.xworkz.dp;

import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesStarterDTO {

	public static void main(String[] args) {
		WebSeriesDTO webSeriesDTO=new WebSeriesDTO();
		WebSeriesDTO webSeriesDTO1=new WebSeriesDTO("asur","hero",140,7.5f,1,1);
		WebSeriesDTO webSeriesDTO2=new WebSeriesDTO("vampire","albrt",150,8.5f,5,5);
		WebSeriesDTO webSeriesDTO3=new WebSeriesDTO("money hiest","rio",120,8.8f,5,5);
		
        webSeriesDTO.setName("sacred games");
        webSeriesDTO.setCast("nawazuddin");
        webSeriesDTO.setCurrentSeason(2);
        webSeriesDTO.setNoOfCharacters(345);
		webSeriesDTO.setRating(6f);
		webSeriesDTO.setTotalSeason(2);
		
		WebSeriesDAO webSeriesDAO = new WebSeriesDAO();
		webSeriesDAO.webSeriesNames(webSeriesDTO1);
		webSeriesDAO.webSeriesNames(webSeriesDTO2);
		webSeriesDAO.webSeriesNames(webSeriesDTO3);
		webSeriesDAO.delet(1);
		webSeriesDAO.updated(2,null);
	 
		WebSeriesDTO[] ref=webSeriesDAO.getDto();
		
		for( int i = 0; i < ref.length;i++) {
			
			WebSeriesDTO fig=ref[i];
			
			if(fig !=null) {
			System.out.println("--------------------");
			
				System.out.println(fig.getCast());
				System.out.println(fig.getCurrentSeason());
				System.out.println(fig.getTotalSeason());
				System.out.println(fig.getRating());
				System.out.println(fig.getName());
				System.out.println(fig.getNoOfCharacters());
			}else {
				System.err.println("invalid");
			}
		}
	}

}
		




