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

		VendorDAO dao = new VendorDAOImpl();

		VendorService service = new VendorServiceImpl(dao);
		service.validAndSave(entity);

	}
}
