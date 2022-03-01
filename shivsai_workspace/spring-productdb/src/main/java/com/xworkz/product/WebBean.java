package com.xworkz.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.service.ProductService;

@Component
@RequestMapping("/")
public class WebBean {
	@Autowired
	private ProductService service;

	public WebBean() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("/gift.do")
	public String saveProduct(@RequestParam String name, @RequestParam String type, @RequestParam int quantity,
			@RequestParam float price) {
		System.out.println("Invoked product method");
		System.out.println(name);
		System.out.println(type);
		System.out.println(quantity);
		System.out.println(price);
		ProductEntity entity = new ProductEntity("name", "type", 1, 8.9f);
		service.validateAndSave(entity);
		return "/HomeProduct.html";
	}
}
