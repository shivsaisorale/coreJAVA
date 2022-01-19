package com.xworkz.tourscanner;

import com.xworkz.tour.dao.WebsiteDAO;
import com.xworkz.tour.dao.WebsiteDAOImpl;
import com.xworkz.website.WebsiteEntity;

public class WEbsiteQueryScanner {

	public static void main(String[] args) {
	
		WebsiteEntity entity=new WebsiteEntity();
		System.out.println();
		
		WebsiteDAO dao =new WebsiteDAOImpl();
		System.out.println(dao.getByLinkUrlx(entity));
		System.out.println(dao.getByNameGoogle(entity));
		System.out.println(dao.getByMaxSince(entity));
		System.out.println(dao.getByMinSince(entity));


		

	}

}
