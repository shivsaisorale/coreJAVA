package com.xworkz.tourscanner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.AirportDAO;
import com.xworkz.tour.dao.AirportDAOimpl;

import com.xworkz.tour.entity.AirportEntity;

public class AirportScanner {

	public static void main(String[] args) {
		//AirportEntity entity = new AirportEntity(1, "Bidarairport", "SHivu", "Bidar", 1, 3);

		

		List<AirportEntity> list = new ArrayList<AirportEntity>();
		list.add(new AirportEntity(99, "bengaluruAirport", "rakesh", "Bengaluru", 6, 6));
		list.add(new AirportEntity(3, "MangaloreInternational airport", "shivu", "Mangalore", 5, 5));
		list.add(new AirportEntity(4, "Belagavi  airport", "sai", "Belagavi", 5, 4));
		list.add(new AirportEntity(5, "Kalaburagi airport", "kiran", "Kalaburagi", 4, 2));
		list.add(new AirportEntity(6, "Jindala Vijaynagra airport", "basuu", "Mangalore", 2, 5));
		list.add(new AirportEntity(7, "Mysore airport", "shivu", "sagar", 1, 7));
		list.add(new AirportEntity(8, "HALairport airport", "saikiran", "Mangalore", 3, 8));
		list.add(new AirportEntity(9, "Jakkur airport", "guru", "Mangalore", 2, 4));
		list.add(new AirportEntity(10, "Yalahanka  airport", "mahesh", "Bengaluru", 55, 2));
		list.add(new AirportEntity(11, "Sambra  airport", "chintu", "Mangalore", 27, 7));
		list.add(new AirportEntity(12, "Bidar Air Force station airport", "abhi", "Bidar", 26, 8));
		list.add(new AirportEntity(13, "Baldota airport", "ayappa", "Mangalore", 25, 9));
		list.add(new AirportEntity(14, "Harihar airport", "gomu", "Mangalore",24, 1));
		list.add(new AirportEntity(15, "Sedam airport", "vijaya", "Sedam", 22, 2));
		list.add(new AirportEntity(16, "Shimoga airport", "trishul", "Shimoga", 22, 4));
		list.add(new AirportEntity(17, "New bellary airport", "abhijit", "bellary", 21, 5));
		list.add(new AirportEntity(18, "Hassan airport", "arati", "Hassan", 20, 6));
		list.add(new AirportEntity(19, "Karwar airport", "girija", "Karwar", 19, 7));
		list.add(new AirportEntity(20, "Raichur airport", "prashant", "Raichur", 18, 8));
		list.add(new AirportEntity(21, "Bijapur airport", "mallu", "Bijapur", 17, 9));
		list.add(new AirportEntity(22, "Chennai International airport", "sonya", "Chennai", 16, 1));
		list.add(new AirportEntity(23, "Indira International airport ", "umesh", "Delhi", 15, 2));
		list.add(new AirportEntity(24, "Rajiva GaNDI International airport ", "nagappa", "Hydrabad", 14, 4));
		list.add(new AirportEntity(25, "Cochin International airport", "ravi", "Kerala", 13, 5));
		list.add(new AirportEntity(26, "Sardar International airport", "rajkumara", "Ahmedabad", 12, 6));
		list.add(new AirportEntity(27, "Chhatrapati International airport", "kanesh", "Nagpur", 11, 7));
		list.add(new AirportEntity(28, "Trivandrum International airport", "omkar", "keral", 32, 8));
		list.add(new AirportEntity(29, "Lokpriya International airport", "jaganath", "Guwahatti", 2, 9));
		list.add(new AirportEntity(30, "Callicut International airport", "sangu", "keral", 3, 2));
		list.add(new AirportEntity(31, "Jaipur International airport", "sairam", "Jaipur", 4, 5));
		list.add(new AirportEntity(32, "Dabolim International airport", "ram", "Goa", 43, 4));
		list.add(new AirportEntity(33, "Biju Patnaik International airport", "das", "odisha", 33, 5));
		list.add(new AirportEntity(34, "Tiruchirappali International airport", "veersh", "Tamilanadu", 23, 6));
		list.add(new AirportEntity(35, "Bagdogra International airport", "appaya", "Kannur", 13, 7));
		list.add(new AirportEntity(36, "DR. Babashaheb International airport", "rehana", "Nagpur", 9, 6));
		list.add(new AirportEntity(37, "Vishkhapatnam International airport", "tare", "Andamana Nikobara", 1, 5));
		list.add(new AirportEntity(38, "Chandighar International airport", "suddep", "Mangalore", 2, 4));
		list.add(new AirportEntity(39, "Madurai International airport", "darshan", "Madurai", 5, 7));
		list.add(new AirportEntity(40, "Veer savarakar International airport", "pranesh", "Andamana", 5, 6));
		list.add(new AirportEntity(41, "Lal bahadhur International airport", "eswara", "Uttar pradesh", 8, 6));
		list.add(new AirportEntity(42, "Bagdogra International airport", "mahima", "Siligurgi", 7, 8));
		list.add(new AirportEntity(43, "Madurai  International airport", "anushri", "madurai", 6, 4));
		list.add(new AirportEntity(44, "Delhi International airport", "raju", "Delhi", 6, 2));
		list.add(new AirportEntity(45, "Nagpur International airport", "keshava", "Nagpur", 4, 6));
		list.add(new AirportEntity(46, "Ranchi International airport", "nagunata", "Ranchi", 3, 7));
		list.add(new AirportEntity(47, "Jalgao International airport", "raghu", "Jalgao", 2, 5));
		list.add(new AirportEntity(48, "Hubbali International airport", "mahindara", "Hubbali", 4, 3));
		list.add(new AirportEntity(49, "Nellore International airport", "suresh", "Nellore", 2, 6));
		list.add(new AirportEntity(50, "Raigarb International airport", "kiran", "Raigarb", 1, 2));
		
		AirportDAO dao = new AirportDAOimpl();
		dao.putAll(list);
	}

}
