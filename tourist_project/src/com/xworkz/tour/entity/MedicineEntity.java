package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Medicine")
public class MedicineEntity {

@Id
@Column(name="m_id")
private	int id;
@Column(name="m_name")
private	String name;
@Column(name="m_colour")
private	String colour;
@Column(name="m_price")
private	float price;
@Column(name="m_noOftablet")
private	int noOftablet;

public MedicineEntity() {
	
}

public MedicineEntity(int id, String name, String colour, float price, int noOftablet) {
	super();
	this.id = id;
	this.name = name;
	this.colour = colour;
	this.price = price;
	this.noOftablet = noOftablet;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public int getNoOftablet() {
	return noOftablet;
}

public void setNoOftablet(int noOftablet) {
	this.noOftablet = noOftablet;
}

@Override
public String toString() {
	return "MedicineEntity [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + ", noOftablet="
			+ noOftablet + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((colour == null) ? 0 : colour.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + noOftablet;
	result = prime * result + Float.floatToIntBits(price);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MedicineEntity other = (MedicineEntity) obj;
	if (colour == null) {
		if (other.colour != null)
			return false;
	} else if (!colour.equals(other.colour))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (noOftablet != other.noOftablet)
		return false;
	if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
		return false;
	return true;
}

	

}
