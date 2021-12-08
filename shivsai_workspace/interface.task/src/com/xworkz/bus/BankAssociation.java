package com.xworkz.bus;

public class BankAssociation {

	
	private BankDAO bankdao;
	
	
	public BankAssociation(BankDAO bankdao) {
	System.out.println("invoked no args of bankassociation ");
	this.bankdao=bankdao;
	}
	
	public void  savedeatils(BankDTO dto) {
		bankdao.save(dto);
	}
	public void deletdeatils(int value) {
		bankdao.delete(value);
	}
	public void updatedeatils(int value,BankDTO dto) {
		bankdao.update(value, dto);
	}

	
	
}
