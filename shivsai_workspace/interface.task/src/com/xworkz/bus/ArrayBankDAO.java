package com.xworkz.bus;

public class ArrayBankDAO implements BankDAO{

	public ArrayBankDAO() {

	}

	BankDTO[] bank = new BankDTO[4];
	int counter = 0;

	@Override
	public boolean save(BankDTO dto) {
	if(dto!=null && this.counter<bank.length){
		bank[this.counter++]=dto;
		System.out.println("it is print");
	    return true;
	}else {
		System.out.println("it is not print");
	}
	return false;
	
	}
	
	@Override
	public boolean delete(int num) {
		if(num > 0 && counter <bank.length) {
			bank[num]=null;
			System.out.println("its num is null");
			return true;
		}else {
			System.out.println("its num is not null");
		}
		return false;
	}
	@Override
	public boolean update (int num,BankDTO dto) {
		if(dto!=null && num>=0 && num<bank.length) {
			bank[num++]=dto;
			System.out.println("its dto  update");
		return true;
		}else {
			System.out.println("its not dto update");
		}
			return false;
	
	}
	@Override
	public void display() {
		for (int i = 0; i < bank.length; i++) {
			if (bank[i] != null) {
				System.out.println(bank[i].getId());
				System.out.println(bank[i].getBranch());
				System.out.println(bank[i].getName());
				System.out.println(bank[i].getIfsc());
			}
		}
	}
}
