package com.xworkz.hostel.name;


public  class KiranHostel implements Saihostel,SaiPG {
	
	@Override
	public float rent(int rent) {
		System.out.println("invoked method rent");
		return 777 ;
	}
	@Override
	public int rooms() {
		System.out.println("invoked method rooms");
		return 0;
	}
	
	
}	