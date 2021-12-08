package com.xworkz.busdriver;

import com.xworkz.bus.AirportAssociation;
import com.xworkz.bus.AirportDAO;
import com.xworkz.bus.AirportDTO;
import com.xworkz.bus.ArrayAirport;

public class AirportScammer {

	public static void main(String[] args) {

		AirportDTO airport = new AirportDTO("card1", "shivu", "Bidar", "armyplane");
		AirportDTO airport1 = new AirportDTO("card2", "sai", "Bidar", "Airbus");
		AirportDTO airport2 = new AirportDTO("card3", "kiran", "Bidar", "Jet airliner");
		AirportDTO airport3 = new AirportDTO("card4", "gomu", "Bidar", "Business jet");
		AirportDTO airport4 = new AirportDTO("card5", "abhi", "Bidar", "Monoplane");
		AirportDTO airport5 = new AirportDTO("card6", "rakesh", "Bidar", "flying wing");
		AirportDTO airport6 = new AirportDTO("card7", "ayappa", "Bidar", "boeing");
		AirportDTO airport7 = new AirportDTO("card8", "anmol", "Bidar", "armyplane");

		AirportDAO airportDAO = new ArrayAirport();

		AirportAssociation airportass = new AirportAssociation(airportDAO);
		airportass.createDetails(airport2);
		airportass.createDetails(airport3);
		airportass.createDetails(airport4);
		airportass.createDetails(airport5);
		airportass.createDetails(airport6);
		airportass.createDetails(airport7);
		airportass.createDetails(airport1);

		airportass.updateDetails(4,airport4);
		airportass.displayDetails();
		
		airportass.deleteAtIntex(0);
		airportass.displayDetails();
		
	}

}
