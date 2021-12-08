package com.xworkz.hostel.name.city;

import com.xworkz.hostel.name.KiranHostel;
import com.xworkz.hostel.name.SaiPG;
import com.xworkz.hostel.name.Saihostel;

public class SaihostelScammer {

	public static void main(String[] args) {
            
		
		SaiPG ref = new KiranHostel();
		ref.rooms();
		Saihostel ref1=new KiranHostel();
		ref1.rent(888);
		
		
		if(ref instanceof KiranHostel) {
			Saihostel ref0=(Saihostel)ref;
			System.out.println("invoked method  room rent :"+ref0.rent(999));
			
		}
	}
}
