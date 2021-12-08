package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {

	private WalletDTO[] wallDTOs = new WalletDTO[15];
	private int hari = 0;
	private int match;
	private int no;

	public WalletDAO() {
		System.out.println("invoked the no-parameterized constructor");

	}

	public WalletDTO[] getwalletdaos() {
		return wallDTOs;
	}

	public void create(WalletDTO name) {
		System.out.println("invoked the create by two parameter");
		if(hari<this.wallDTOs.length && name!=null && no>0){
			this.wallDTOs[no++]=name;
		}
		else { 
			System.err.println("index is full in overloading");
		}
	
	}

	public void save(WalletDTO name,int rokka) {
		System.out.println("invoked overloaded method");
		if(name!= null && rokka>=0 && no<this.wallDTOs.length) {
			this.wallDTOs[rokka]=name;
			no++;
		}
	}

	public void IndexOccupied() {
		System.out.println("index occupied :" + hari);
	}

	public boolean shop(String material) {
		for (int match = 0; match < this.wallDTOs.length; match++)
			;
		WalletDTO ref = wallDTOs[match];
		if (ref != null) {
			System.out.println("ref of index is not full:".concat(String.valueOf(ref)));
			int ref1 = ref.getCompartments();
			if (material.equals(ref1)) {
			}
		}
		return false;
	}
}
