package com.xworkz.current;

import com.xworkz.current.button.Shoe;

public class ShoeScammer {

	public static void main(String[] args) {
		Shoe shoe = new Shoe();
		String ref = shoe.toString();
		System.out.println(ref);
		System.out.println(shoe.hashCode());
		System.out.println("the uniqueid of ref is:" + System.identityHashCode(ref));
		shoe.setSize(766.7f);

		Shoe sock2 = new Shoe();
		System.out.println(sock2);
		System.out.println(sock2.hashCode());
		sock2.setSize(34.5f);
	
		shoe.setBrand("star");
		sock2.setBrand("star");
	    System.out.println(shoe.equals(sock2));
		
	}


	}

