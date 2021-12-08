package com.xworkz.bus;

public interface BankDAO {

	boolean save(BankDTO dto);

	boolean delete(int num);

	boolean update(int num, BankDTO dto);

	void display();

}
