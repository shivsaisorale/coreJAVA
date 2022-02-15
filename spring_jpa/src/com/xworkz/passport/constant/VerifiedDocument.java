package com.xworkz.passport.constant;

public enum VerifiedDocument {

	ADHAR("adharnum"),LICENCE("lnum"),MARSCARD("mcard");
	
	private String  document;
	
	private VerifiedDocument(String document) {
		this.document=document;
		System.out.println("shotting on ");
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
	
}


