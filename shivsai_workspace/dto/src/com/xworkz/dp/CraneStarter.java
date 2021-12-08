package com.xworkz.dp;

import com.xworkz.dp.dto.CraneDTO;

public class CraneStarter { 

	public static void main(String[] args, int band) {
		CraneDTO crane=new CraneDTO();
		CraneDTO crane2=new CraneDTO("JCB","green",16,32.3f);
		CraneDTO crane3=new CraneDTO("JCB","black",15,36.3f);
		CraneDTO crane4=new CraneDTO("JCB","red",13,36.3f);
		CraneDTO crane5=new CraneDTO("JCB","red",16,34.3f);
	 
		CraneDTO[] cranes =new CraneDTO[8];
		cranes[0] =crane;
		cranes[1] =crane2;
		cranes[2] =crane3;
		cranes[3] =crane4;
		cranes[4] =crane5;
		cranes[5] =crane;
		for (int band1 =0; band1 < cranes.length;band1++) {
			
			CraneDTO array = cranes[band1];
			if( array !=null) {
			System.out.println("company : ".concat(array.getCompany()));
			System.out.println("colour:".concat(array.getColour()));
			System.out.println("noOfOpertors:".concat(String.valueOf(array.getNoOfOpertors())));
			System.out.println("Hight of crane : ".concat(String.valueOf(array.getHight())));
			System.out.println("------------------------");
			} else {
			System.out.println("index".concat(String.valueOf(band1).concat(" is pointing to null")));
		}

		}
	}
	}
	
	

                                     
