package com.xworkz.shop;

import com.xworkz.shop.curdopartion.CoolDrinks.*;
import com.xworkz.shop.curdopartion.Labour;


public class LabourStarter {

	public static void main(String[] args) {
		Labour labour =new Labour();
		labour.addlabourNames("Bandeppa");
		labour.addlabourNames("Babuvali");
		labour.addlabourNames("vali");
		labour.addlabourNames("rahimakhan");
		labour.addlabourNames("modi");
		labour.addlabourNames("shekhar");
		labour.addlabourNames("yodiroppa");
		labour.addlabourNames("narayana");
		labour.addlabourNames("mahi");
		
		labour.delete(2);
	//	coolDrinks.update(2,"Maze");
		String[] array = labour.getlabourNames();
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
	}



}


