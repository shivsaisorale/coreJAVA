package com.xworkz.current.button;

public class Ipod {

	private String modelNo;

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	@Override
	public String toString() {
		System.out.println("Invoked tostring from ipod");
		return "its two string";
	}

	public int hashCode() {
		System.out.println("Invoked tostring from ipod");
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("good u r not paasing null");

			if (obj instanceof Ipod) {
				System.out.println("thats right you passed Ipod type ref only");
				Ipod casted = (Ipod) obj;
				String checkWith = casted.getModelNo();
				if (this.modelNo.equals(checkWith)) {
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