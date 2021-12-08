package com.xworkz.dp.dto;

public class WalletDTO {

private String companyName;
private String material;
private int compartments;
private float price;

public WalletDTO(){
	System.out.println("Invoked IPLDTO no-arg const");
	
	
}

public WalletDTO(String companyName, String material, int compartments, float price) {
	super();
	this.companyName = companyName;
	this.material = material;
	this.compartments = compartments;
	this.price = price;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public int getCompartments() {
	return compartments;
}

public void setCompartments(int compartments) {
	this.compartments = compartments;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

}