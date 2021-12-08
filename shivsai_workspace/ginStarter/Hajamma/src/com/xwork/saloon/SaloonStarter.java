package com.xwork.saloon;

import com.xwork.saloon.shop.NaturalSaloon;
import com.xwork.saloon.shop.Saloon;

public class SaloonStarter {

	public static void main(String[] args) {
		
		NaturalSaloon naturalSaloon=new NaturalSaloon();
		System.out.println("New saloon shop");
		Saloon saloon=new Saloon();
		
		System.out.println(naturalSaloon.name);
		System.out.println(naturalSaloon.noOfHajamas);
	
		System.out.println(saloon.name);
		System.out.println(saloon.noOfHajamas);
	}	
		}
