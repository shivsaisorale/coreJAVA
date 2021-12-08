package com.xworkz.dp;

import com.xworkz.dp.dto.*;

public class BusDriverStarter {

		public static void main(String[] args) {
	
			
			BusDriver busdriver = new BusDriver();
			busdriver.setState("karnatak");
			busdriver.setName("nagappa");
			busdriver.setLocation(32);
			busdriver.setStartime(44.5F);
			busdriver.setDepo("BMTC");
					
			BusDriver driver1=new BusDriver("Karnataka","ananda",32,33.4f,"BMTC","Mahidra");
			BusDriver driver2=new BusDriver("tamilnadu","shivu",16,32.3f,"BMTC","BBMP");
			BusDriver driver3=new BusDriver("maharastra","kiru",15,36.3f,"BMTC","BBMP");
			BusDriver driver4=new BusDriver("andra pradesh","vivek",13,36.3f,"BMTC","BBMP");
			BusDriver driver5=new BusDriver("Karnataka","mahi",16,34.3f,"BMTC","BBMP");
		 
			BusDriver[] busdriver1 =new BusDriver[8];
			busdriver1[0] =driver1;
			busdriver1[1] =driver2;
			busdriver1[2] =driver3;
			busdriver1[3] =driver4;
			busdriver1[4] =driver5;
			busdriver1[5] =driver1;
			for (int i =0; i < busdriver1.length;i++) {
				
				BusDriver ref = busdriver1[i];
				if( ref !=null) {
				System.out.println("state : ".concat(ref.getState()));
				System.out.println("name:".concat(ref.getName()));
				System.out.println("location:".concat(String.valueOf(ref.getLocation())));
				System.out.println("startime of bus : ".concat(String.valueOf(ref.getStartime())));
				System.out.println("------------------------");
				} else {
				System.out.println(String.valueOf(i).concat("nd index is pointing to null"));
			}

			}
		}
		}

