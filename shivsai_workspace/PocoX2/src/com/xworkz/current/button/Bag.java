package com.xworkz.current.button;

import Enum.BagColour;

public class Bag {

	float price;
	String sections;
	BagColour COLOR;
	
	public BagColour getCOLOR() {
		return COLOR;
	}
	public void setCOLOR(BagColour cOLOR) {
		COLOR = cOLOR;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked tostring from Bag");
		return "its two string";
	}

	public int hashCode() {
		System.out.println("Invoked tostring from Bag");
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("good u r not paasing null");

			if (obj instanceof Bag) {
				System.out.println("thats right you passed Bag type ref only");
				Bag casted = (Bag) obj;
				String checkWith = casted.getSections();
				if (this.sections.equals(checkWith)) {
					System.out.println("the model no.is found both Bag are same");
					return true;
				} else {
					System.out.println("just miss model no.is not matching ");
				}
			} else {

				System.err.println("the value that you passed is not a instance of Bag");
			}

		}
		return false;
	}

}
