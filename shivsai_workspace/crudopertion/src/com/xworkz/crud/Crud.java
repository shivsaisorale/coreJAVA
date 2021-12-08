package com.xworkz.crud;

import com.xworkz.crud.operator.BeachOperator;

public class Crud {

	public static void main(String[] args) {

		BeachOperator beachOperator = new BeachOperator();

		String cname = beachOperator.getCountry();
		System.out.println(cname);

		beachOperator.addBeachName("om Beach");
		beachOperator.addBeachName("RK Beach");
		beachOperator.displayBeachName();
		beachOperator.addBeachName("NITK Beach");
		beachOperator.addBeachName("Panaambur Beach");
		beachOperator.addBeachName("Karwar Beach");
		beachOperator.displayBeachName();

	}

}
