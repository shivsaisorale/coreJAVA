package com.xworkz.busdriver;

import com.xworkz.bus.ArrayBusRouterDAO;
import com.xworkz.bus.BusRouterAssocition;
import com.xworkz.bus.BusRouterDAO;
import com.xworkz.bus.BusRouterDTO;

public class BusRouterRunner {

	public static void main(String[] args) {
		
		BusRouterDTO busRouterDTO=new BusRouterDTO("A1","BTM","Silkboard", "Rakesh");
		BusRouterDTO busRouterDTO1=new BusRouterDTO("B1","Lalbag","hebbal", "Aravind");
		BusRouterDTO busRouterDTO2=new BusRouterDTO("C1","Mejestic","Kengeri", "Mahesh");
		BusRouterDTO busRouterDTO3=new BusRouterDTO("D1","Bidar","Bengalore", "Gomu");
		BusRouterDTO busRouterDTO4=new BusRouterDTO("P1","Bidar","Hydrabd", "Abhi");
	
		BusRouterDAO routerDAO=new ArrayBusRouterDAO();
		
		BusRouterAssocition assocition=new BusRouterAssocition(routerDAO);
		assocition.saveDetails(busRouterDTO);
		assocition.saveDetails(busRouterDTO1);
		assocition.saveDetails(busRouterDTO2);
		assocition.saveDetails(busRouterDTO3);
		assocition.saveDetails(busRouterDTO4);
		assocition.displayDetails();
		
		assocition.deleteAtIntex(1);
		assocition.displayDetails();
		
		assocition.updateDetails(2,busRouterDTO3);
		assocition.displayDetails();
		

	}

}
