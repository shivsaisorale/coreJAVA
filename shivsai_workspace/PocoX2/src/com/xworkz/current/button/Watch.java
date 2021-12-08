package com.xworkz.current.button;

public class Watch {

	private String brand;
	private float price;
	private Object Watch;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Invoked tostring from watch");
		return "one string";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked tostring from watch");
		return 300;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("good u r not paasing null");

			if (obj instanceof Watch) {
				System.out.println("thats right you passed watch type ref only");
				Watch casted = (Watch) obj;
				String checkWith = casted.getBrand();
				if (this.Watch.equals(checkWith)) {
					System.out.println("the model no.is found both Ipods are same");
					return true;
				} else {
					System.out.println("just miss model no.is not matching ");
				}
			} else {

				System.err.println("the value that you passed is not a instance of Ipod");
			}

		}
		return false;
	}

}
