package com.xworkz.scanner;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.dao.VendorDAOImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImpl;

public class VendorScanner {

	public static void main(String[] args) {

		VendorEntity entity = new VendorEntity("kiran", "kiran@gmail.com", "shivsais", "sai",
				"gandhicirclegoveschool12345678", "07AAECR2971CZ", "nagap", LocalDateTime.now(), "rachap",
				LocalDateTime.now());
		VendorEntity entity2 = new VendorEntity("sai12", "shiva@gmail.com", "12345678", "12345678",
				"gandhicirclegoveschool14445678", "07AAECR2972DZ", "umesha", LocalDateTime.now(), "ramesh",
				LocalDateTime.now());

		VendorDAO dao = new VendorDAOImpl();

		VendorService service = new VendorServiceImpl(dao);
//		service.validAndSave(entity);
//		service.validAndSave(entity2);

//		boolean valid = service.validedateAndFind("shivsais", "kiran123");
//		System.out.println(valid);

		service.validateAndChangePassword("shiva@gmail.com", "kiran123");
	

	}
}
