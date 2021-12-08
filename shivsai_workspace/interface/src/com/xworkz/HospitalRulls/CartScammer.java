package com.xworkz.HospitalRulls;

import com.xworkz.cart.AmazonBusiness;
import com.xworkz.cart.AmazonCartDAO;
import com.xworkz.cart.ArrayAmazonCartDAO;
import com.xworkz.cart.CartDTO;

public class CartScammer {

	public static void main(String[] args) {

		CartDTO cartDTORef = new CartDTO("gadgets", 2, 2000.7f, "ear_phones");
		AmazonCartDAO amzonCartDAORef = new ArrayAmazonCartDAO();
		AmazonBusiness business = new AmazonBusiness(amzonCartDAORef);
		business.saveCart(cartDTORef);
		business.findCartByName(null);
		business.displayCart();

	}

}
