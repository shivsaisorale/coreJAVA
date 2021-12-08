package com.xworkz.current;

import com.xworkz.current.button.Aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {
		Aeroplane aeroplane = new Aeroplane();
		String ref = aeroplane.toString();
		System.out.println(ref);
		System.out.println(aeroplane.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		aeroplane.setCompany("TATA");

		Aeroplane aeroplane1 = new Aeroplane();
		System.out.println(aeroplane1);
		System.out.println(aeroplane.hashCode());
		aeroplane.setCompany("TATA");
	
	aeroplane.setCompany("TATA");
	aeroplane1.setCompany("TATA");
    System.out.println(aeroplane.equals(aeroplane1));
	}
}

