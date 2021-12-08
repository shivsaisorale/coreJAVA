package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IPLDTO;

public class IPLDAO {

	private IPLDTO[] iplDTOs=new IPLDTO[50];
	private int i = 0;
	
	public IPLDAO() {
		System.out.println("invoked by no-parameterized constructor");
	}
	public IPLDTO[] getIpldtos() {
		return iplDTOs;
	}
	public void save(IPLDTO name) {
		System.out.println("invoked method save");
		if(i<this.iplDTOs.length&& name!=null) {
			System.out.println("saved IPL team is ".concat(name.getOwner()));
			this.iplDTOs[this.i++]=name;
		}else {
	System.err.println("index is full or you passsing null value");
		}
	}
	public void create(IPLDTO name,int no) {
		System.out.println("invoked overloaded method");
		if(name!=null&& no<=0  && i<this.iplDTOs.length);
		this.iplDTOs[no]=name;
		i++;
	}
	public void noOfIndexFull() {
	System.out.println("invoked method count "+i);
	
}
public boolean matchTeamByNAME(String teamName) {
	
	System.out.println("invoked search method");
	System.out.println("IPL team passed to search ".concat(teamName));
	
	for(int dethNote=0;dethNote<iplDTOs.length;dethNote++) {
		IPLDTO ref=iplDTOs[dethNote];
		if(ref !=null) {
		System.out.println("ref in index is not null:" .concat(String.valueOf(dethNote)));
		String ref1=ref.getOwner();
		if(teamName.equals(ref1)) {
			System.out.println("team name is found");
			return true;
		}
	}
		}
	return false;
}
}
