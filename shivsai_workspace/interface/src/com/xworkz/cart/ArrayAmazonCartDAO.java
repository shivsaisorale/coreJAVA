package com.xworkz.cart;

public class ArrayAmazonCartDAO implements AmazonCartDAO {

	private CartDTO[] dtos = new CartDTO[9];
	private int counter;

	@Override
	public boolean save(CartDTO cartDTO) {
		if (cartDTO != null && counter < dtos.length) {
			dtos[counter++] = cartDTO;
			return true;
		}
		return false;
	}

	@Override
	public CartDTO findByName(String name) {
		if (name != null) {
			for (int i = 0; i < dtos.length; i++) {
				CartDTO dtoRef = dtos[i];
				String nameRef = dtoRef.getName();
				if (name.equalsIgnoreCase(nameRef)) {

					return dtoRef;
				}
			}
		}

		return null;
	}

	@Override
	public void displayAllCartDetails() {
		for (int i = 0; i < dtos.length; i++) {
			CartDTO dtoRef = dtos[i];
			System.out.println(dtoRef.getName());
			System.out.println(dtoRef.getQuantity());
			System.out.println(dtoRef.getIteams());
			System.out.println(dtoRef.getPrice());
		}
	}

}
