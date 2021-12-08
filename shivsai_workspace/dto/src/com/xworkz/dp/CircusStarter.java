package com.xworkz.dp;

import com.xworkz.dp.dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {

		CircusDTO circus=new CircusDTO("yogi","bhogi",5,50);
		CircusDTO circus2=new CircusDTO("togi","rago",6,51);
		CircusDTO circus3=new CircusDTO("adidas","ledhar",7,54);
		CircusDTO circus4=new CircusDTO("nok","ledhar",5,55);
		
		CircusDTO dog =new CircusDTO();
		dog.creat(circus);
		
		dog.save(new CircusDTO("nok","ledhar",5,55), 3);
		dog.IndexOccupied();
		dog.shop("name");
		System.out.println("--------------");
		
		CircusDTO[] array=save.getCircusDAOs();
		
		for(int a=0; a<array.length; a++) {
			CircusDTO rate=array[a];
			System.out.println("----------");
			if(rate!=null) {
				

				System.out.println("owner: " +rate.getOwner());
				System.out.println(" material"+ rate.getMaterial());
				System.out.println("ticketPrice".concat(String.valueOf(rate.getTicketPrice())));
				
			
			}else {
			System.out.println("error");
			}
		}
	}
}
