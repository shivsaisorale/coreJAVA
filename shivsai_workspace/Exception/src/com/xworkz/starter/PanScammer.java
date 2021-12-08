package com.xworkz.starter;

import com.xworkz.starter.event.PanOperator;
import com.xworkz.starter.exception.PanValidationException;

public class PanScammer {

	public static void main(String[] args) throws PanValidationException {
	
		PanOperator panOperator=new PanOperator() ;
		
		panOperator.save("NIBS4096A");
		panOperator.save("NIBS1096A");
		panOperator.save("NIBS1296A");
		panOperator.save("NIBS2096A");
		
		
	}
	

}

