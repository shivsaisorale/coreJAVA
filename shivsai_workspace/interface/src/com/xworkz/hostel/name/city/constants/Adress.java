package com.xworkz.hostel.name.city.constants;

public class Adress {

	private String atPost;
	private String Tal;
	private String dist;
	private int postlCode;
	
	public Adress() {
		System.out.println("invoked no arg const of class adres");
	}
	public Adress(String atpost, String tal,String dist,int postalCode) {

	this.atPost=atpost;
	Tal=tal;
	this.dist=dist;
	this.postlCode=postalCode;
	
	}
	public String getAtPost() {
		return atPost;
	}
	public void setAtPost(String atPost) {
		this.atPost = atPost;
	}
	public String getTal() {
		return Tal;
	}
	public void setTal(String tal) {
		Tal = tal;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public int getPostlCode() {
		return postlCode;
	}
	public void setPostlCode(int postlCode) {
		this.postlCode = postlCode;
	}
	
	}
