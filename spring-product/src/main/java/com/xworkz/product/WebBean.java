package com.xworkz.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.repository.ProductRepository;
import com.xworkz.product.repository.ProductRepositoryImpl;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImpl;

@Component
@RequestMapping("/")
public class WebBean {

	public WebBean() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
//
//	@GetMapping("/test")
//	public String getTestView() {
//		return "product";
//
//	}
//
//	public void addNewJob(@ModelAttribute("addNewJob") final ProductEntity entity) {
//		System.out.println("got dto:" + entity);
//
//	}
//
//	@ModelAttribute(value = "addNewJob")
//	public ProductEntity newentity() {
//		return new ProductEntity();
//
//	}
	@Autowired
	private ProductService productService;

	@RequestMapping("click.do")
	public String saveproduct(@RequestParam int id, @RequestParam String name, @RequestParam String type,
			@RequestParam double quantity, @RequestParam float price) {
		System.out.println("Invoked product method");
		System.out.println(id);
		System.out.println(name);
		System.out.println(type);
		System.out.println(quantity);
		System.out.println(price);
		ProductEntity entity=new ProductEntity(1,name, type, quantity, price);
		this.productService.validateAndSave(entity);
			
		return "/HomePage.html";
	}

}


