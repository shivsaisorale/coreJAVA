package com.xworkz.browser;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.internet.Internet;

@Component
public class ChromeBrowser implements Browser {
	@Autowired
	private Internet internet1;

	public ChromeBrowser(Internet internet) {
		this.internet1 = internet1;
	}

	@Override
	public void surf() {
		
		this.internet1.connect();
		System.out.println("invoked on browser");

	}

}
