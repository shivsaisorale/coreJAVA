package com.xworkx.framework.collection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductDAO {

	private List<ProductDTO> list = new ArrayList<ProductDTO>();

	public ProductDAO() {
		ProductDTO productDTO1 = new ProductDTO("001", "MILK", 10, "NANDINI");
		ProductDTO productDTO2 = new ProductDTO("002", "cold drinks", 50, "Mazza");
		ProductDTO productDTO3 = new ProductDTO("003", "MAGGI", 30, "TEOMA");
		ProductDTO productDTO4 = new ProductDTO("004", "Shampoo", 2, "DOVE");
		ProductDTO productDTO5 = new ProductDTO("005", "Bag", 6, "Sky bags");
		ProductDTO productDTO6 = new ProductDTO("007", "POWDER", 14, "PONDS");
		ProductDTO productDTO7 = new ProductDTO("008", "Dress", 25, "ARMY");
		ProductDTO productDTO8 = new ProductDTO("009", "flywood", 20, "GreenPly Industries Ltd");
		ProductDTO productDTO9 = new ProductDTO("143", "Dove", 40, "Soap");
		ProductDTO productDTO10 = new ProductDTO("100", "police", 50, "civil police");

		this.list.add(productDTO1);
		this.list.add(productDTO2);
		this.list.add(productDTO3);
		this.list.add(productDTO4);
		this.list.add(productDTO5);
		this.list.add(productDTO6);
		this.list.add(productDTO7);
		this.list.add(productDTO8);
		this.list.add(productDTO9);

	}

	public ProductDTO find(Product match, ProductDTO dtoCompare) {
		Iterator<ProductDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			ProductDTO value = itr.next();

			System.out.println("using forEach method");
			list.forEach((ele) -> {
				System.out.println(ele);
			});

			ProductDTO temp = match.evaluate(value, dtoCompare);
			if (temp != null) {
				return temp;
			}

		}
		return null;

	}
}
