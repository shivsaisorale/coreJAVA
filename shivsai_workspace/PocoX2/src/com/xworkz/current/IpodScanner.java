package com.xworkz.current;

import com.xworkz.current.button.Ipod;

public class IpodScanner {

	public static void main(String[] args) {
		Ipod ipod = new Ipod();
		String ref = ipod.toString();
		System.out.println(ref);
		System.out.println(ipod.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		ipod.setModelNo("FHD1221");

		Ipod ipod2 = new Ipod();
		System.out.println(ipod2);
		System.out.println(ipod2.hashCode());
		ipod2.setModelNo("FHD1223");
	
		ipod.setModelNo("23er");
		ipod2.setModelNo("23er");
	    System.out.println(ipod.equals(ipod2));
		
	}

}
