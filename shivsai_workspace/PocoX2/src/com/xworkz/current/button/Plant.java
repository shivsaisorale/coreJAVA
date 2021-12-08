package com.xworkz.current.button;

public class Plant {

	String name;
	String alive;
	String lifeSpan;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlive() {
		return alive;
	}
	public void setAlive(String alive) {
		this.alive = alive;
	}
	public String getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Plant");
		return"its two string";
		}
	@Override
	public int hashCode() {
		System.out.println("Invoked tostring from Plant");
		return 300;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("good u r not paasing null");

			if (obj instanceof Plant) {
				System.out.println("that right you passed plant type ref only");
				Plant casted = (Plant) obj;
				String checkWith = casted.getAlive();
				if (this.alive.equals(checkWith)) {
					System.out.println("the model no.is found both Plant are same");
					return true;
				} else {
					System.out.println("just miss model no.is not matching ");
				}
			} else {

				System.err.println("the value that you passed is not a instance of Plant");
			}

		}
		return false;
	}


}
