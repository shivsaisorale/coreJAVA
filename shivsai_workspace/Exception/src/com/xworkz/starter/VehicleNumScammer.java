package com.xworkz.starter;

import com.xworkz.starter.event.VehicleNumOperator;
import com.xworkz.starter.exception.VehicleNumValidation;




public class VehicleNumScammer {

	public static void main(String[] args) throws VehicleNumValidation  {
	VehicleNumOperator vehicleNumOperator=new VehicleNumOperator();
	vehicleNumOperator.save("KA 38 ji 2345");
	vehicleNumOperator.save("KA 38 jk 3445");
	vehicleNumOperator.save("KA 38 jo 2345");
	vehicleNumOperator.save("KA 38 jt 4545");
	vehicleNumOperator.save("KA 38 je 7645");
	
	}

}
