package com.xworkz.current;

import com.xworkz.current.button.Tyre;

public class TyreStarter {

	public static void main(String[] args) {
		Tyre tyre = new Tyre();
		String ref = tyre.toString();
		System.out.println(ref);
		System.out.println(tyre.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		tyre.setPrice(34.5f);

		Tyre aeroplane = new Tyre();
		System.out.println(aeroplane);
		System.out.println(aeroplane.hashCode());
		aeroplane.setPrice(34.4f);
	}


	}


