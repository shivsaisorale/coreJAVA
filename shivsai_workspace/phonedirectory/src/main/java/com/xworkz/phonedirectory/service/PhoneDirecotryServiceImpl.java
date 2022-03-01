package com.xworkz.phonedirectory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.phonedirectory.entity.PhoneDirectoryEntity;
import com.xworkz.phonedirectory.repositroy.PhoneDirectoryRepositry;

@Component
public class PhoneDirecotryServiceImpl implements PhoneDirecotryService {
	@Autowired
	private PhoneDirectoryRepositry repo;

	public PhoneDirecotryServiceImpl(PhoneDirectoryRepositry repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndsave(PhoneDirectoryEntity directoryEntity) {
		boolean valid = false;
		if (directoryEntity.getName() != null && (directoryEntity.getName().length() > 3)
				&& (directoryEntity.getName().length() < 15)) {
			valid = true;
			System.out.println(directoryEntity.getName());
		} else {
			valid = false;
			System.out.println("invalid name");

		}

		if (String.valueOf(directoryEntity.getMobileNo()).length() == 10) {
			System.out.println(directoryEntity.getMobileNo());
			valid = true;
		} else {
			System.out.println("invalide mobile");
		}

		if (directoryEntity.getAdress() != null && (directoryEntity.getAdress().length() > 5)
				&& (directoryEntity.getAdress().length() < 300)) {
			valid = true;
			System.out.println(directoryEntity.getAdress());
		} else {
			valid = false;
			System.out.println("invalid adress");
		}
		if (directoryEntity.getLandMark() != null && (directoryEntity.getLandMark().length() > 5)
				&& (directoryEntity.getLandMark().length() < 300)) {
			valid = true;
			System.out.println(directoryEntity.getLandMark());
		} else {
			valid = false;
			System.out.println("invalid LandMark");
		}
		if (directoryEntity.getLandline() != 0) {
			valid = true;
			System.out.println(directoryEntity.getLandline());
		} else {
			valid = false;
			System.out.println("invalid Landline");
		}

		if (directoryEntity.getCity() != null && (directoryEntity.getCity().length() > 5)
				&& (directoryEntity.getCity().length() < 40)) {
			valid = true;
			System.out.println(directoryEntity.getCity());
		} else {
			valid = false;
			System.out.println("invalid City");
		}

		if (valid) {
			repo.save(directoryEntity);
		}
		return valid;
	}

}
