package com.xworkz.current;

import com.xworkz.current.button.PhilipIron;

public class IronboxStarter {

	public static void main(String[] args) {
		
		PhilipIron philip=new PhilipIron("Philip","NORMAL",true,180,345);
		philip.displayDetails();
		philip.produceHeat();
		

	}

}
