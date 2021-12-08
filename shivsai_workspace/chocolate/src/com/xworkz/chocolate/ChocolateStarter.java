package com.xworkz.chocolate;

import com.xworkz.crud.*;

public class ChocolateStarter {

	public static void main(String[] args) {

		Crudopertion crudopertion = new Crudopertion();

		String Aname = crudopertion.gettesty();
		System.out.println(Aname);

		crudopertion.addchocolateName("Dark Range");
		crudopertion.addchocolateName("Silk");
		crudopertion.displayChocolateName();
		crudopertion.addchocolateName("Parle");
		crudopertion.addchocolateName("Cadbury");
		crudopertion.addchocolateName("melody");
		crudopertion.displayChocolateName();

	}


	{
	
	GinCrud ginCrud = new GinCrud();

	String Bname = ginCrud.getwhisky();
	System.out.println(Bname);

	ginCrud.addwhiskyName("jack");
	ginCrud.addwhiskyName("bourbon");
	ginCrud.displaywhiskyName();
	ginCrud.addwhiskyName("heaven hill");
	ginCrud.addwhiskyName("rye");
	ginCrud.addwhiskyName("buchanans");
	ginCrud.addwhiskyName("dewar");
	ginCrud.addwhiskyName("black Velvet");
	ginCrud.addwhiskyName("jim Beam");
	ginCrud.displaywhiskyName();

	}
	{
		{
			
			RestaurantStarter Rhotel = new RestaurantStarter();

			String Bname = Rhotel.getwhisky();
			System.out.println(Bname);

			Rhotel.addhotelName("jack");
			Rhotel.addhotelName("bourbon");
			Rhotel.displayhotelName();
			Rhotel.addhotelName("heaven hill");
			Rhotel.addhotelName("rye");
			Rhotel.addhotelName("buchanans");
			Rhotel.addhotelName("dewar");
			Rhotel.addhotelName("black Velvet");
			Rhotel.addhotelName("jim Beam");
			Rhotel.displayhotelName();

			}
	
		{
			ResortStarter resort = new ResortStarter();

		String Aname = resort.getlocation();
		System.out.println(Aname);

		resort.addresortName("radiant Range");
		resort.addresortName("palm");
		resort.displayresortName();
		resort.addresortName("happy");
		resort.addresortName("holiday village");
		resort.addresortName("tulips");
		resort.addresortName("royal galaxy");
		resort.addresortName("praddon");
		resort.addresortName("orange eye");
		resort.displayresortName();

		}
		{
		Island islandC = new Island();

		String Iname = islandC.getCountry();
		System.out.println(Iname);

		islandC.addislandName("cook");
		islandC.addislandName("ionian");
		islandC.displayislandName();
		islandC.addislandName("maldives");
		islandC.addislandName("sardinia");
		islandC.addislandName("kauai");
		islandC.addislandName("baffin");
		islandC.addislandName("jamaica");
		islandC.addislandName("malta");
		islandC.addislandName("corfu");
		islandC.displayislandName();

	}

	}
}	
	

