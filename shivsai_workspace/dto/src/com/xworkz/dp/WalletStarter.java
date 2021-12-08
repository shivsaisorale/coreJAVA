package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;
import com.xworkz.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {
	
		WalletDTO walletDTO=new WalletDTO("PUMA","ledhar",5,50.5f);
	    WalletDTO walletDTO1=new WalletDTO("nova","ledhar",6,510.5f);
		WalletDTO walletDTO2=new WalletDTO("adidas","ledhar",7,540.5f);
		WalletDTO walletDTO3=new WalletDTO("nok","ledhar",5,550.5f);
		
		WalletDAO purse =new WalletDAO();
		purse.create(walletDTO);
		
		purse.save(new WalletDTO("PUMA","ledhar",5,50.5f), 3);
		purse.IndexOccupied();
		purse.shop("name");
		System.out.println("--------------");
		
		WalletDTO[] array=purse.getwalletdaos();
		
		for(int a=0;a<array.length;a++) {
			WalletDTO rate=array[a];
			System.out.println("----------");
			if(rate!=null) {
				
				System.out.println("companyname: " +rate.getCompanyName());
				System.out.println("material".concat(String.valueOf(rate.getCompartments())));
				System.out.println(" material"+ rate.getMaterial());
			
			}else {
			System.out.println("error");
			}
		}
			}
	
	}
	
