package com.xworkz.browser;

import javax.persistence.EntityManagerFactory;

import com.xworkz.internet.Internet;

public class ChromeBrowser implements Browser {

	private Internet internet;

	public ChromeBrowser(Internet internet) {
		this.internet=internet;
	}

	@Override
	public void surf() {
		System.out.println("invoked on browser");
		
	}

}
