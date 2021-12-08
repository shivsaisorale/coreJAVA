package com.xworkz.cart;

public class AmazonBusiness {

	AmazonCartDAO dao;

	public AmazonBusiness(AmazonCartDAO dao) {
		super();
		this.dao = dao;
	}

	public void saveCart(CartDTO cto) {
		if (cto != null) {
			boolean found = dao.save(cto);
			if (found) {
				System.out.println("invoked save method in ArrayAmazonCartDAO");
			} else {
				System.out.println("not saved");
			}
		} else {
			System.err.println("passed null value");
		}
	}

	public void findCartByName(CartDTO cto) {
		if (cto != null) {
			CartDTO cartDTORef = dao.findByName(cto.getName());
			if (cartDTORef != null) {
				System.out.println(cartDTORef.getName());
				System.out.println(cartDTORef.getIteams());
				System.out.println(cartDTORef.getPrice());
				System.out.println(cartDTORef.getQuantity());
			} else {
				System.err.println("returning null  value");
			}

		} else {
			System.out.println("passed null reference");
		}

	}

	public void displayCart() {
		if (dao != null) {
			dao.displayAllCartDetails();
		}
	}
}